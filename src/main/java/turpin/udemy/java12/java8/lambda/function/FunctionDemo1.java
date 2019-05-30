package turpin.udemy.java12.java8.lambda.function;

import java.util.function.Function;

public class FunctionDemo1 {
	public static void main(String args[]) {
		beforeJava8();//Without Function Functional Interface
		fromJava8();//With Function Functional Interface
	}

	private static void beforeJava8() {

		Integer n1 = 5;
		Integer squareOfNumber = calculateSquareOfNumber(n1);
		System.out.println("From withoutFunction - Square of a number is :" + squareOfNumber);

	}

	// User defined method, this functionality is common in most of the Java
	// application
	private static Integer calculateSquareOfNumber(Integer n1) {
		return n1 * n1;
	}

	private static void fromJava8() {
		Function<Integer, Integer> function = n1 -> n1 * n1;
		System.out.println("From withFunction - Square of a number is :" + function.apply(5));
	}

}
