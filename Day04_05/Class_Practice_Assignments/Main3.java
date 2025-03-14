/*
3. Write a program to print the area of two rectangles having sides (4,5) and (5,8)  respectively by creating a class named 'Rectangle' with a method named 'area'  which returns the area and length and breadth passed as parameters to its  constructor.  
*/

public class Main3 {
	
	public static void main(String [] args) {
		
		Rectangle3 r1 = new Rectangle3(4, 5);
		Rectangle3 r2 = new Rectangle3(5, 8);
		
		r1.showArea();
		r2.showArea();
	}

}
