
public class Assignment13 {

	public static void main(String[] args) {

		System.out.print("Input a positive integer: ");
		int input = ConsoleInput.getInteger();
		int originalNum = input;
		int reverseNum = 0, digit, multiply = 1;
		while (originalNum != 0) {
			digit = originalNum % 10;
			reverseNum = (digit * multiply) + reverseNum;
			multiply *= 10;
			originalNum /= 10;
		}

		if (input == reverseNum) {
			System.out.println("Output: true");
		} else {
			System.out.println("Output: false");
		}
	}

}
