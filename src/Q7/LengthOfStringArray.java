package Q7;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: DataStructuresMidterm
 * Package: Q7
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q7) Write a routine that prints the total length of the Strings in a String[]
 * passed as a parameter. Your routine must work unchanged if the
 * parameter is changed to an ArrayList<String>.
 */
public class LengthOfStringArray {
    /**
     * This is the main function which makes use of lengthOfStrings method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        String[] b = {"a", "bc a s", "a b c"};
        ArrayList<String> a = new ArrayList<>();
        a.add("a");
        a.add("bc");
        a.add("a b c a s");

        lengthOfStrings(b);
        lengthOfStrings(a);
    }

    /**
     * This method will take an array which contains strings and
     * calculates the length of all elements in string array.
     *
     * @param stringArray This is an array of string.
     */
    public static void lengthOfStrings(String[] stringArray) {
        int sum = 0;

        for (String str : stringArray) {
            sum += str.length();
        }
        System.out.println(sum);
    }

    /**
     * This method will take an arraylist which contains strings and
     * calculates the length of all elements in string arraylist.
     *
     * @param stringArray This is an arraylist of string.
     */
    public static void lengthOfStrings(ArrayList<String> stringArray) {
        int sum = 0;

        for (String str : stringArray) {
            sum += str.length();
        }
        System.out.println(sum);
    }
}
