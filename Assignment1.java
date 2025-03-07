
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