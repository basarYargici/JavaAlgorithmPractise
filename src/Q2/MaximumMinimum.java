package Q2;

/**
 * Project: DataStructuresMidterm
 * Package: Q2
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/29/2020
 *
 * <p>
 * Q2) Write two static methods. The first should return the maximum of three integers,
 * and the second should return the maximum of four integers.
 */
public class MaximumMinimum {
    /**
     * This is the main function which makes use of findMaximumNumber methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        int maxFromThreeNumbers = findMaximumNumber(1, 5, 4);
        int maxFromFourNumbers = findMaximumNumber(1, 5, 4, 8);
        System.out.println("Maximum of 1,5,4 numbers is   : " + maxFromThreeNumbers);
        System.out.println("Maximum of 1,5,4,8 numbers is : " + maxFromFourNumbers);
    }

    /**
     * This method will take three Integer parameters and the method is used to find
     * the maximum number between those three parameters.
     *
     * @param a This is the first number and parameter to findMaximumNumber method.
     * @param b This is the second number and parameter to findMaximumNumber method.
     * @param c This is the third number and parameter to findMaximumNumber method.
     * @return int This returns the maximum number between three numbers.
     */
    public static int findMaximumNumber(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    /**
     * This method will take four Integer parameters and the method is used to find
     * the maximum number between four parameters.
     *
     * @param a This is the first number and parameter to findMaximumNumber method.
     * @param b This is the second number and parameter to findMaximumNumber method.
     * @param c This is the third number and parameter to findMaximumNumber method.
     * @param d This is the fourth number and parameter to findMaximumNumber method.
     * @return int This returns the maximum number between four numbers.
     */
    public static int findMaximumNumber(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        return max;
    }
}

