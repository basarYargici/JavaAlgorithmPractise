package Q15;


import java.math.BigInteger;

/**
 * Project: DataStructuresMidterm
 * Package: Q15
 * <p>
 *
 * @author Ibrahim Basar YARGICI
 * Date 11/30/2020
 * <p>
 * Q15) Modify the BigRational class so that 0/0 is legal and is interpreted as
 * Indeterminate by toString.
 */
public class BigRational {
    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");

    public BigRational() {
        this(BigInteger.ZERO);
    }

    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    public BigRational(BigInteger n, BigInteger d) {
        num = n;
        den = d;
        fixSigns();
        reduce();
    }

    public BigRational(String str) {
        if (str.length() == 0)
            throw new IllegalArgumentException("Zero-length string");

        // Check for '/'
        int slashIndex = str.indexOf('/');
        if (slashIndex == -1) {
            num = new BigInteger(str.trim());
            den = BigInteger.ONE; // no denominator... use 1
        } else {
            num = new BigInteger(str.substring(0, slashIndex).trim());
            den = new BigInteger(str.substring(slashIndex + 1).trim());
            fixSigns();
            reduce();
        }
    }


    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce() {
        BigInteger gcd = num.gcd(den);
        try {
            num = num.divide(gcd);
            den = den.divide(gcd);
        } catch (Exception ignored) {
        }

    }

    public BigRational abs() {
        return new BigRational(num.abs(), den);
    }

    public BigRational negate() {
        return new BigRational(num.negate(), den);
    }

    public BigRational add(BigRational other) {
        BigInteger newNumerator =
                num.multiply(other.den).add(
                        other.num.multiply(den));
        BigInteger newDenominator = den.multiply(other.den);

        return new BigRational(newNumerator, newDenominator);
    }

    public BigRational subtract(BigRational other) {
        return add(other.negate());
    }

    public BigRational multiply(BigRational other) {
        BigInteger newNumer = num.multiply(other.num);
        BigInteger newDenom = den.multiply(other.den);

        return new BigRational(newNumer, newDenom);
    }

    public BigRational divide(BigRational other) {
        BigInteger newNumer = num.multiply(other.den);
        BigInteger newDenom = den.multiply(other.num);

        return new BigRational(newNumer, newDenom);
    }

    public boolean equals(Object other) {
        if (!(other instanceof BigRational))
            return false;

        BigRational rhs = (BigRational) other;

        return num.equals(rhs.num) && den.equals(rhs.den);
    }

    /**
     * This is the part which I added to this class.
     * This method gets numerator and denominator and returns the result.
     *
     * @return String "Indeterminate", num or num/den results.
     */
    public String toString() {
        if (den.equals(BigInteger.ZERO))
            return "Indeterminate";
        if (den.equals(BigInteger.ONE))
            return num.toString();
        else
            return num + "/" + den;
    }

    private BigInteger num; // only this can be neg
    private BigInteger den; // never negative
}

/**
 * This class contains main function.
 */
class Test {
    /**
     * This is the main function which makes use of BigRational class with objects and toString method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("0");
        BigInteger bi2 = new BigInteger("0");
        BigRational br = new BigRational(bi1, bi2);
        System.out.format("First BigInteger %2s= %3d \nSecond BigInteger %s= %3d \nResult %12s= %3s", " ", bi1, " ", bi2, " ", br.toString());
    }
}