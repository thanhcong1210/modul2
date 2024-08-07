package case_study_modul_2.common;

import java.util.Scanner;
import java.util.regex.Pattern;

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

    private static final String USER_NAME = "^[a-zA-Z0-9]{5,15}$";
    private static final String PASSWORD = "^^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
    private static final String EMAIL = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    public static boolean isUserName(String username) {
        return username.matches(USER_NAME);
    }

    public static boolean isPassword(String password) {
        return password.matches(PASSWORD);
    }

    public static boolean isEmail(String email) {
        return email.matches(EMAIL);
    }

    private static final String BOOK_NAME = "^[A-Za-z0-9 \\\\p{Punct}]{1,100}$";
    private static final String AUTHOR = "^[A-Za-z0-9 \\\\p{Punct}]{1,100}$";

    public static boolean isBookName(String bookName) {
        return bookName.matches(BOOK_NAME);
    }

    public static boolean isAuthor(String author) {
        return author.matches(AUTHOR);
    }
}
