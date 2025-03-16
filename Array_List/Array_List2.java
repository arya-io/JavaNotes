package containerCodes;

import java.util.ArrayList;
import java.util.ListIterator;

public class Array_List2 {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<>();
//		Default value is 10

		intList.add(10);
		intList.add(7);
		intList.add(9);
		intList.add(1);
		intList.add(7);

		Display3.show(intList.iterator());
	}

}
