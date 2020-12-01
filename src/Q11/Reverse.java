package Q11;

import java.util.ArrayList;

/**
 * Project: DataStructuresMidterm
 * Package: Q11
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q11) Implement the following methods that reverse an array or ArrayList
 * of String.
 * <p>
 * public static void reverse( String [ ] arr )
 * public static void reverse( ArrayList<String> arr )
 */
public class Reverse {
    public static void main(String[] args) {
        String[] stringArray = {"first", "second", "third"};
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("first");
        stringArrayList.add("second");
        stringArrayList.add("third");

        System.out.println("String array before reverse method:");
        for (String str :stringArray ) {
            System.out.println(str);
        }
        System.out.println("String array after reverse method:");
        reverse(stringArray);

        System.out.println("\nString ArrayList before reverse method:");
        for (String str :stringArrayList ) {
            System.out.println(str);
        }
        System.out.println("String ArrayList after reverse method:");
        reverse(stringArrayList);

    }

    public static void reverse(String[] arr) {
        String[] secondArray = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            secondArray[j] = arr[i];
            System.out.println(secondArray[j]);
            j++;
        }
    }

    public static void reverse(ArrayList<String> arr) {
        ArrayList<String> secondArray = new ArrayList<>();
        int j = 0;
        for (int i = arr.size()-1; i >=0 ; i--) {
            secondArray.add(arr.get(i));
            System.out.println(secondArray.get(j));
            j++;
        }
    }
}
