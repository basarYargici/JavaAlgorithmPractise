package Q16;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project: DataStructuresMidterm
 * Package: Q16
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/30/2020
 * <p>
 * Q16) Write a program that reads a data file containing rational numbers,
 * one per line, stores the numbers in an ArrayList, removes any duplicates, and then outputs the sum, arithmetic mean, and harmonic mean
 * of the remaining unique rational numbers.
 */
public class RemoveDuplicate {
    /**
     * This is the main function which makes use of readFile, removeDuplicate, printTheList, sum,
     * arithmeticMean and harmonicMean methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        try {
            String pathway = "./src/Q16/text.txt";
            ArrayList<String> stringArrayList = readFile(new File(pathway).toString());
            ArrayList<Double> doubleArrayList = removeDuplicate(stringArrayList);
            ;
            System.out.println("The list which has duplicated numbers are removed is below and it's ready for operations:");
            printTheList(doubleArrayList);

            System.out.printf("Sum = %.3f \nArithmetic Mean = %.3f \nHarmonic Mean = %.3f", sum(doubleArrayList),
                    arithmeticMean(doubleArrayList), harmonicMean(doubleArrayList));
        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
    }

    /**
     * This method will take the harmonic mean of given arraylist.
     *
     * @param doubleArrayList This is the arraylist whose harmonic mean will be calculated.
     * @return double This is the result of harmonic mean.
     */
    public static double harmonicMean(ArrayList<Double> doubleArrayList) {
        double sum = 0;
        for (double d : doubleArrayList) {
            sum += (1 / d);
        }
        return doubleArrayList.size() / sum;
    }

    /**
     * This method will take the arithmetic mean of given arraylist.
     *
     * @param doubleArrayList This is the arraylist whose arithmetic mean will be calculated.
     * @return double This is the result of arithmetic mean.
     */
    public static double arithmeticMean(ArrayList<Double> doubleArrayList) {
        return sum(doubleArrayList) / doubleArrayList.size();
    }

    /**
     * This method will sum all elements of given arraylist.
     *
     * @param doubleArrayList This is the arraylist whose elements will be summed.
     * @return double This is the result of summation.
     */
    public static double sum(ArrayList<Double> doubleArrayList) {
        double sum = 0;
        for (double i : doubleArrayList) {
            sum += i;
        }
        return sum;
    }

    /**
     * This method prints the given arraylist which contains double type of elements.
     *
     * @param doubleArrayList This is the arraylist which will be printed.
     */
    public static void printTheList(ArrayList<Double> doubleArrayList) {
        for (int i = 0; i < doubleArrayList.size(); i++) {
            Double d = doubleArrayList.get(i);
            if (i == doubleArrayList.size() - 1) {
                System.out.printf("%.2f \n\n", d);
            } else {
                System.out.printf("%.2f ,", d);
            }
        }
    }

    /**
     * This method will take string type of arraylist and convert it to double type of arraylist.
     *
     * @param stringArrayList This is the type of string arraylist which will be converted to double arraylist.
     * @return  The arraylist is converted list.
     */
    public static ArrayList<Double> convertToDouble(ArrayList<String> stringArrayList) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        System.out.println("Checking for if there is any number exception.");
        for (int i = 0, stringArrayListSize = stringArrayList.size(); i < stringArrayListSize; i++) {
            String s = stringArrayList.get(i);
            try {
                double d = Double.parseDouble(s);
                doubleArrayList.add(d);
            } catch (NumberFormatException e) { // if file contains a/b, there will be numberException error. Thats why I used try-catch.
                int a = 0, b = 0;
                a = Integer.parseInt(s.substring(0, s.lastIndexOf("/")));
                b = Integer.parseInt(s.substring(s.lastIndexOf("/") + 1));
                if (b == 0) {
                    System.out.print("division by 0 found in the file: " + a + "/" + b + " = NAN! Removed from list\n\n");
                    continue;
                }
                float result = (float) a / b;
                doubleArrayList.add((double) result);
            }
        }
        System.out.println("Now the list is:");
        printTheList(doubleArrayList);
        return doubleArrayList;
    }

    /**
     * This method will take the type of string arraylist and remove the duplicates.
     *
     * @param stringArrayList this is the type of string arraylist which contains content of file.
     * @return  The arraylist will be the list which duplicates removed.
     */
    public static ArrayList<Double> removeDuplicate(ArrayList<String> stringArrayList) {
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<Double> doubleArrayList; // That will be the converted stringArrayList and later temp will be assigned.

        System.out.println();
        doubleArrayList = convertToDouble(stringArrayList); // Converts stringArraylist to double arraylist

        System.out.println("Removing duplicated rational numbers and the final list is:");

        for (int i = 0; i < doubleArrayList.size(); i++) {
            if (!temp.contains(doubleArrayList.get(i).toString())) {
                temp.add(doubleArrayList.get(i).toString()); // One by one adds double elements if they dont exist in the same list

                if (i == doubleArrayList.size() - 1) { // Printing the list
                    System.out.printf("%.2f is the updated list.\n", doubleArrayList.get(i));
                } else {
                    System.out.printf("%.2f ,", doubleArrayList.get(i));
                }
            }
        }
        doubleArrayList.clear(); // Removes all elements in doubleArraylist because it will be used again to store different list.
        for (String s : temp) {
            doubleArrayList.add(Double.parseDouble(s)); // Adds the elements in temp with converting to double
        }
        System.out.println();

        return doubleArrayList;
    }

    /**
     * This method will take string which is pathway and return the content of that file in that pathway.
     *
     * @param pathway This is the memory location of file in storage.
     * @return  The arraylist is the list of contents in file.
     */
    public static ArrayList<String> readFile(String pathway) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            File file = new File(pathway); // If file can not be found, it will throw exception
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
            System.out.print(pathway + " file contains: \n");
            for (int i = 0; i < arrayList.size(); i++) {
                if (i == arrayList.size() - 1) {
                    System.out.println(arrayList.get(i) + " numbers.");
                } else {
                    System.out.print(arrayList.get(i) + ", ");
                }
            }

        } catch (Exception e) {
            System.out.println("File not found:" + pathway);
            System.exit(-1); // This will terminate the program
        }
        return arrayList;
    }
}