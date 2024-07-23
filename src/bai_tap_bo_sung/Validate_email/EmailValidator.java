package bai_tap_bo_sung.Validate_email;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean validateEmail(String email) {
        String regex = "^[A-Za-z0-9_]{6,32}@[A-Za-z0-9_]{2,12}\\\\.[A-Za-z0-9_]{2,12}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static List<String> findInvalidEmail(String emailList) {
        String[] emails = emailList.split(";");
        List<String> invalidEmail = new ArrayList<>();

        for (String email : emails) {
            if (!validateEmail(email)) {
                invalidEmail.add(email);
            }
        }
        return invalidEmail;
    }

    public static void main(String[] args) {
        String emailList = "dltcong_123@domain.com;";
        List<String> invalidEmail = findInvalidEmail(emailList);

        System.out.println("Invalid email :");
        for (String email : invalidEmail){
            System.out.println(email);
        }
    }
}
