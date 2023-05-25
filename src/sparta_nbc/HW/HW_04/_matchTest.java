package sparta_nbc.HW.HW_04;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class _matchTest {
    public static void main(String[] args) {
        String input = "Hello, world!";
        String pattern = "Hello.*";

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Pattern matched!");
        } else {
            System.out.println("Pattern did not match.");
        }
    }
}
