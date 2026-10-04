package Phase1.RegexPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static final Pattern USERNAME_PATTERN =
            Pattern.compile("^[a-zA-Z0-9_-]{3,20}");

    public static final Pattern EMAIL_PATTERN =
            Pattern.compile(
                    "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
            );

    public static final Pattern MOBILE_PATTERN =
            Pattern.compile("^[6-9][0-9]{9}$]");

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile("^(?=.*[0-9]).{8,20}$");

    private static final Pattern EMPLOYEE_PATTERN =
            Pattern.compile("^EMP[0-9]{4}$");

    private static final Pattern PIN_PATTERN =
            Pattern.compile("^[0-9]{6}$");
}
