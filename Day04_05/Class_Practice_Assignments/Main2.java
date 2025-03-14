/*
2. Write a program to print the area and perimeter of a triangle having sides of 3, 4  and 5 units by creating a class named 'Triangle' with constructor having the three  sides as its parameters.  
*/

public class Main2 {

	public static void main(String[] args) {

		Triangle2 t = new Triangle2(3, 4, 5);

		System.out.println("The perimeter of Triangle is: " + t.Perimeter());
		System.out.println("The area of Triangle is: " + t.Area());
	}
}
