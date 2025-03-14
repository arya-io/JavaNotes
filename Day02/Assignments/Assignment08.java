
/*
8. Write a Java program to rotate an array (length 7) of integers in left direction. The
rotated data should be stored in a new array.
Sample Output:
Original Array: [10,20, 30, 40,50,60,70]
Rotated Array: [70,60,50,40,30,20,10]
*/

public class Assignment8 {

	public static void main(String[] args) {
		int array[] = { 10, 20, 30, 40, 50, 60 };

		int start = 0, end = array.length - 1, tmp;

		while (start < end) {
			tmp = array[start];
			array[start] = array[end];
			array[end] = tmp;
			start++;
			end--;
		}

		for (tmp = 0; tmp < array.length; tmp++) {
			System.out.print(array[tmp] + " ");

		}

	}

}
