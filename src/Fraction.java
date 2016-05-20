/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(String numerator, String denominator) {
        this.numerator = Integer.parseInt(numerator);
        this.denominator = Integer.parseInt(denominator);
    }

    public void multipleByValue(int value) {
        this.numerator *= value;
        this.denominator *= value;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
