
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
