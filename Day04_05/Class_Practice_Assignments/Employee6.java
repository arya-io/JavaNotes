
public class Employee6 {

	private int salary, hours;
	
	public void getInfo(int s, int h) {
		salary = s;
		hours = h;
	}
	
	public void addSal() {
		if(salary < 500) salary += 10;
	}
	
	public void addWork() {
		if(hours > 6) salary += 5;
	}
	
	public void display() {
		System.out.print("\nSalary: " + salary);
		System.out.print("\nWork Hours: " + hours);
	}
}
