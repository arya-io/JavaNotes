
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
