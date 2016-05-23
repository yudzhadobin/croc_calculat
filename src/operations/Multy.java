package operations;

/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class Multy implements Operation {
    @Override
    public Fraction calculate(Fraction a, Fraction b) {
        return new Fraction(a.getNumerator() * b.getNumerator(), a.getDenominator() * b.getDenominator());
    }
}
