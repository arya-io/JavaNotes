package containerCodes;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Set {

	public static void main(String[] args) {

		TreeSet<String> intSet = new TreeSet<>();

		boolean status = false;

		status = intSet.add("Nilesh");

		if (status)
			System.out.println("First time Nilesh added.");

		intSet.add("Ajay");
		intSet.add("Bhim");
		intSet.add("Mahesh");

		status = intSet.add("Nilesh");

		if (status)
			System.out.println("Nilesh added second time.");
		else
			System.out.println("Nilesh did not get added.");

		Iterator<String> iter = intSet.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());
		}
	}

}
