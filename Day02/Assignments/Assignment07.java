
/*
7. Write a Java program to test if the first and the last element of an array of integers
are same. The length of the array must be greater than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:
False
*/

public class Assignment7 {

	public static void main(String[] args) {
		int array[] = { 50, -20, 30, 40, 60, 10 };
		if (array[0] == array[array.length - 1]) {
			System.out.println("First and last indexed element of array are same.");

		} else {
			System.out.println("First and last indexed element of array are not same.");

		}
	}

}
