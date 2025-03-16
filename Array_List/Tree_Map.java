package containerCodes;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Map {

	public static void main(String[] args) {

		TreeMap<String, String> map = new TreeMap<>();

		map.put("First", "Mahesh");
		map.put("Third", "Mahesh");
		map.put("Second", "Hitesh");

		Set<String> keys = map.keySet();

		Iterator<String> iter = keys.iterator();

		while (iter.hasNext()) {

			String key = iter.next();
			System.out.println(key);

			String value = map.get(key);
			System.out.println(value);
		}
	}

}
