package Q10;

import java.util.Arrays;

/**
 * Project: DataStructuresMidterm
 * Package: Q10
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q10) Implement the following methods, that accept a two-dimensional
 * array of double and return the sum, average, and mode (most common
 * item) in the two-dimensional array.
 * <p>
 * public static double sum( double [ ][ ] arr )
 * public static double average( double [ ][ ] arr )
 * public static double mode( double [ ][ ] arr )
 */
public class TwoDimensionalDoubleArrayOperation {
    public static void main(String[] args) {
        double sum, average, mode;
        double[][] arr = {{1.6, 1.6, 2.4, 2.4, 3.2, 1,2.4},
                          {4.2, 2.4, 4.2, 1.6, 1.6, 1.8,2.4,2.4}};
        sum = sum(arr);
        average = average(arr);
        mode = mode(arr);

        System.out.printf("%s \t= %.2f\n%s = %.2f\n%s \t= %.2f", "Sum", sum, "Average", average, "Mode", mode);
    }

    public static double sum(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static double average(double[][] arr) {
        int len = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                len++;
            }
        }
        return sum / len; //We could do sum(arr)/len, but it will be slower.
    }

    public static double mode(double[][] arr) {
        //Has not finished

       double mode = arr[0][0];
       int maxCount = 0;
       for (int i = 0; i < arr.length; i++) {
           int count = 0;
           for (int j = 0; j < arr[i].length; j++) {
               if (arr[i][j] == arr[i][j]) {
                   count++;
               }
               if (count > maxCount) {
                   maxCount = count;
                   mode = arr[i][j];
               }
           }
       }
       return mode;
    }
}
