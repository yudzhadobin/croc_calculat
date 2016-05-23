package operations;

public interface Operation {

    Fraction calculate(Fraction a, Fraction b);

    default void calculateDenominator(Fraction first, Fraction second) {
        int a = first.getDenominator();
        int b = second.getDenominator();
        int max = a > b ? a : b;
        int k = 2;
        int curMax = max;
        while (curMax % a != 0 || curMax % b != 0) {
            curMax = max * k;
            k++;
        }
        first.multipleByValue(curMax / a);
        second.multipleByValue(curMax / b);
    }
}
