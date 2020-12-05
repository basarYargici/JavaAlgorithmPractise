package Q14;

import java.util.ArrayList;

/**
 * Project: DataStructuresMidterm
 * Package: Q14
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/30/2020
 * <p>
 * Q14) Implement method startsWith which returns an ArrayList containing
 * all the Strings in arr that begin with character ch.
 * <p>
 * public ArrayList<String> startsWith( String [ ] arr, char ch )
 */
public class StartsWith {
    /**
     * This method will take string array and character, returns string type of arraylist.
     *
     * @param arr This is the array of string which ch will be searched on as a first character.
     * @param ch  This is the character which will be searched as a first character.
     * @return    The arraylist is the string type of arraylist which contains strings which are starts with ch.
     */
    public ArrayList<String> startsWith(String[] arr, char ch) {
        ArrayList<String> startsWithCh = new ArrayList<>();
        System.out.println("----------------------------");
        System.out.println("The elements which String contains:");
        for (int i = 0; i < arr.length; i++) { // that prints the string
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        for (String str : arr) { // that will add strings to arraylist which are starts with ch
            if (str.startsWith(String.valueOf(ch))) {
                startsWithCh.add(str);
            }
        }

        return startsWithCh;
    }

    /**
     * This method will take string type of arraylist and character, and prints the arraylist.
     *
     * @param arrayList This is the string type of arraylist which contains only elements which starts with ch.
     * @param ch        This is the character to know which character we were searched.
     */
    public void printStartsWith(ArrayList<String> arrayList, char ch) {
        if (arrayList.isEmpty()) {
            System.out.println();
            System.out.println("There is no such that element which starts with " + ch + " !");
        } else {
            System.out.println("\nThe elements which start with '" + ch + "':");
            for (String str : arrayList) {
                System.out.println(str);
            }
            System.out.println("----------------------------");
        }
    }
}

/**
 * This class contains main function.
 */
class Test{
    /**
     * This is the main function which makes use of startsWith and printStartsWith methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        StartsWith sw = new StartsWith();
        String[] firstStringArray = {"abc", "cad", "cbe", "be"};
        String[] secondStringArray = {"abc", "baby", "bcde", "art"};
        String[] thirdStringArray = {"abc", "def", "ghi", "aaa"};
        char ch1 = 'c';
        char ch2 = 'b';
        char ch3 = 'z';

        ArrayList<String> firstArrayList = sw.startsWith(firstStringArray, ch1);
        sw.printStartsWith(firstArrayList, ch1);

        ArrayList<String> secondArrayList = sw.startsWith(secondStringArray, ch2);
        sw.printStartsWith(secondArrayList, ch2);

        ArrayList<String> thirdArrayList = sw.startsWith(thirdStringArray, ch3);
        sw.printStartsWith(thirdArrayList, ch3);
    }

}