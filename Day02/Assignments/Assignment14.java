/*
14. Write a Java program to find the index of a value in a sorted array. If the value
does not find return the index where it would be if it were inserted in order.
Example:
[1, 2, 4, 5, 6] 5(target) -> 3(index)
[1, 2, 4, 5, 6] 0(target) -> 0(index)
[1, 2, 4, 5, 6] 7(target) -> 5(index)*/

public class Assignment14 {

	public static void main(String [] args) {
		int arr[] = {1, 2, 4, 5, 6};
		
		int start = 0, end = arr.length;
		
		System.out.print("Enter target: ");
		
		int target = ConsoleInput.getInteger(), mid = 0;
		
		boolean flag = false;
		
		while(start < end) {
			
			mid = ((start + end - 1)) / 2;
			
			if(target == arr[mid]) {
				System.out.println(target + " present at index " + mid);
				flag = true;
				break;
			}
			else if(target > arr[mid]) {
				start = mid + 1;
			}
			else {
				end = mid;
			}
			
		}
		
		if(flag == false) {
			System.out.println(target + " must be present at index: " + start);
		}
	}
	
}
