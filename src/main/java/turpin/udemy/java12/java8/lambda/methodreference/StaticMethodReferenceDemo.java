package turpin.udemy.java12.java8.lambda.methodreference;

@FunctionalInterface //only works on functional interfaces
interface MethodReference {
	void helloMethodReference();
}

public class StaticMethodReferenceDemo { //does not implements the interface
	
	//Method must have the same paramters as above
	//The return type can be different
	//Method name can be different
	private static int helloMethodReferenceXyz() {
		System.out.println("From helloMethodReference!");
		return 0;
	}

	public static void main(String args[]) {
		MethodReference methodReference = StaticMethodReferenceDemo::helloMethodReferenceXyz;
		methodReference.helloMethodReference();
		
		MethodReference methodReferenceLambda = () -> StaticMethodReferenceDemo.helloMethodReferenceXyz();
		methodReferenceLambda.helloMethodReference();
	}
}
