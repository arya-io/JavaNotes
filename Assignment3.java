
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
