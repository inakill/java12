package turpin.udemy.java12.java8.stream.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortDemo2 {
	static class Point {
		Integer x, y;

	Point(Integer x, Integer y) { 
        this.x = x; 
        this.y = y; 
    }

		public String toString() {
			return this.x + ", " + this.y;
		}
	}

	
	public static void main(String[] args) {

		List<Point> aList = new ArrayList<>();
		aList.add(new Point(10, 20));
		aList.add(new Point(5, 10));
		aList.add(new Point(1, 100));
		aList.add(new Point(50, 2000));

		// displaying the stream with elements
		// sorted according to x coordinate
		aList.stream()
			.sorted((p1, p2) -> p1.x.compareTo(p2.x))
			.forEach(System.out::println);
		
		
		/* 
		 * prREvitables = prREvitables.stream().sorted((p1, p2) -> p1.getOrden().compareTo(p2.getOrden())).collect(Collectors.toList());
		 * 
		 * */
	}
}