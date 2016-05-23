package operations;

import operations.*;

/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class OperationService {

    public Operation getOperation(String string) {
        switch (string) {
            case "+":
                return new Plus();
            case "-":
                return new Minus();
            case "*":
                return new Multy();
            case "/":
                return new Divide();
            default:
                throw new ErrorInInput("error in input");
        }
    }
}
