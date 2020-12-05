# DataStructuresMidterm

Here is my midterm of Data Structure lesson. Last Update:12/5/2020

You can find source codes in src\Qi folder where i is 1..20 and Q is the question, output of programs in Output folder, flowcharts in Flowchart folder, pseudocodes in Pseudocode folder and javadocs in Javadoc folder!
<br/>
Important note: I used notepad++ for pseudocodes and if you open pseudocodes on another text editors, it may look misaligned.

##Questions
* Q1) Write a program to generate the addition and multiplication tables for single-digit numbers (the table that elementary school students are accustomed to seeing).

* Q2) Write two static methods. The first should return the maximum of three integers, and the second should return the maximum of four integers.

* Q3) Write a static methods that takes a year as a parameter and returns true if the year is a leap year, and false otherwise.

* Q4) A checksum is the 32-bit integer that is the sum of the Unicode characters in a file. Write a program to compute the checksum of a file that is supplied as a command-line argument.

* Q5) Modify the program in Figure 19 so that if no command-line arguments are given, then the standard input is used.(Figure 19 is in the Q5 folder.)

* Q6) Write a method that returns true if String str1 is a prefix of String str2. Do not use any of the general string searching routines except charAt.

* Q7) Write a routine that prints the total length of the Strings in a String[] passed as a parameter. Your routine must work unchanged if the parameter is changed to an ArrayList<String>.

* Q8) What is wrong with this code?
<br/>
public static void resize( int [ ] arr ){<br/>
  int [ ] old = arr;<br/>
  arr = new int[ old.length * 2 + 1 ];<br/>
  for( int i = 0; i < old.length; i++ )<br/>
  arr[ i ] = old[ i ];<br/>
}<br/>
                               
* Q9) Implement the following methods, that accept an array of double and
return the sum, average, and mode (most common item) in the array.<br/>
public static double sum( double [ ] arr )<br/>
public static double average( double [ ] arr )<br/>
public static double mode( double [ ] arr )<br/>
  
* Q10) Implement the following methods, that accept a two-dimensional
array of double and return the sum, average, and mode (most common
item) in the two-dimensional array.<br/>
public static double sum( double [ ][ ] arr )<br/>
public static double average( double [ ][ ] arr )<br/>
public static double mode( double [ ][ ] arr )<br/>
  
* Q11) Implement the following methods that reverse an array or ArrayList
of String.<br/>
public static void reverse( String [ ] arr )<br/>
public static void reverse( ArrayList<String> arr )<br/>
  
* Q12) Implement the following methods that return the minimum of the group
of items passed as the parameter. In the case of Strings, the minimum is
the alphabetically smallest, as determined by compareTo. <br/>
public static int min( int [ ] arr ) <br/>
public static int min( int [ ][ ] arr ) <br/>
public static String min( String [ ] arr ) <br/>
public static String min( ArrayList<String> arr ) <br/>

* Q13) Method isIncreasing returns true if in each row of the two-dimensional
array, all entries monotonically increase, and in each column all entries
also monotonically increase. Implement isIncreasing.<br/>
public static boolean isIncreasing( int [ ] [ ] arr ) 
  
* Q14) Implement method startsWith which returns an ArrayList containing
all the Strings in arr that begin with character ch.<br/>
public ArrayList<String> startsWith( String [ ] arr, char ch )
  
* Q15) Modify the BigRational class so that 0/0 is legal and is interpreted as “Indeterminate” by toString. (Class is in the image format in Q15 folder.)

* Q16) Write a program that reads a data file containing rational numbers, one per line, stores the numbers in an ArrayList, removes any duplicates, and then outputs the sum, arithmetic mean, and harmonic mean of the remaining unique rational numbers.

* Q17) Suppose you would like to print a two dimensional array in which all numbers are between 0 and 999. The normal way of outputting each number might leave the array misaligned. Examine the documentation for the format method in the String class and write a routine that outputs the two-dimensional array in a nicer format.<br/>
<br/>
For instance:<br/>
54  4 12  366 512<br/>
756 192 18  27  4<br/>
14  18 99  300 18<br/>
<!--  
such as <p>
 54   4 12 366 512<p>
756 192 18  27   4<p>
 14  18 99 300  18<p>
--><br/>

* Q18) Package java.math contains a class BigDecimal, used to represent an arbitrary-precision decimal number. Read the documentation for BigDecimal and answer the following questions: <br/>
a. Is BigDecimal an immutable class? <br/>
b. If bd1.equals(bd2) is true, what is bd1.compareTo(bd2)? <br/>
c. If bd1.compareTo(bd2) is 0, when is bd1.equals(bd2) false? <br/>
d. If bd1 represents 1.0 and bd2 represents 5.0, by default what is bd1.divide(bd2)? <br/>
e. If bd1 represents 1.0 and bd2 represents 3.0, by default what is bd1.divide(bd2)? <br/>
f. What is MathContext.DECIMAL128? <br/>
g. Modify the BigRational class to store a MathContext that can be initialized from an additional BigRational constructor (or which defaults to MathContext.UNLIMITED). Then add a toBigDecimal method to the BigRational class.

* Q19) A BinaryArray represents arbitrarily long sequences of binary variables. The private data representation is an array of Boolean variables. For instance, the representation of the BinaryArray “TFTTF” would be an array of length five storing true, false, true, true, false in array indices 0, 1, 2, 3, and 4, respectively. The BinaryArray class has the following functionality:<br/>
a. A one-parameter constructor that contains a String. Throw an IllegalArgumentException if there are illegal characters.<br/>
b. A toString method.<br/>
c. A get and set method to access or change a variable at a particular index.<br/>
d. A size method that returns the number of binary variables in the BinaryArray.<br/>
e. Implement the BinaryArray class, placing it in a package of your choosing<br/>

* Q20) An Account class stores a current balance, and provides getBalance, deposit, withdraw, and toString methods in addition to at least one constructor. Write and test an Account class. Make sure your withdrawmethod throws an exception if appropriate.
