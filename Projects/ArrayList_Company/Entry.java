package profiles;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// Custom exception for handling invalid option selection
class InvalidOptionException extends Exception {
	public InvalidOptionException(String message) {
		super(message); // Pass the message to the parent Exception class
	}
}

public class Entry {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
		ArrayList<Employee> arrEmployee = new ArrayList<>(); // Create an ArrayList to store Employee objects
		int choice = 0, option = 0; // Variables to store user menu choices
		final int ADD = 1, DISPLAY = 2, EXIT = 6; // Constants to define menu options

		// Main loop - continues until the user selects the Exit option
		while (choice != EXIT) {
			try {
				// Display the main menu
				System.out.println("\n1. Add");
				System.out.println("2. Display");
				System.out.println("3. Exit");
				System.out.print("\nEnter your choice: ");
				choice = scanner.nextInt(); // Read user's menu choice

				switch (choice) {
				case ADD:
					// Add new Employee - Nested loop for employee types
					while (option < 4) {
						// Display the employee types that can be added
						System.out.println("\n1. Manager");
						System.out.println("2. Engineer");
						System.out.println("3. SalesPerson");
						System.out.println("4. Exit");
						System.out.print("\nEnter your choice: ");
						option = scanner.nextInt(); // Read the user’s employee type selection

						// Check for valid options (1-3 for employee types, 4 for exit)
						if (option < 1 || option > 4) {
							throw new InvalidOptionException("Invalid option selected!"); // Throw custom exception for
																							// invalid options
						}

						if (option < 4 && option > 0) {
							// Take employee details from the user
							System.out.print("\nEnter Name: ");
							String name = scanner.next(); // Read name as String

							System.out.print("\nEnter Address: ");
							String address = scanner.next(); // Read address as String

							System.out.print("\nEnter Age: ");
							int age = scanner.nextInt(); // Read age as int

							System.out.print("\nEnter Gender: ");
							String gender = scanner.next(); // Read gender as String

							System.out.print("\nEnter Basic Salary: ");
							float basicSalary = scanner.nextFloat(); // Read basic salary as float

							// Based on the option, create a specific employee object
							switch (option) {
							case 1:
								// Add a Manager
								System.out.print("\nEnter HRA (House Rent Allowance): ");
								float hra = scanner.nextFloat(); // Read HRA for Manager
								arrEmployee.add(new Manager(name, address, age, gender, basicSalary, hra)); // Add
																											// Manager
																											// to the
																											// ArrayList
								break;
							case 2:
								// Add an Engineer
								System.out.print("Enter OverTime: ");
								float overTime = scanner.nextFloat(); // Read overTime for Engineer
								arrEmployee.add(new Engineer(name, address, age, gender, basicSalary, overTime)); // Add
																													// Engineer
																													// to
																													// the
																													// ArrayList
								break;
							case 3:
								// Add a SalesPerson
								System.out.print("Enter Commission: ");
								float commission = scanner.nextFloat(); // Read commission for SalesPerson
								arrEmployee.add(new SalesPerson(name, address, age, gender, basicSalary, commission)); // Add
																														// SalesPerson
																														// to
																														// the
																														// ArrayList
								break;
							case 4:
								continue; // Exit this loop
							}
							System.out.println("\nRecords Added Successfully..!!\n");
						}
					}
					break;

				case DISPLAY:
					// Display details of all Employees in the ArrayList
					for (Employee emp : arrEmployee) {
						System.out.println("``````````````````");
						emp.displayDetails(); // Call the displayDetails method for each employee
					}
					break;

				case EXIT:
					// Exit the program
					System.exit(0);
					break;

				default:
					// If the user enters an invalid choice
					System.out.println("Invalid choice. Please try again.");
					break;
				}
			} catch (InputMismatchException e) {
				// Catch block to handle invalid data type inputs (e.g., entering a string
				// instead of a number)
				System.out.println("Invalid input! Please enter the correct data type.");
				scanner.next(); // Clear the scanner buffer
			} catch (InvalidOptionException e) {
				// Catch block to handle invalid option exceptions
				System.out.println(e.getMessage()); // Print the error message from the exception
			} catch (Exception e) {
				// General catch block for any other exceptions
				System.out.println("An error occurred: " + e.getMessage());
			}
		}
		scanner.close(); // Close the scanner when done
	}
}
