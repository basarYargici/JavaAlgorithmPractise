package Q19;

/**
 * Project: DataStructuresMidterm
 * Package: Q19
 * <p>
 *
 * @author İbrahim Başar YARGICI
 * Date 12/1/2020
 * <p>
 * Q19) A BinaryArray represents arbitrarily long sequences of binary variables.
 * The private data representation is an array of Boolean variables. For
 * instance, the representation of the BinaryArray TFTTF would be an array
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

    /**
     * This is the constructor of BinaryArray class.
     *
     * @param str This is a string which holds the input. It can only holds T or F characters.
     */
    public BinaryArray(String str) {
        this.str = str;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'T' && str.charAt(i) != 'F') {
                System.out.println("String is " + str);
                throw new IllegalArgumentException("Binary array contains illegal character '" + str.charAt(i) + "'! You can only" +
                        " use T and F characters in binary array!");
            }
        }
    }

    /**
     * This method returns the size of str.
     *
     * @return int This is the length of str.
     */
    public int getSize() {
        return str.length();
    }

    /**
     * This method returns the str.
     *
     * @return String This is the str which is given when the object initialized.
     */
    public String getStr() {
        return str;
    }

    /**
     * This method returns the character at given index.
     *
     * @param index This is the place where character will be got.
     * @return char This is the character at specific index of str.
     */
    public char getCharAt(int index) {
        if (index < str.length()) {
            return str.charAt(index);
        }
        System.out.print("String has " + str.length() + " characters. You entered " +
                index + " for index. Please enter sensible index next time!");
        return 0;
    }

    /**
     * This method changes the character at given index with given character.
     *
     * @param index This is the place where character will be changed.
     * @param ch    This is the character which will be at the index of str.
     */
    public void setCharAt(int index, char ch) {
        if (ch != 'T' && ch != 'F') {
            if (index < str.length()) {
                System.out.println("You can only insert T or F as a character");
            } else {
                System.out.println("String has " + str.length() + " characters. You entered " +
                        index + " for index. Please enter sensible index next time!");
            }
        } else {
            System.out.println(ch + " inserted at " + index + " index");
            // Get the substring before the ch, insert ch at the end of it, and the rest to end of ch.
            str = str.substring(0, index) + ch + str.substring(index + 1);
        }
    }

    /**
     * This method gets the str.
     *
     * @return String This returns string text which shows what is str.
     */
    public String toString() {
        return "BinaryArray = '" + str + '\'';
    }


}

class Test {
    /**
     * This is the main function which makes use of BinaryArray class objects, and methods.
     *
     * @param args Unused.
     */
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