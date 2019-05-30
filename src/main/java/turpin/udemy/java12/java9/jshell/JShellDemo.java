package turpin.udemy.java12.java9.jshell;

public class JShellDemo {

	// On cmd:
	// >jshell
	// jshell> System.out.println("Hello");
	// jshell> 
	// jshell> /exit 
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(100+200);
	}
	
	/*
	jshell> /open Test.java

	jshell> /list
	
	   1 : class Test {
	           public static void main(String[] args) {
	               System.out.println("Hello Kavitha");
	           }
	           int rollDice() {
	               return 1 + (int)(6 * Math.random());
	           }
	       }
	
	jshell> Test.main(new String[0])
	Hello Kavitha
	
	jshell> new Test().rollDice()
	$3 ==> 3
	
	*/
}