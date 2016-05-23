import operations.Calculator;
import operations.ErrorInInput;
import operations.Fraction;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by yudzh_000 on 23.05.2016.
 */
public class CalculatorTest {
    Calculator calculator;
    Tokenizer tokenizer;

    @Before
    public void init(){
        calculator = new Calculator();
        tokenizer = new Tokenizer();
    }

    @Test
    public void smokeTest() {
        Fraction fraction = calculator.calculate(tokenizer.tokenize("3/4 + 1 / 4"));
        Fraction expected = new Fraction(4,4);
        assertEquals(expected, fraction);
        fraction = calculator.calculate(tokenizer.tokenize("3/4 - 1/2"));
        expected = new Fraction(1,4);
        assertEquals(expected, fraction);
        fraction = calculator.calculate(tokenizer.tokenize("4/4 * 1/2"));
        expected = new Fraction(4,8);
        assertEquals(expected, fraction);
        fraction = calculator.calculate(tokenizer.tokenize("3/4 / 1/2"));
        expected = new Fraction(6,4);
        assertEquals(expected, fraction);

    }


    @Test(expected = ErrorInInput.class)
    public void testIllegalInputExpectedException() {
        List<String> tokenize = tokenizer.tokenize("3/3/3");
    }


}