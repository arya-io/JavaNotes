package containerCodes;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Tree_Set2 {

	public static void main(String[] args) {

		TreeSet<String> intSet = new TreeSet<>();

		String name = null;

		try (Scanner scanner = new Scanner(System.in);) {

			do {
				System.out.println("Enter the name: ");

				name = scanner.next();

				if (!name.equals("exit"))
					intSet.add(name);
			} while (!name.equals("exit"));
		}

		Iterator<String> iter = intSet.iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());
		}

	}

}
