
/*
1. Write a Java program to print the area and perimeter of a circle, take the Radius
as an input from the user.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/

public class Assignment1 {

	public static void main(String[] args) {
		
		System.out.println("Enter radius of circle: ");

		float radius = ConsoleInput.getFloat();

		double perimeter = 2 * 3.142 * radius;

		double area = 3.142 * radius * radius;
	
		System.out.println("\nPerimeter of Circle with radius " + radius + " is: " + perimeter);
		System.out.println("Area of Circle with radius " + radius + " is: " + area);
	}
	
}