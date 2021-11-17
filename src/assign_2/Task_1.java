/**
 * Methods that calculate information about a certain date
 * 
 * @author Jia Xuan Li
 * @since 2021-10-07
 * @version 1.0
 */
public class Task_1 {
    /**
     * Calculates the amount of days in a month
     * 
     * @param month The month number (0 - 12)
     * @param year  The year
     * @return The number of days in the month
     */
    public static int calcDays1(int month, int year) {
        int dayCount = 0;
        if (month == 2) {
            dayCount = 28;

            // if year can be divided by 4, then it's 29 days
            if (year % 4 == 0) {
                dayCount++;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            dayCount = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            dayCount = 30;
        }

        return dayCount;
    }

    /**
     * Calculates the amount of days in a month
     * 
     * @param month The month number (0 - 12)
     * @param year  The year
     * @return The number of days in the month
     */
    public static int calcDays2(int month, int year) {
        int dayCount = 0;

        switch (month) {
            case 2:
                if (year % 4 == 0) {
                    dayCount = 29;
                } else {
                    dayCount = 28;
                }

                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayCount = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dayCount = 30;
                break;
        }

        return dayCount;
    }

    /**
     * Finds whether a year is a leap year
     * 
     * @param year The year
     * @return True if the year is a leap year
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcDays1(2, 2004));
        System.out.println(calcDays1(3, 2005));
        System.out.println(calcDays1(6, 2005));

        System.out.println(calcDays2(2, 2004));
        System.out.println(calcDays2(3, 2005));
        System.out.println(calcDays2(6, 2005));

        System.out.println(isLeapYear(2004));
    }
}