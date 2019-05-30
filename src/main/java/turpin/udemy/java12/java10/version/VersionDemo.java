package turpin.udemy.java12.java10.version;

public class VersionDemo {
	public static void main(String[] args) {
		Runtime.Version version = Runtime.version();

		System.out.println("Java full version: " + version);
		System.out.println("Feature: " + version.feature());
		System.out.println("Feature-Major: " + version.major());
		System.out.println("Interim: " + version.interim());
		System.out.println("Update: " + version.update());
		System.out.println("Patch: " + version.patch());
		
		/* From Java 10 version starts with 10, 11... Before the major version strats with 1.7, 1.8...
		 * 
		 * v 11.0.2 LTS
		 * Major version == Feature (11)
		 * Interim (0)
		 * Update (2)
		 * LTS: Long term support
		 * 
		 * */
	}

}