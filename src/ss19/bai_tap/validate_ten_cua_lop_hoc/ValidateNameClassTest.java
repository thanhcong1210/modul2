package ss19.bai_tap.validate_ten_cua_lop_hoc;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameClassTest {
    private static ValidateNameClass validateNameClass;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần test :");
        String name = sc.nextLine();
        validateNameClass = new ValidateNameClass();
        boolean isValid = validateNameClass.validate(name);
        if (isValid) {
            System.out.println("Tên lớp :" + name + "hợp lệ");
        }else {
            System.out.println("Tên lớp :" + name + "không hợp lệ");
        }
    }
}
