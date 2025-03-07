
public class Assignment5 {

	public static void main(String args[]) {

		System.out.println("Enter seconds: ");

		int seconds = ConsoleInput.getInteger();

		System.out.println(seconds / 3600 + ":" + (seconds / 60) % 60 + ":" + seconds %60);
	}

}
