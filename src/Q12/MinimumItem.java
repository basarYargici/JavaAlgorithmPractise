package Q12;

import java.util.ArrayList;

/**
 * Project: DataStructuresMidterm
 * Package: Q12
 * <p>
 *
 * @author İbrahim Başar YARGICI
 * Date 11/30/2020
 * <p>
 * Q12) Implement the following methods that return the minimum of the group
 * of items passed as the parameter. In the case of Strings, the minimum is
 * the alphabetically smallest, as determined by compareTo.
 * <p>
 * public static int min( int [ ] arr )
 * public static int min( int [ ][ ] arr )
 * public static String min( String [ ] arr )
 * public static String min( ArrayList<String> arr )
 */
public class MinimumItem {
    /**
     * This is the main function which makes use min methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        int[] intArray = {1, 2, 0, 5, 9, 8};
        int[][] twoDimensionalIntArray = {{457, 45, 100, 55, 40}, {999, 45, 888, 43, 155}};
        String[] stringArray = {"abc", "abcd", "ab", "ae"};
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("defg");
        stringArrayList.add("def");
        stringArrayList.add("de");
        stringArrayList.add("fg");

        System.out.print("One dimensional int array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Minimum number of that int array is: " + min(intArray));
        System.out.println();

        System.out.println("Two dimensional int array: ");
        for (int[] i : twoDimensionalIntArray) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("Minimum number of that two dimensional int array is: " + min(twoDimensionalIntArray));
        System.out.println();

        System.out.print("String array: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("Minimum string of that string array is: " + min(stringArray));
        System.out.println();

        System.out.print("String ArrayList: ");
        for (String str : stringArrayList) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("Minimum string of that ArrayList is: " + min(stringArrayList));
    }

    /**
     * This method will take one dimensional int array and return the minimum of group.
     *
     * @param arr This is the one dimensional int array whose minimum element will be found.
     * @return int This is the minimum number of arr.
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < arr[0]) {
                min = i;
            }
        }
        return min;
    }

    /**
     * This method will take two dimensional int array and return the minimum of group.
     *
     * @param arr This is the two dimensional int array whose minimum element will be found.
     * @return int This is the minimum number of arr.
     */
    public static int min(int[][] arr) {
        int min = arr[0][0];
        for (int[] i : arr) {
            for (int j : i) {
                if (j < min) {
                    min = j;
                }
            }
        }
        return min;
    }

    /**
     * This method will take one dimensional string array and return the minimum of group.
     *
     * @param arr This is the one dimensional string array whose minimum element will be found.
     * @return string This is the minimum number of arr.
     */
    public static String min(String[] arr) {
        String min = arr[0];
        for (String i : arr) {
            if ((min.compareTo(i)) > 0) {
                min = i;
            }
        }
        return min;
    }

    /**
     * This method will take string type of arraylist and return the minimum of group.
     *
     * @param arr This is the string type of arraylist whose minimum element will be found.
     * @return string This is the minimum number of arr.
     */
    public static String min(ArrayList<String> arr) {
        String min = arr.get(0);
        for (String i : arr) {
            if (min.compareTo(i) > 0) {
                min = i;
            }
        }
        return min;
    }
}
