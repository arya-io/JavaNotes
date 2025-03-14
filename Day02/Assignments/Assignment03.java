
/*
3. Write a Java program to create & display unique three-digit number using 1, 2, 3, 4.
Also count how many three-digit numbers are there.
Expected Output
123
124
...
431
432
Total number of the three-digit-number is 24
*/

public class Assignment3 {

	public static void main(String args[]) {

		int num, count = 0;
		for (int firstloop = 1; firstloop <= 4; firstloop++) {
			for (int secondloop = 1; secondloop <= 4; secondloop++) {
				for (int thirdloop = 1; thirdloop <= 4; thirdloop++) {

					if (firstloop != secondloop && secondloop != thirdloop && firstloop != thirdloop) {

						num = firstloop * 100 + secondloop * 10 + thirdloop;
						System.out.println(num);
						count++;
					}
				}
			}

		}

		System.out.println("\nTotal number of the three-digit number is: " + count);
	}

}
