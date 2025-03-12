package profiles;

public class EntryPoint {

	public static void main(String[] args) {

		Employee[] arrEmployee = new Employee[50];

		int index = 0;

		int choice;

		final int ADD = 1;
		final int DISPLAY = 2;
		final int SORT = 3;
		final int EXIT = 4;

		while (true) {

			System.out.println("1. Add Employee Details");
			System.out.println("2. Display (All)");
			System.out.println("3. Sort Employees");
			System.out.println("4. Exit");

			System.out.print("\nEnter your choice: ");
			choice = ConsoleInput.getInteger();

			switch (choice) {

			case ADD: {

				int designation = 0;

				do {

					System.out.println("Choose Designation");
					System.out.println("1. Manager");
					System.out.println("2. Engineer");
					System.out.println("3. Salesperson");
					System.out.println("4. Go Back to Main Menu");

					designation = ConsoleInput.getInteger();

					if (designation == 4)
						break;

					System.out.println("Enter Name: ");
					String name = ConsoleInput.getString();

					System.out.println("Enter Address: ");
					String address = ConsoleInput.getString();

					System.out.println("Enter Age: ");
					int age = ConsoleInput.getInteger();

					System.out.println("Enter Gender: ");
					char gender = ConsoleInput.getChar();

					System.out.println("Enter Salary: ");
					float salary = ConsoleInput.getFloat();

					switch (designation) {

					case 1: {

						System.out.println("Enter HRA: ");
						float hra = ConsoleInput.getFloat();

						arrEmployee[index++] = new Manager(name, address, age, gender, salary, hra);

						System.out.println("Record For Manager Added Successfully..!!");
					}
						break;

					case 2: {

						System.out.println("Enter Overtime: ");
						float overTime = ConsoleInput.getFloat();

						arrEmployee[index++] = new Engineer(name, address, age, gender, salary, overTime);

						System.out.println("Record For Engineer Added Successfully..!!");
					}
						break;

					default:
						System.out.println("Error: Please Enter Correct Choice!");
						break;
					}

					while (designation != 4)
						;

				} while (true);

			}
				break;

			case DISPLAY: {

				for (int tmp = 0; tmp < index; tmp++) {

					System.out.println(arrEmployee[tmp]);
					System.out.println("*************************");
					String data = arrEmployee[tmp].display();
					System.out.println(data);
				}
			}

				break;

			case SORT: {

				for (int tmp = 0; tmp < index; tmp++) {

					if (arrEmployee[tmp] instanceof Manager) {

						System.out.println("Name: " + arrEmployee[tmp].getName());
						System.out.println("Address: " + arrEmployee[tmp].getAddress());
						System.out.println("Age: " + arrEmployee[tmp].getAge());
						System.out.println("Gender: " + arrEmployee[tmp].getGender());
						System.out.println("Salary: " + arrEmployee[tmp].getBasicSalary());

						Manager objManager = (Manager) arrEmployee[tmp];

						System.out.println("HRA: " + objManager.getHra());
					}
				}
			}

				break;

			case EXIT:

				System.out.println("Thank You..!!");
				break;

			default:

				break;

			}

		}
	}

}
