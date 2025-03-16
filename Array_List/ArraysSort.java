package containerCodes;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class ArraysSort {

	public static void main(String [] args) {
		
		Student3 [] arrStudent = {
				new Student3(10, "Mahesh"),
				new Student3(4, "Ajay"),
				new Student3(8, "Amit"),
				new Student3(3, "Rajesh"),
		};
		
		System.out.println("Before sorting: ");
		
		for(Student3 objStudent: arrStudent) {
			
			System.out.println(objStudent);
		}
		
		Arrays.sort(arrStudent, new StudentComparator(1, 1));
		
		System.out.println("After sorting: ");
		
		for(Student3 objStudent : arrStudent)
			System.out.println(objStudent);
	}

}
