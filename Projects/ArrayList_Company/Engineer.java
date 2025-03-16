package profiles;

//Engineer class inherits from Employee
public class Engineer extends Employee {
	float overTime; // Overtime allowance for Engineer

	// Constructor to initialize Engineer details
	public Engineer(String name, String address, int age, String gender, float basicSalary, float overTime) {
		super(name, address, age, gender, basicSalary); // Call the parent constructor
		this.overTime = overTime; // Set overtime allowance for the engineer
	}

	// Override the displayDetails method to include Engineer-specific details
	@Override
	public void displayDetails() {
		super.displayDetails(); // Call the parent class's method
		System.out.println("Employee OverTime: " + this.overTime); // Display overtime specific to the Engineer
	}
}
