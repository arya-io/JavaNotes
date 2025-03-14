/*
5. Write a program that would print the information (name, year of joining, salary,  address) of three employees by creating a class named 'Employee'. The output  should be as follows:  
Name Year of joining Address  
Robert 1994 64C- WallsStreat  
Sam 2000 68D- WallsStreat  
John 1999 26B- WallsStreat  
*/

public class Main5 {
	
	public static void main(String [] args) {
		
		System.out.println("Name\tYears of Joining\t Salary\t\tAddress");
		
		Employee5 emp1 = new Employee("Robert", 1994, 1000000, "64C- WallStreet");
		Employee5 emp2 = new Employee("Sam", 2000, 1900000, "68D- WallStreet");
		Employee5 emp3 = new Employee("John", 1999, 2000000, "26B- WallStreet");
		
		emp1.show();
		emp2.show();
		emp3.show();
	}
}
