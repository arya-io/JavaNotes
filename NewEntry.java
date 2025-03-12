public class Entry {
    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();
        cal.start();
    }

    public static float readFloat() {
        try {
            String input = getInput();
            return Float.parseFloat(input);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a float value.");
        }
        return -1;
    }

    public static int readInt() {
        try {
            String input = getInput();
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter an integer.");
        }
        return -1;
    }

    private static String getInput() {
        try {
            byte[] buffer = new byte[100];
            int length = System.in.read(buffer);
            String data = new String(buffer, 0, length).trim();
            if (data.isEmpty()) {
                System.out.println("Input cannot be empty.");
                return "";
            }
            return data;
        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
        return "";
    }
}

MyCalendar.java

package Class_Practice;

public class MyCalendar {

    public void start() {
        System.out.print("Enter year: ");
        int year = Entry.readInt();

        System.out.print("Enter month (1-12): ");
        int month = Entry.readInt();

        System.out.print("Enter day: ");
        int day = Entry.readInt();

        System.out.println("Initial Date: " + day + "/" + month + "/" + year);

        System.out.print("Enter days to add: ");
        int addDays = Entry.readInt();
        day += addDays;

        while (day > getDaysInMonth(month, year)) {
            day -= getDaysInMonth(month, year);
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.print("Enter months to add: ");
        int addMonths = Entry.readInt();
        month += addMonths;

        while (month > 12) {
            month -= 12;
            year++;
        }

        System.out.print("Enter years to add: ");
        int addYears = Entry.readInt();
        year += addYears;

        System.out.println("Updated Date: " + day + "/" + month + "/" + year);
    }

    private int getDaysInMonth(int month, int year) {
        if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        return 31;
    }
}



