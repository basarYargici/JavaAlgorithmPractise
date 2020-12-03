package Q7;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: DataStructuresMidterm
 * Package: Q7
 * <p>
 *
 * @author İbrahim Başar YARGICI
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
        System.out.print("String Array     :");
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                System.out.print(" \"" + b[i] + "\" \n");
            } else {
                System.out.print(" \"" + b[i] + "\",");
            }
        }

        System.out.print("Arraylist<String>:");

        for (int i = 0; i < a.size(); i++) {
            if (i == a.size() - 1) {
                System.out.print(" \"" + a.get(i) + "\" \n\n");
            } else {
                System.out.print(" \"" + a.get(i) + "\",");
            }
        }

        System.out.println("Length of String: " + lengthOfStrings(b));
        System.out.println("Length of ArrayList<String>: " + lengthOfStrings(a));
    }

    /**
     * This method will take an array which contains strings and
     * calculates the length of all elements in string array.
     *
     * @param stringArray This is an array of string.
     */
    public static int lengthOfStrings(String[] stringArray) {
        int sum = 0;

        for (String str : stringArray) {
            sum += str.length();
        }
        return sum;
    }

    /**
     * This method will take an arraylist which contains strings and
     * calculates the length of all elements in string arraylist.
     *
     * @param stringArray This is an arraylist of string.
     */
    public static int lengthOfStrings(ArrayList<String> stringArray) {
        int sum = 0;

        for (String str : stringArray) {
            sum += str.length();
        }
        return sum;
    }
}
