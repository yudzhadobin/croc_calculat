package operations;

import java.util.List;

/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class Calculator {

    public Fraction calculate(List<String> expression) {
        OperationService operationService = new OperationService();
        Fraction a = new Fraction(expression.get(0), expression.get(2));
        Operation operation = operationService.getOperation(expression.get(3));
        Fraction b = new Fraction(expression.get(4), expression.get(6));
        return operation.calculate(a, b);
    }


}
