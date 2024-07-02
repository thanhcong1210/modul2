package ss19.thuc_hanh.ValidateAccount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    /*
    không chứa các ký tự đặt biệt
    phải dài hơn 6 ký tự
    không chứa các ký tự viết hoa
    cho phép dấu gạch dưới (_)
     */
    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
