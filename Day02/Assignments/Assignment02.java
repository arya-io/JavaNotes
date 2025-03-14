/*
2. Write a Java Program which accepts the number of integer values the user wishes
to enter, then accept all integer values and display the same. Now add the numbers
and display the result
Test :
Enter the number of integer values you wish to add
10
Enter the value
29
Enter the value
99
Enter the value .......
Expected Output
Total of the above values
*/

public class Assignment2 {

public static void main(String args []) {
	
		System.out.println("Please enter number of integer values you wish to enter..!!\n");
		
		int iterations = ConsoleInput.getInteger();
		
		int sum = 0;
		
		for(int userinput = 0; userinput < iterations; userinput++) {
			
			System.out.println("\nEnter a number:");
			sum += ConsoleInput.getInteger();
			
		}
		
		System.out.println("\nThe sum is: " + sum);
	}

}
