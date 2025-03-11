public class DateProgram {

    private static int day, month, year;

    public static void main(String[] args) {
        int choice = 0;
        final int SET_DATE = 1;
        final int ADD_DAYS = 2;
        final int ADD_MONTHS = 3;
        final int ADD_YEARS = 4;
        final int EXIT = 5;

        while (choice != EXIT) {
            System.out.println("\nMenu:");
            System.out.println("1. Set Date");
            System.out.println("2. Add Days");
            System.out.println("3. Add Months");
            System.out.println("4. Add Years");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = ConsoleInput.getInteger();

            switch (choice) {
                case SET_DATE:
                    setDate();
                    break;
                case ADD_DAYS:
                    addDays();
                    break;
                case ADD_MONTHS:
                    addMonths();
                    break;
                case ADD_YEARS:
                    addYears();
                    break;
                case EXIT:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }

    private static void setDate() {
        System.out.print("Enter day: ");
        day = ConsoleInput.getInteger();
        System.out.print("Enter month: ");
        month = ConsoleInput.getInteger();
        System.out.print("Enter year: ");
        year = ConsoleInput.getInteger();

        if (!validateDate()) {
            System.out.println("Invalid date entered. Please try again.");
            setDate();
        } else {
            System.out.println("Date set successfully: " + displayDate());
        }
    }

    private static boolean validateDate() {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > getDaysInMonth(month, year)) return false;
        return true;
    }

    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    private static void addDays() {
        System.out.print("Enter number of days to add: ");
        int daysToAdd = ConsoleInput.getInteger();

        day += daysToAdd;
        while (day > getDaysInMonth(month, year)) {
            day -= getDaysInMonth(month, year);
            addMonths(1);
        }

        System.out.println("Updated Date: " + displayDate());
    }

    private static void addMonths() {
        System.out.print("Enter number of months to add: ");
        int monthsToAdd = ConsoleInput.getInteger();
        addMonths(monthsToAdd);
        System.out.println("Updated Date: " + displayDate());
    }

    private static void addMonths(int monthsToAdd) {
        month += monthsToAdd;
        while (month > 12) {
            month -= 12;
            year++;
        }

        if (day > getDaysInMonth(month, year)) {
            day = getDaysInMonth(month, year);
        }
    }

    private static void addYears() {
        System.out.print("Enter number of years to add: ");
        int yearsToAdd = ConsoleInput.getInteger();
        year += yearsToAdd;

        if (month == 2 && day == 29 && !isLeapYear(year)) {
            day = 28;
        }

        System.out.println("Updated Date: " + displayDate());
    }

    private static String displayDate() {
        return String.format("%02d/%02d/%d", day, month, year);
    }
}
