package Q8;

/**
 * Project: DataStructuresMidterm
 * Package: Q8
 * <p>
 *
 * @author İbrahim Başar YARGICI
 * Date 11/30/2020
 * <p>
 * Q8) What is wrong with this code?
 * <p>
 * public static void resize( int [ ] arr )
 * {
 * int [ ] old = arr;
 * arr = new int[ old.length * 2 + 1 ];
 * for( int i = 0; i < old.length; i++ )
 * arr[ i ] = old[ i ];
 * }
 * <p>
 * Answer: The method does not return the original array. If the method does not return the
 * original array and if original array does not assigned with replace function in main method,
 * only change will be inside of resize function. The original array will not change!
 * To solve this problem, we should return array in resize method and assign original array
 * to this method in main method.
 */
public class Resize {
    /**
     * This is the main function which makes use of resize method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.print("Original array : ");
        for (int i :a ) {
            System.out.print(i + " ");
        }
        System.out.print("and the length of original array is : "+a.length);
        System.out.println("\nResizing process started..");
        a = resize(a);
        System.out.println("Finally the length of resized array is : "+a.length);
    }

    /**
     * This method will take int array and resize the length.
     *
     * @param arr This is the second string.
     * @return int[] This is the original array.
     */
    public static int[] resize(int[] arr) {
        int[] old = arr;
        arr = new int[old.length * 2 + 1];
        for (int i = 0; i < old.length; i++) { // Copy process of old array to arr array
            arr[i] = old[i];
        }
        return arr;
    }

}
