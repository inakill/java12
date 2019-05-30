package turpin.udemy.java12.java10.typeinference;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;


public class VarDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		// Before Java10
		String firstName = "Java";
		String lastName = "FastForward";
		Date dateOfBirth = new Date();
		int salary = 50000;
		URL url = new URL("http://javafastforward.com/");
		URLConnection urlConnection = url.openConnection();
		HashMap<Integer, String> studentMap = new HashMap<>();
		// Assign to null
		String stringWithNoInitiazation;
		String stringWithNull = null;

		// From Java10
		var firstName2 = "Java";
		var lastName2 = "FastForward";
		var dateOfBirth2 = new Date();
		var salary2 = 50000;
		var url2 = new URL("http://javafastforward.com/");
		var urlConnection2 = url.openConnection();
		var studentMap1 = new HashMap<>();
		// Cannot assign var to null
		// var stringWithNoInitiazation1;
		// var stringWithNull1 = null;

		// Compiler infers based on the values and perform the required operation
		System.out.println(salary2 + salary2);
		System.out.println(firstName2 + lastName2);

	}
}
