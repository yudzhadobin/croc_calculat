package operations;

/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class Plus implements Operation {


    @Override
    public Fraction calculate(Fraction a, Fraction b) {
        calculateDenominator(a, b);
        return new Fraction(a.getNumerator() + b.getNumerator(), a.getDenominator());
    }

}
