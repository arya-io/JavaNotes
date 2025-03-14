
public class Main6 {

	public static void main(String [] args) {
		
		int salary, hours;
		
		System.out.print("\nEnter Salary: ");
		salary = ConsoleInput.getInteger();
		
		System.out.print("Enter no. of work hours: ");
		hours = ConsoleInput.getInteger();
		
		Employee6 emp = new Employee1();
		
		emp.getInfo(salary, hours);
		emp.addSal();
		emp.addWork();
		emp.display();
		
		
	}
}
