package turpin.udemy.java12.java8.defaultmethod;

interface DefaultMethodDemo2 {
	public default int addTwoNumber(int number1, int number2) {
		return number1 + number2;// Common Code
	}

	public default int multiplyTwoNumber2(int number1, int number2) {
		return number1 * number2;// Common Code
	}
}

class Class1 implements DefaultMethodDemo2 {
	public int addNumbers(int number1, int number2) {
		// reuse common code
		return addTwoNumber(number1, number2);
	}
}

class Class2 implements DefaultMethodDemo2 {
	// It is not compulsory to implement default method

}

class Class3 implements DefaultMethodDemo2 {
	public int addNumbers(int number1, int number2) {
		// reuse common code
		return addTwoNumber(number1, number2);
	}
}

public class DefaultMethodDemoFromJava8 {

	public static void main(String args[]) {

		Class1 class1 = new Class1();
		int sum = class1.addNumbers(100, 200);
		System.out.println("Sum of two numbers is: " + sum);

	}
}
