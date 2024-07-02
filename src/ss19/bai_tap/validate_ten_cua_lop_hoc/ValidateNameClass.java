package ss19.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClass {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String NAME_REGEX ="^[CAP][0-9]{4}[GHIK]$";

    public ValidateNameClass() {
        pattern = Pattern.compile(NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
