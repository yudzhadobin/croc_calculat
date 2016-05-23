package operations;

/**
 *  Class represents operation minus
 */
public class Minus implements Operation {


    /**
     *  Class represents operation minus for two fractions
     */
    @Override
    public Fraction calculate(Fraction a, Fraction b) {
        calculateDenominator(a, b);
        return new Fraction(a.getNumerator() - b.getNumerator(), a.getDenominator());
    }

}
