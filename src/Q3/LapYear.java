package Q3;

/**
 * Project: DataStructuresMidterm
 * Package: Q3
 * <p>
 *
 * @author YARGICI
 * Date 11/29/2020
 *
 * <p>
 * Q3) Write a static methods that takes a year as a parameter and returns true
 * if the year is a leap year, and false otherwise.
 * <p>
 * In the Gregorian calendar, each leap year has 366 days instead of 365,
 * by extending February to 29 days rather than the common 28.
 * These extra days occur in each year which is an integer multiple of 4
 * (except for years evenly divisible by 100, which are not leap years unless evenly divisible by 400)
 */

public class LapYear {
    /**
     * This is the main function which makes use of isLeapYear method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }

    /**
     * This method will take a year as a parameter and will return true if the year is leap.
     *
     * @param year This is a parameter which will be computed if it is leap year or not.
     * @return boolean true if it is a leap year else returns false.
     */
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0) {
                return true;
            }
            return year % 100 != 0;
        }
        return false;
    }
}
