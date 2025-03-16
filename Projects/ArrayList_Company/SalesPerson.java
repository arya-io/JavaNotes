package profiles;

//SalesPerson class inherits from Employee
public class SalesPerson extends Employee {
	float commission; // Commission percentage for SalesPerson

	// Constructor to initialize SalesPerson details
	public SalesPerson(String name, String address, int age, String gender, float basicSalary, float commission) {
		super(name, address, age, gender, basicSalary); // Call the parent constructor
		this.commission = commission; // Set the commission for the SalesPerson
	}

	// Override the displayDetails method to include SalesPerson-specific details
	@Override
	public void displayDetails() {
		super.displayDetails(); // Call the parent class's method
		System.out.println("Employee Commission: " + this.commission); // Display commission specific to the SalesPerson
	}
}
