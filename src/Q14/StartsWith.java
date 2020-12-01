package Q14;

import java.util.ArrayList;

/**
 * Project: DataStructuresMidterm
 * Package: Q14
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q14) Implement method startsWith which returns an ArrayList containing
 * all the Strings in arr that begin with character ch.
 * <p>
 * public ArrayList<String> startsWith( String [ ] arr, char ch )
 */
public class StartsWith {
    public static void main(String[] args) {
        String[] firstStringArray = {"abc", "cad", "cbe", "be"};
        String[] secondStringArray = {"abc", "baby", "bcde", "art"};
        String[] thirdStringArray = {"abc", "def", "ghi", "aaa"};
        char ch1 = 'c';
        char ch2 = 'b';
        char ch3 = 'z';
        ArrayList<String> firstArrayList = startsWith(firstStringArray, ch1);
        printStartsWith(firstArrayList, ch1);

        ArrayList<String> secondArrayList = startsWith(secondStringArray, ch2);
        printStartsWith(secondArrayList, ch2);
        ArrayList<String> thirdArrayList = startsWith(thirdStringArray, ch2);
        printStartsWith(thirdArrayList, ch3);


    }

    public static ArrayList<String> startsWith(String[] arr, char ch) {
        ArrayList<String> startsWithCh = new ArrayList<>();
        System.out.println("----------------------------");
        System.out.println("The elements which String contains:");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        for (String str : arr) {
            if (str.startsWith(String.valueOf(ch))) {
                startsWithCh.add(str);
            }
        }

        return startsWithCh;
    }

    public static void printStartsWith(ArrayList<String> arrayList, char ch) {
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
