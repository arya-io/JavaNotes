package containerCodes;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set3 {

	public static void main(String[] args) {

		TreeSet<Student3> set = new TreeSet<>();

		set.add(new Student3(10, "Mahesh"));
		set.add(new Student3(5, "Ritesh"));
		set.add(new Student3(2, "Rajesh"));
		set.add(new Student3(1, "Ajay"));

		Iterator<Student3> iter = set.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());
		}
	}

}
