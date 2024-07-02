package ss19.bai_tap.validate_so_dien_thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyPhone {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phoneNumber);

        return m.matches();
    }

    public static void main(String[] args) {
        String validPhoneNumber = "(84)-(0978489648)";
        String invalidPhoneNumber1 = "(a8)-(22222222)";
        String invalidPhoneNumber2 = "(84)-(123456789)";

        System.out.println(validPhoneNumber + " is valid: " + isValidPhoneNumber(validPhoneNumber));
        System.out.println(invalidPhoneNumber1 + " is valid: " + isValidPhoneNumber(invalidPhoneNumber1));
        System.out.println(invalidPhoneNumber2 + " is valid: " + isValidPhoneNumber(invalidPhoneNumber2));
    }
}

