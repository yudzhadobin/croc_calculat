package operations;

/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class ErrorInInput extends RuntimeException {

    public ErrorInInput(String message) {
        super(message);
    }
}
