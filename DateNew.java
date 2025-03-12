public class MyDate {
    int d;
    int m;
    int y;

    public void setDate(int day, int month, int year) {
        y = year;
        m = month;
        d = day;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { // Leap year check
            if (month == 2) {
                if (day < 1 || day > 29) {
                    System.out.println("Invalid Date, please enter a valid date");
                } else {
                    d = day;
                }
            }
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day < 1 || day > 31) {
                    d = 1;
                } else {
                    d = day;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day < 1 || day > 30) {
                    d = 1;
                } else {
                    d = day;
                }
            } else if (month == 2) {
                if (day < 1 || day > 28) {
                    d = 1;
                } else {
                    d = day;
                }
            }
        }
    }

    public static void addDays(int extraDays, int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        int totalDays = day + extraDays;

        while (totalDays > daysInMonth[month - 1]) {
            totalDays -= daysInMonth[month - 1];
            month++;

            if (month > 12) {
                month = 1;
                year++;
            }
        }

        System.out.println("New Date: " + totalDays + "/" + month + "/" + year);
    }

    public static void addMonths(int extraMonths, int day, int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        int newMonth = month + extraMonths;
        while (newMonth > 12) {
            newMonth -= 12;
            year++;
        }

        if (day > daysInMonth[newMonth - 1]) {
            day = daysInMonth[newMonth - 1];
        }

        System.out.println("New Date: " + day + "/" + newMonth + "/" + year);
    }

    public static void addYears(int extraYears, int day, int month, int year) {
        int newYear = year + extraYears;
        System.out.println("New Date: " + day + "/" + month + "/" + newYear);
    }

    public int getDay() {
        return d;
    }

    public int getMonth() {
        return m;
    }

    public int getYear() {
        return y;
    }
}

