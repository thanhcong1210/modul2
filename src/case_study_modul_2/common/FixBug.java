package case_study_modul_2.common;

import java.util.Scanner;

public class FixBug {
    private static Scanner scanner = new Scanner(System.in);

    public static int checkChoice() {
        int choice;
        while (true) {
            try {
                System.out.print("Nhập lựa chọn của bạn: ");
                choice = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Error!!!");
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
    public static boolean isUserName(String username) {
        return username.matches(USER_NAME);
    }

    private static final String PASSWORD = "^[a-zA-Z0-9@]{6,16}$";
    public static boolean isPassword(String password) {
        return password.matches(PASSWORD);
    }

    private static final String EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    public static boolean isEmail(String email) {
        return email.matches(EMAIL);
    }

    private static final String BOOK_AUTHOR_NAME = "^[^!@#$%^&*()_`~-]{1,300}$";
    public static boolean isBookAuthorName(String bookName) {
        return bookName.matches(BOOK_AUTHOR_NAME);
    }

}
