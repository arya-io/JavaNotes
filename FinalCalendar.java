
public class FinalCalendar {

	public static void main(String[] args) {

		System.out.println("Welcome to Calendar");
		System.out.println("--------------------------");
		
		boolean flag = true;

		while (flag == true) {

			System.out.println("\n\nPress 1 to Set Date");
			System.out.println("Press 2 to Add Days");
			System.out.println("Press 3 to Add Months");
			System.out.println("Press 4 to Add Years");
			System.out.println("Press 5 to Compare Dates");
			System.out.println("Press 6 to Exit");
			
			int year = 0, month, date;

			int choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {
				System.out.print("Enter Year: ");
				year = ConsoleInput.getInteger();
				System.out.print("Enter Month: ");
				month = ConsoleInput.getInteger();
				System.out.print("Enter Day: ");
				date = ConsoleInput.getInteger();
				if ((year > 1600) && (year < 2400)) {

				} else {
					System.out.println("Invalid Input. Please enter correct input..!!");
				}
				if (month < 1 && month > 12) {
					System.out.println("Invalid input");
				}

				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
					if (!(date <= 31 && date >= 1)) {
						System.out.println("Invalid input");
					}
				} else if (month == 4 || month == 6 || month == 9 || month == 11) {
					if (!(date <= 30 && date >= 1)) {
						System.out.println("Invalid input");
					}
				} else if (month == 2) {
					if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
						if (date >= 1 && date <= 29) {

						}
					} else {
						if (date >= 1 && date <= 28) {

						}
					}
				}

				System.out.print(date + "/" + month + "/" + year);

			}
				break;
			case 2: {
				int days = ConsoleInput.getInteger();
			}
				break;
			case 3: {
				int months = ConsoleInput.getInteger();
			}
				break;
			case 4: {
				int years = ConsoleInput.getInteger();
				
				year = year + years;
			}
				break;
			case 5: {
				System.out.print("");
			}
				break;
			case 6: {
				flag = false;
			}
				break;
			default: {
				System.out.print("Enter Valid Input....... ");
			}
				break;
			}

		}
	}

}
