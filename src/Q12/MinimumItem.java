package Q12;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

/**
 * Project: DataStructuresMidterm
 * Package: Q12
 * <p>
 *
 * @author YARGICI
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
    public static void main(String[] args) {
        int[] intArray = {1, 2, 0, 5, 9, 8};
        int[][] twoDimensionalIntArray = {{457, 45, 100, 55, 40}, {999, 45, 888, 43, 155}};
        String[] stringArray = {"abc", "abcd", "ab", "ae"};
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("abc");
        stringArrayList.add("abcd");
        stringArrayList.add("ab");
        stringArrayList.add("ae");

        System.out.print("One dimensional array: ");
        for (int i :intArray ) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Minimum number of that array is: " +min(intArray));
        System.out.println();

        System.out.println("Two dimensional array: ");
        for (int[] i :twoDimensionalIntArray ) {
            for (int j :i ) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println("Minimum number of that two dimensional array is: " +min(twoDimensionalIntArray));
        System.out.println();

        System.out.print("String array: ");
        for (String str :stringArray ) {
            System.out.print(str+ " ");
        }
        System.out.println();
        System.out.println("Minimum string of that array is: " +min(stringArray));
        System.out.println();

        System.out.print("String ArrayList: ");
        for (String str :stringArrayList ) {
            System.out.print(str+ " ");
        }
        System.out.println();
        System.out.println("Minimum string of that ArrayList is: " +min(stringArrayList));
        System.out.println();


    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < arr[0]) {
                min = i;
            }
        }
        return min;
    }

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

    public static String min(String[] arr) {
        String min = arr[0];
        for (String i : arr) {
            if ((min.compareTo(i)) > 0) {
                min = i;
            }
        }
        return min;
    }

    public static String min(ArrayList<String> arr) {
        String min = arr.get(0);
        for (String i : arr) {
            if (min.compareTo(i)>0) {
                min = i;
            }
        }
        return min;
    }
}
