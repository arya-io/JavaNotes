public class EntryPoint {
    public static void main(String[] args) {
        System.out.println("Enter the day:");
        int day = ConsoleInput.getInteger();

        System.out.println("Enter the month:");
        int month = ConsoleInput.getInteger();

        System.out.println("Enter the year:");
        int year = ConsoleInput.getInteger();

        MyDate dateObj = new MyDate();

        if (day > 31 || day < 1 || month > 12 || month < 1 || year > 9999 || year < 1000) {
            System.out.println("Invalid Date, please enter a valid date");
        } else {
            dateObj.setDate(day, month, year);
            System.out.println("Current Date: " + dateObj.getDay() + "/" + dateObj.getMonth() + "/" + dateObj.getYear());

            int option = 0;

            do {
                System.out.println("Select an option:");
                System.out.println("1. Add Days");
                System.out.println("2. Add Months");
                System.out.println("3. Add Years");
                System.out.println("4. Exit");

                option = ConsoleInput.getInteger();

                switch (option) {
                    case 1:
                        System.out.println("Enter days to add:");
                        int addDays = ConsoleInput.getInteger();
                        dateObj.addDays(addDays, day, month, year);
                        break;

                    case 2:
                        System.out.println("Enter months to add:");
                        int addMonths = ConsoleInput.getInteger();
                        dateObj.addMonths(addMonths, day, month, year);
                        break;

                    case 3:
                        System.out.println("Enter years to add:");
                        int addYears = ConsoleInput.getInteger();
                        dateObj.addYears(addYears, day, month, year);
                        break;

                    case 4:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            } while (option != 4);
        }
    }
}
