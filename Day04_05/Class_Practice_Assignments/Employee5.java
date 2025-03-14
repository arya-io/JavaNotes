
public class Employee5 {

	String name, address;
	int yearOfJoining, salary;

	Employee5(String n, int y, int s, String a) {
		name = n;
		yearOfJoining = y;
		salary = s;
		address = a;
	}

	public void show() {
		System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + salary + "\t\t" + address);
	}

}
