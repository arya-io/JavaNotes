package containerCodes;

import java.util.Iterator;

public class Display3 {

	public static void show(Iterator<Integer> iter) {

		while (iter.hasNext()) {

			Integer data = iter.next();

			System.out.println(data);

		}
	}

}
