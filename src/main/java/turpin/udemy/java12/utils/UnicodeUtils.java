package turpin.udemy.java12.utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 1. Introducir el path absoluto del fichero de properties.
 * 1.5. O bien, introducir la linea que se quiera codificar.
 * 2. El matcher con la expresion regular detecta los caracteres que no son alfanumericos estandar ni signos de puntuacion. Se ignoran los espacios.
 * 3. MatcherResult lista los GRUPOS de caracteres que no cumplen el patron.
 * 4. Los caracteres son cambiados por su valor en unicode.
 * 5. Copiar el resultado de la consola.
 *  
 * @see https://www.compart.com/en/unicode/U+00F1*/
public class UnicodeUtils {


	public static void main(String[] args) {
		String fileText = importPropertiesFile("C:\\Users\\INAROD\\Documents\\Git\\eritia\\Dulcinea\\java\\Dulcinea2\\dulcinea2Doc\\src\\main\\resources\\marcas\\default\\estudiomaquinas\\EstudioMaquinas.properties");
		System.out.println(replaceUnicodeCharsDynamic(fileText));
	}

	private static String importPropertiesFile(String path) {
		try (InputStream input = new FileInputStream(path);
				BufferedReader br = new BufferedReader(new InputStreamReader(input, Charset.defaultCharset()))) {

			return br.lines().collect(Collectors.joining(System.lineSeparator()));

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return null;
	}

	public static String replaceUnicodeCharsDynamic(String rawText) {
		String regex = "[^\\p{Alnum}^\\p{Punct}^\\s+]*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(rawText);
		String resAux;
		List<String> auxChars;
		
		while(matcher.find()) {
			resAux = matcher.toMatchResult().group();
			
			if(!resAux.isEmpty()) {
				System.out.println("Caracter especial encontrado: " + resAux );
				
				if(resAux.length() > 1) {
					auxChars = Arrays.asList(resAux.split("")).stream().collect(Collectors.toList());
					
					for (String s : auxChars) {
						rawText = replaceWithUnicode(rawText, s);
					}
					
				} else {
					rawText = replaceWithUnicode(rawText, resAux);
					
				}
			}
		}
		
		return rawText;
	}

	public static String replaceWithUnicode(String rawText, String resAux) {
		return  rawText.replaceAll(resAux, "\\\\u" + Integer.toHexString(resAux.codePointAt(0) | 0x10000).substring(1));
	}

	@Deprecated
	public static String replaceUnicodeCharsStatic(String rawText) {
		rawText = rawText.replaceAll("ñ", "\\\\u00F1");
		rawText = rawText.replaceAll("á", "\\\\u00E1");
		rawText = rawText.replaceAll("é", "\\\\u00E9");
		rawText = rawText.replaceAll("í", "\\\\u00ED");
		rawText = rawText.replaceAll("ó", "\\\\u00F3");
		rawText = rawText.replaceAll("ú", "\\\\u00FA");
		rawText = rawText.replaceAll("Á", "\\\\u00C1");
		rawText = rawText.replaceAll("É", "\\\\u00C9");
		rawText = rawText.replaceAll("Í", "\\\\u00CD");
		rawText = rawText.replaceAll("Ó", "\\\\u00D3");
		rawText = rawText.replaceAll("Ú", "\\\\u00DA");
		rawText = rawText.replaceAll("ñ", "\\\\u00F1");
		rawText = rawText.replaceAll("Ñ", "\\\\u00D1");
		return rawText;
	}


}
