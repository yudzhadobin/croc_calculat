import java.util.ArrayList;
import java.util.List;

/**
 * Created by yudzh_000 on 18.05.2016.
 */
public class Tokenizer {

    public List<String> tokenize(String input) {
        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == ' ') {
                continue;
            }
            if(isNumber(input.charAt(i))) {
                builder.append(input.charAt(i));
            } else {
                if(builder.length() != 0) {
                    result.add(builder.toString());
                    builder.setLength(0); //clear
                }
                result.add(Character.toString(input.charAt(i)));
            }
        }
        if(builder.length() != 0) {
            result.add(builder.toString());
        }
        return result;
    }

    private boolean isNumber(char ch) {
        return '0' <= ch && ch <= '9';
    }

}
