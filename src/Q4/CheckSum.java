package Q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Project: DataStructuresMidterm
 * Package: Q4
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/29/2020
 * <p>
 * Q4) A checksum is the 32-bit integer that is the sum of the Unicode characters in a file.
 * Write a program to compute the checksum of a file that is supplied as a command-line argument.
 * <p>
 * Working pathname is  .\src\Q4\text.txt
 */
public class CheckSum {
    /**
     * This is the main function which makes use of readFile and checkSum methods.
     * User should give a pathname of a file as a first argument.
     *
     * @param args args[0] used as a path of file.
     */
    public static void main(String[] args) {
        System.out.println("Text in file \t\t: " + readFile(args[0]));
        System.out.println("Sum of chars in file \t: " + checkSum(readFile(args[0])));
    }

    /**
     * This method will take a text as a parameter and will calculate the sum of characters inside of text.
     *
     * @param text This is a parameter whose sum of characters will be calculated.
     * @return int This returns sum of characters in a file.
     */
    public static int checkSum(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            sum += ch;
        }
        return sum;
    }

    /**
     * This method will take path of file as a parameter and will return the text inside of this file.
     *
     * @param pathname This is a pathname which shows us the path of file.
     * @return String This is the text of the file.
     */
    public static String readFile(String pathname) {
        String text = "";
        try {
            File file = new File(pathname);
            Scanner scanner;
            scanner = new Scanner(file); // This line will scan the inside of file
            while (scanner.hasNext()) {
                text = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(-1); // This line terminates the program
        }
        return text;
    }

}
