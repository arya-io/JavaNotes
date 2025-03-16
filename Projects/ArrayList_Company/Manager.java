package profiles;

//Manager class inherits from Employee
public class Manager extends Employee {
	float hra; // House Rent Allowance for Manager

	// Constructor to initialize Manager details
	public Manager(String name, String address, int age, String gender, float basicSalary, float hra) {
		super(name, address, age, gender, basicSalary); // Call the parent constructor
		this.hra = hra; // Set the HRA for the manager
	}

	// Override the displayDetails method to include Manager-specific details
	@Override
	public void displayDetails() {
		super.displayDetails(); // Call the parent class's method
		System.out.println("Employee HRA: " + this.hra); // Display HRA specific to the Manager
	}
}
