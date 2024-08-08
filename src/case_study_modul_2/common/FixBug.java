package case_study_modul_2.common;

import java.util.Scanner;

public class FixBug {
    static Scanner scanner = new Scanner(System.in);
    public static int checkChoice() {
        int choice;
        while (true) {
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập sai. Vui lòng nhập đúng!!!");
            }
        }
        return choice;
    }

    public static int checkQuatity() {
        int choice;
        while (true) {
            try {
                System.out.println("Nhập vào số lượng");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice > 0 && choice <= 100) {
                    break;
                } else {
                    System.err.println("Số lượng phải lớn hơn 0!!!");
                }
            } catch (NumberFormatException e) {
                System.err.println("Error!!!");
            }
        }
        return choice;
    }

    private static final String USER_NAME = "^[a-zA-Z0-9]{6,16}$";
    private static final String PASSWORD = "^[a-zA-Z0-9@]{6,16}$";
    private static final String EMAIL = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
    private static final String STR = "^[^!@#$%^&*()_`~-]{1,300}$";
    private static final String NAME = "^([A-ZĐÀ-ỹa-zđà-ỹ]{1,30}( [A-ZĐÀ-ỹa-zđà-ỹ]{1,30}){0,9})$";

    public static boolean checkUserName(String userName) {
        return userName.matches(USER_NAME);
    }
    public static boolean checkPassword(String password) {
        return password.matches(PASSWORD);
    }
    public static boolean checkEmail(String email) {
        return email.matches(EMAIL);
    }
    public static boolean checkString(String str) {
        return str.matches(STR);
    }
    public static boolean checkName(String name) {
        return name.matches(NAME);
    }
}
