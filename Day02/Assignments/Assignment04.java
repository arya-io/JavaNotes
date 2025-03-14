
/*
4. Write a Java program that accepts three integers from the user and return true if
the second number is greater than first number and third number is greater than
second number.
Sample Output:
Input the first number : 5
Input the second number: 10
Input the third number : 15
The result is: true
*/

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
