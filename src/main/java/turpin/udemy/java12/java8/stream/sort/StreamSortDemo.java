package turpin.udemy.java12.java8.stream.sort;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo {

	public static void main(String args[]) {
		List<Integer> javaVersionList = new ArrayList<>();
		
		javaVersionList.add(8);
		javaVersionList.add(9);
		javaVersionList.add(12);
		javaVersionList.add(10);
		javaVersionList.add(7);
		javaVersionList.add(11);
		

	System.out.println("javaVersionList:"+javaVersionList);
	List<Integer> javaVersionSortedList = javaVersionList
		.stream()
		.sorted()
		.collect(Collectors.toList());
	
	System.out.println("javaVersionSortedList:"+javaVersionSortedList);
		

	}

}
