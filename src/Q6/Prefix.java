package Q6;

/**
 * Project: DataStructuresMidterm
 * Package: Q6
 * <p>
 *
 * @author YARGICI
 * Date 11/30/2020
 * Q6) Write a method that returns true if String str1 is a prefix of String str2.
 * Do not use any of the general string searching routines except charAt.
 */
public class Prefix {
    /**
     * This is the main function which makes use of isPrefix method.
     * User should give two string inside of isPrefix method.
     * If the start of second string contains first string, program will print true, else false.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        System.out.println(isPrefix("str", "strSecond"));
    }

    /**
     * This method will take two string and if the start of second string
     * contains first string, program will print true, else false.
     *
     * @param str1 This is the first string.
     * @param str2 This is the second string.
     * @return boolean true if first string is prefix of second string.
     */
    public static boolean isPrefix(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
