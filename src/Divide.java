/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class Divide implements Operation {
    @Override
    public Fraction calculate(Fraction a, Fraction b) {
        return new Fraction(a.getNumerator() * b.getDenominator(), a.getDenominator() * b.getNumerator());
    }
}

