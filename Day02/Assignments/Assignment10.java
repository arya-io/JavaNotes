
/*
10. Write a Java program to multiply corresponding elements of two arrays of
integers.
Sample Output:
Array1: [1, 3, -5, 4]
Array2: [1, 4, -5, -2]
Result: 1, 12, 25, -8
*/

public class Assignment10 {
	public static void main(String args[]) {
		int array1[] = { 1, 3, -5, 4 };
		int array2[] = { 1, 4, -5, -2 };

		for (int tmp = 0; tmp < array1.length; tmp++) {
			System.out.print(array1[tmp] * array2[tmp] + " ");
			
		}

	}
}