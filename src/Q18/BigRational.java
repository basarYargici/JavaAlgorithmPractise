package Q18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;


/**
 * Project: DataStructuresMidterm
 * Package: Q18
 * <p>
 *
 * @author YARGICI
 * Date 12/1/2020
 * <p>
 * Q18-g) Modify the BigRational class to store a MathContext that can be initialized
 * from an additional BigRational constructor(or which defaults to MathContext.UNLIMITED).
 * Then add a toBigDecimal method to the BigRational class.
 */
public class BigRational {
    public static final BigRational ZERO = new BigRational();
    public static final BigRational ONE = new BigRational("1");


    public BigRational() {
        this(BigInteger.ZERO);
    }

    public BigRational(MathContext mathContext) {
        this.mathContext = mathContext;
    }

    public BigRational(BigInteger n) {
        this(n, BigInteger.ONE);
    }

    public BigRational(BigInteger n, BigInteger d) {
        num = n;
        den = d;
        check00();
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
            check00();
            fixSigns();
            reduce();
        }
    }

//    private BigDecimal toBigDecimal(BigRational bigRational){
//        BigDecimal bd = new BigDecimal(bigRational);
//        return 0;
//    }

    private void check00() {
        if (num.equals(BigInteger.ZERO) && den.equals(BigInteger.ZERO))
            throw new ArithmeticException("ZERO DIVIDE BY ZERO");
    }

    private void fixSigns() {
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
    }

    private void reduce() {
        BigInteger gcd = num.gcd(den);
        num = num.divide(gcd);
        den = den.divide(gcd);
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

    public String toString() {
        if (den.equals(BigInteger.ZERO))
            if (num.compareTo(BigInteger.ZERO) < 0)
                return "-infinity";
            else
                return "infinity";

        if (den.equals(BigInteger.ONE))
            return num.toString();
        else
            return num + "/" + den;
    }

    private BigInteger num; // only this can be neg
    private BigInteger den; // never negative
    private MathContext mathContext;
}

class Test{
//    public static void main(String[] args) {
//        BigRational br = new BigRational(new MathContext());
//        System.out.println(br.toString());
//    }
}