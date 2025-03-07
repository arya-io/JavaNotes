
public class Entry {
	public static void main(String[] args) {

		try {

//			byte array is created to store user input
			byte[] arrInput = new byte[100];
			System.out.println("\nEnter the value: ");

//			Number of bytes read during input
			int length = System.in.read(arrInput);

//			Printing the length of input
			System.out.println("Length: " + length);

//			Creating a new byte array to store data without newline and carriage character
			byte[] arrFinal = new byte[length - 2];

//			Copy arrInput into arrFinal
			System.arraycopy(arrInput, 0, arrFinal, 0, length-2);

//			Converting byte array to a string
			String objstring = new String(arrFinal);

//			Printing final user input
			System.out.println("The value entered is: " + objstring);

		}

//		Catching Exception
		catch (Exception e) {

			System.out.println(e);
		}

	}
}
