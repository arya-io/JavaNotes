/*
1. Create a class named 'Student' with String variable 'name' , integer variable  'roll_no'., String variable ‘phone_no’ and String variable ‘address’  a. Assign the value of roll_no as '2' and that of name as "John" by creating an  object of the class Student.  
b. Assign and print the roll number, phone number and address of two students  having names "Sam" and "John" respectively by creating two objects of class  'Student'.  
*/

public class Student1 {
	
	String name, phone_no, address;
	int roll_no;
	
	public static void main(String [] args) {
		
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();
		
		s1.name = "John";
		s1.roll_no = 2;
		s1.phone_no = "9874563210";
		s1.address = "Nagpur";
		
		s2.name = "Sam";
		s2.roll_no = 1;
		s2.phone_no = "9874563219";
		s2.address = "Pune";
		
		System.out.println("Details of John:");
		System.out.println("Name: " + s1.name);
		System.out.println("Roll No.: " + s1.roll_no);
		System.out.println("Phone No.: " + s1.phone_no);
		System.out.println("Name: " + s1.address);
		
		System.out.println("\nDetails of Sam:");
		System.out.println("Name: " + s2.name);
		System.out.println("Roll No.: " + s2.roll_no);
		System.out.println("Phone No.: " + s2.phone_no);
		System.out.println("Name: " + s2.address);
	}
}
