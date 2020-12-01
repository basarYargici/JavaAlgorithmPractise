package Q19;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Project: DataStructuresMidterm
 * Package: Q19
 * <p>
 *
 * @author YARGICI
 * Date 12/1/2020
 * <p>
 * Q19) A BinaryArray represents arbitrarily long sequences of binary variables.
 * The private data representation is an array of Boolean variables. For
 * instance, the representation of the BinaryArray “TFTTF” would be an array
 * of length five storing true, false, true, true, false in array indices 0, 1, 2, 3,
 * and 4, respectively. The BinaryArray class has the following functionality:
 * <p>
 * a. A one-parameter constructor that contains a String. Throw an
 * IllegalArgumentException if there are illegal characters.
 * b. A toString method.
 * c. A get and set method to access or change a variable at a particular index.
 * d. A size method that returns the number of binary variables in
 * the BinaryArray.
 * e. Implement the BinaryArray class, placing it in a package of your choosing
 */
public class BinaryArray {
    private String str;

    public BinaryArray(String str) {
        this.str = str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'T' && str.charAt(i) != 'F') {
                System.out.println("String is "+str);
                throw new IllegalArgumentException("Binary array contains illegal character '" + str.charAt(i) + "'! You can only" +
                        " use T and F characters in binary array!");
            }
        }
    }

    public int getSize() {
        return str.length();
    }

    public String getStr() {
        return str;
    }

    public char getCharAt(int index) {
        if (index < str.length()) {
            return str.charAt(index);
        }
        System.out.print("String has " + str.length() + " characters. You entered " +
                index + " for index. Please enter sensible index next time!");
        return 0;
    }

    public void setCharAt(int index, char ch) {
        if (ch != 'T' && ch != 'F') {
            if (index<str.length()){
                System.out.println("You can only insert T or F as a character");
            }else {
                System.out.println("String has " + str.length() + " characters. You entered " +
                        index + " for index. Please enter sensible index next time!");
            }
        } else {
            System.out.println(ch + " inserted at " + index + " index");
            str = str.substring(0, index) + ch + str.substring(index + 1);
        }
    }

    public String toString() {
        return "BinaryArray = '" + str + '\'';
    }


}

class Test {

    public static void main(String[] args) {
        String binaryArray = "TTFTFTTFFTFFFT";
        BinaryArray ba = new BinaryArray(binaryArray);
        int index = 1;
        System.out.println(ba.toString() + "\n");
        System.out.println("Char at " + index + " = " + ba.getCharAt(index) + "\n");
        System.out.println("Trying to insert T at index 33");
        ba.setCharAt(33, 'S');
        System.out.println("\nUpdated binary array = " + ba.getStr());
        System.out.println("\nTrying to insert T at index 7");
        ba.setCharAt(2, 'F');
        System.out.println("\nUpdated binary array = " + ba.getStr());
        System.out.println("\nSize of binary array = " + ba.getSize());
    }

}