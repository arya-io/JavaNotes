
public class Assignment4 {

	public static void main(String args[]) {

		System.out.println("Enter first number: ");
		int firstNum = ConsoleInput.getInteger();
		
		System.out.println("Enter second number: ");
		int secondNum = ConsoleInput.getInteger();
		
		System.out.println("Enter third number: ");
		int thirdNum = ConsoleInput.getInteger();
		
		if(secondNum > firstNum && thirdNum > secondNum) {
			
			System.out.println("\nThe Result is: True.");
		}
		else {
			System.out.println("\nThe Result is: False.");			
		}

	}

}
