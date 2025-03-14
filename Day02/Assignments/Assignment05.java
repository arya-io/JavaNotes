
/*
5. Write a Java program to convert seconds to hour, minute and seconds.
Sample Output:
Input seconds: 86399
23:59:59
*/

public class Assignment5 {

	public static void main(String args[]) {

		System.out.println("Enter seconds: ");

		int seconds = ConsoleInput.getInteger();

		System.out.println(seconds / 3600 + ":" + (seconds / 60) % 60 + ":" + seconds %60);
	}

}
