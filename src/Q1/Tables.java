package Q1;

/**
 * Project: DataStructuresMidterm
 * Package: Q1
 * <p>
 *
 * @author Ibrahim Basar YARGICI* Date 11/29/2020
 *
 * <p>
 * Q1) Write a program to generate the addition and multiplication tables for single-digit numbers (the table
 * that elementary school students are accustomed to seeing).
 */
public class Tables {
    /**
     * This is the main function which makes use of printAddition and printMultiplication methods.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        printAddition();
        printMultiplication();
    }

    /**
     * This method will print the addition table from 0 to 9 to the console.
     */
    public static void printAddition() {
        System.out.println("Addition:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + "+" + i + "=" + (i + j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }


    /**
     * This method will print the multiplication table from 0 to 9 to the console.
     */
    public static void printMultiplication() {
        System.out.println("Multiplication:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
