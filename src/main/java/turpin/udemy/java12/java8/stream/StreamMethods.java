package turpin.udemy.java12.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	static List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

	public static void main(String args[]) {
		streamMap();
		streamFlatMap();
		streamIterate();
		methods();
	}

	public static void streamMap() {
		List<Integer> squareList = intList.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("squareList: " + squareList);

	}

	public static void streamFlatMap() {
		List<Integer> squareList = intList.stream().flatMap(i -> Stream.of(i * i, i + i)).collect(Collectors.toList());
		System.out.println("squareList: " + squareList);

	}

	public static void streamIterate() {
		// Stream.iterate(1, i -> i + i).forEach(System.out::println);
		Stream.iterate(1, i -> i + i).limit(10).forEach(System.out::println);

	}
	
	
	public static void methods() {
		boolean anyGreaterThanZero = intList.stream().anyMatch(i -> i>0);
		System.out.println("Any greater than 0: " + anyGreaterThanZero);
		
		boolean allSmallerThan100 = intList.stream().allMatch(i -> i <100);
		System.out.println("All smaller than 100: " + allSmallerThan100);
		
		long evenNumbers = intList.stream().filter(i -> i%2==0).count();
		System.out.println("Even numbers: " + evenNumbers);
		/* Long totalMediaE = valoracion.getPrEraMedicion().stream()
				.filter(o -> Objects.nonNull(o.getPrEraComponenteE().getValor())).count();
		*/
		Optional<Integer> any = intList.stream().findAny();
		Integer anyNumber = any.isPresent() ? any.get() : 0;
		System.out.println("Any number: " + anyNumber);

	}

}
