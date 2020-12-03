package Q11;

import java.util.ArrayList;

/**
 * Project: DataStructuresMidterm
 * Package: Q11
 * <p>
 *
 * @author İbrahim Başar YARGICI
 * Date 11/30/2020
 * <p>
 * Q11) Implement the following methods that reverse an array or ArrayList
 * of String.
 * <p>
 * public static void reverse( String [ ] arr )
 * public static void reverse( ArrayList<String> arr )
 */
public class Reverse {
    /**
     * This is the main function which makes use of reverse methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        String[] stringArray = {"a", "b", "c"};
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("a");
        stringArrayList.add("b");
        stringArrayList.add("c");

        System.out.println("String array before reverse method:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        stringArray = reverse(stringArray);

        System.out.println("String array after reverse method:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        System.out.println("\nString ArrayList before reverse method:");
        for (String str : stringArrayList) {
            System.out.println(str);
        }

        stringArrayList = reverse(stringArrayList);

        System.out.println("String ArrayList after reverse method:");
        for (String str : stringArrayList) {
            System.out.println(str);
        }
    }

    /**
     * This method will take string array and return the reversed form of array.
     *
     * @param arr This is the one dimensional string array.
     * @return string[] This is the form of reversed all elements of arr.
     */
    public static String[] reverse(String[] arr) {
        String[] secondArray = new String[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) { // Copy process
            secondArray[j] = arr[i];
            j++;
        }
        return secondArray;
    }

    /**
     * This method will take string arraylist and return the reversed form of arraylist.
     *
     * @param arr This is a string type of arraylist.
     * @return ArrayList<String> This is the form of reversed all elements of arr.
     */
    public static ArrayList<String> reverse(ArrayList<String> arr) {
        ArrayList<String> arrayList = new ArrayList<>();
        int j = 0;
        for (int i = arr.size() - 1; i >= 0; i--) { // Copy process
            arrayList.add(arr.get(i));
            j++;
        }
        return arrayList;
    }
}
