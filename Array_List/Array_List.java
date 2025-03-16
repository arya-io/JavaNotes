package containerCodes;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<>(3);

		intList.add(10);
		intList.add(7);
		intList.add(9);
		intList.add(1);
		intList.add(7);

		Iterator<Integer> iter = intList.iterator();

		while (iter.hasNext()) {

			Integer data = iter.next();
			System.out.println(data);
		}

	}

}
