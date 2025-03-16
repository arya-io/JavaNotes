package containerCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_Code {
	
	public static void main(String [] args) {
		
		List<Integer> intList = Arrays.asList(10, 5, 80, 22, 11);
		
		Iterator<Integer> iter = intList.iterator();
		
		while(iter.hasNext()) {
			
			Integer data = iter.next();
			System.out.print(data + " ");
		}
		
	}

}
