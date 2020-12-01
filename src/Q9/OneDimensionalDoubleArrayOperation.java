package Q9;

import java.util.Arrays;

/**
 * Project: DataStructuresMidterm
 * Package: Q9
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q9) Implement the following methods, that accept an array of double and
 * return the sum, average, and mode (most common item) in the array.
 * <p>
 * public static double sum( double [ ] arr )
 * public static double average( double [ ] arr )
 * public static double mode( double [ ] arr )
 */
public class OneDimensionalDoubleArrayOperation {
    public static void main(String[] args) {
        double sum, average, mode;
        double[] arr = {1.6, 1.6, 2.4, 2.4, 4.2, 2.4, 4.2, 1.65, 1.65};
        sum = sum(arr);
        average = average(arr);
        mode = mode(arr);
        System.out.printf("%s \t= %.2f\n%s = %.2f\n%s \t= %.2f", "Sum", sum, "Average", average, "Mode", mode);
    }

    public static double sum(double[] arr) {
        double sum = 0;
        for (double element : arr) {
            sum += element;
        }
        return sum;
    }

    public static double average(double[] arr) {
        double sum = sum(arr);
        return sum / arr.length;
    }

    public static double mode(double[] arr) {
        double maxValue = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}


