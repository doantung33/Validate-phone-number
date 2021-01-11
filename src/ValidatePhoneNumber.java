import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String REGEX="^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    public static boolean phoneNumber(String s){
        Pattern pattern=Pattern.compile(REGEX);
        Matcher matcher= pattern.matcher(s);
        return matcher.matches();
    }
}
