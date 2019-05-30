package turpin.udemy.java12.java8.functionalinterface;

@FunctionalInterface
interface MyInterface {
	public void method1();
}

//@FunctionalInterface
interface MyInterface2 {
	public void method1();

	// A Functional Interface can't have more than 1 abstract method
	// Please uncomment the below code and check the compilation error
	public void method2();
}

@FunctionalInterface
interface DefaultInterface {
	public void method1();

	// Note:Functional Interface can have default methods

	default public void method2() {
		System.out.println("From method2 ");
	}

	default public void method3() {
		System.out.println("From method2 ");
	}
}

@FunctionalInterface
interface StaticInterface {
	public void method1();

	// Note:Functional Interface can have static methods

	static public void method2() {
		System.out.println("From method2 ");
	}

	static public void method3() {
		System.out.println("From method2 ");
	}
}

@FunctionalInterface
interface EqualInterface {
	public void method1();

	// Note:Functional Interface can have methods of java.lang.Object

	public boolean equals(Object obj);
}

public class FunctionalInterfaceDemo implements EqualInterface {

	public static void main(String args[]) {
		FunctionalInterfaceDemo obj = new FunctionalInterfaceDemo();
		obj.method1();
	}

	@Override
	public void method1() {
		System.out.println("Overriding Method1");

	}
}



/*
 * Lambda Expressions can be used only with Functional Interface, in the code
 * FunctionalInterface1 is not a Functional Interface, Functional Interface Must
 * contain an abstract method
 */
interface FunctionalInterface1 {
	default public int addTwoNumbers(int number1, int number2) {
		int sum = number1 + number2;
		return sum;
	}
}
//public class FunctionalInterfaceQuiz {
//	public static void main(String args[]) {
//		FunctionalInterface1 functionalInterface1 =(a,b) -> a+b;
//		int sum = functionalInterface1.addNumbers(100, 200);
//		System.out.println("Sum of two numbers is: " + sum);
//	}
//}


