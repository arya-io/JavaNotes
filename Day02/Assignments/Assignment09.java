
/*
9. Write a Java program to swap the first and last elements of an array (length must
be at least 1) and create a new array.
Sample Output:
Original Array: [20, 30, 40]
New array after swapping the first and last elements: [40, 30, 20]
*/

public class Assignment9 {

	public static void main(String[] args) {

		int array[] = { 20, 30, 40 };

		int start = 0, end = array.length - 1, tmp;
		tmp = array[start];
		array[start] = array[end];
		array[end] = tmp;

		System.out.println("New array after swapping the first and last elements:");

		for (tmp = 0; tmp < array.length; tmp++) {
			System.out.print(array[tmp] + " ");
		}

	}

}
