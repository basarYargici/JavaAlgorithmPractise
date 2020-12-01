package Q16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Project: DataStructuresMidterm
 * Package: Q16
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * <p>
 * Q16) Write a program that reads a data file containing rational numbers,
 * one per line, stores the numbers in an ArrayList, removes any duplicates, and then outputs the sum, arithmetic mean, and harmonic mean
 * of the remaining unique rational numbers.
 * <p>
 */
public class RemoveDuplicate {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            String pathway = "./src/Q16/text.txt";
            ArrayList<String> stringArrayList = readFile(new File(pathway).toString());
            ArrayList<Double> doubleArrayList;
            doubleArrayList = removeDuplicate(stringArrayList);
            System.out.println("The list which has duplicated numbers are removed is below and it's ready for operations:");
            printTheList(doubleArrayList);


            System.out.printf("Sum = %.3f \nArithmetic Mean = %.3f \nHarmonic Mean = %.3f", sum(doubleArrayList),
                    arithmeticMean(doubleArrayList), harmonicMean(doubleArrayList));

        } catch (Exception e) {
            System.out.println(e);
            System.exit(-1);
        }
    }

    public static double harmonicMean(ArrayList<Double> doubleArrayList) {
        double sum = 0;
        for (double d : doubleArrayList) {
            sum += (1 / d);
        }
        return doubleArrayList.size() / sum;
    }


    public static double arithmeticMean(ArrayList<Double> doubleArrayList) {
        return sum(doubleArrayList) / doubleArrayList.size();
    }


    public static double sum(ArrayList<Double> doubleArrayList) {
        double sum = 0;
        for (double i : doubleArrayList) {
            sum += i;
        }
        return sum;
    }

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


    public static ArrayList<Double> removeDuplicate(ArrayList<String> stringArrayList) {
        ArrayList<String> temp = new ArrayList<>();
        ArrayList<Double> doubleArrayList;
        ArrayList<Double> doubleArrayList2 = new ArrayList<>();

        System.out.println();
        doubleArrayList = convertToDouble(stringArrayList);

        System.out.println("Removing duplicated rational numbers and the final list is:");

        for (int i = 0; i < doubleArrayList.size(); i++) {
            if (!temp.contains(doubleArrayList.get(i).toString())) {
                temp.add(doubleArrayList.get(i).toString());

                if (i == doubleArrayList.size() - 1) {
                    System.out.printf("%.2f is the updated list.\n", doubleArrayList.get(i));
                } else {
                    System.out.printf("%.2f ,", doubleArrayList.get(i));
                }
            }
        }

        for (String s : temp) {
            doubleArrayList2.add(Double.parseDouble(s));
        }
        System.out.println();

        return doubleArrayList2;
    }

    public static ArrayList<String> readFile(String pathway) {
        ArrayList<String> arrayList = new ArrayList<>();
        File file = new File(pathway);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                arrayList.add(scanner.nextLine());
            }
            System.out.print(pathway+" file contains: \n");
            for (int i = 0; i < arrayList.size(); i++) {
                if (i == arrayList.size() - 1) {
                    System.out.println(arrayList.get(i) + " numbers.");
                } else {
                    System.out.print(arrayList.get(i) + ", ");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }
}