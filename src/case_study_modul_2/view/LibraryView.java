package case_study_modul_2.view;

import case_study_modul_2.common.FixBug;
import case_study_modul_2.model.Book;
import case_study_modul_2.model.BookLoan;
import case_study_modul_2.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class LibraryView {
    Scanner scanner = new Scanner(System.in);

    private static LibraryView view;

    private LibraryView() {
    }

    public static synchronized LibraryView getView() {
        if (view == null) {
            view = new LibraryView();
        }
        return view;
    }

    public int homePage() {
        System.out.println(">>      XIN CHÀO      <<");
        System.out.println("Bạn là: ");
        System.out.println("1. Admin");
        System.out.println("2. Người dùng");
        System.out.println("0. Thoát");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 0 || choice > 2) {
                System.err.println("Lựa chọn không đúng!!!");
            } else {
                return choice;
            }
        } while (true);
    }

    public int adminMenuView() {
        System.out.println(">>      ADMIN MENU     <<");
        System.out.println("1. Thêm sách");
        System.out.println("2. Xóa sách");
        System.out.println("3. Sách đang cho mượn");
        System.out.println("4. Sách hiện tại");
        System.out.println("5. Tìm sách");
        System.out.println("6. Danh sách thành viên");
        System.out.println("7. Xóa thành viên");
        System.out.println("0. Trở lại");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 0 || choice > 7) {
                System.err.println("Lựa chọn không đúng!!!");
            } else {
                return choice;
            }
        } while (true);
    }

    public int userMenu() {
        System.out.println(">>      USER MENU      <<");
        System.out.println("1. Sách hiện tại");
        System.out.println("2. Tìm sách");
        System.out.println("3. Mượn sách");
        System.out.println("4. Sách đang mượn");
        System.out.println("5. Trả sách");
        System.out.println("0. Trở lại");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 0 || choice > 5) {
                System.err.println("Lựa chọn không đúng!!!");
            } else {
                return choice;
            }
        } while (true);
    }

    public int loginUser() {
        System.out.println(">>     MENU     <<");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("0. Trở lại");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 0 || choice > 2) {
                System.err.println("Lựa chọn không đúng!!!");
            } else {
                return choice;
            }
        } while (true);
    }

    public String[] login() {
        System.out.println(">>      ĐĂNG NHẬP     <<");
        System.out.println("Tài khoản :");
        String userName = scanner.nextLine().toUpperCase();
        System.out.println("Mật khẩu :");
        String password = scanner.nextLine();
        return new String[]{userName, password};
    }

    public User registration() {
        do {
            System.out.println(">>       ĐĂNG KÝ       <<");
            System.out.print("Tên tài khoản: ");
            String username = scanner.nextLine().toUpperCase();
            if (!FixBug.checkUserName(username)) {
                System.err.println("Tên đăng nhập phải là chữ cái hoặc số! (từ 6-16 ký tự!!!)\n");
                continue;
            }
            System.out.print("Mật khẩu: ");
            String password = scanner.nextLine();
            if (!FixBug.checkPassword(password)) {
                System.err.println("Mật khẩu phải là chữ cái, số hoặc ký tự đặc biệt (từ 8-16 ký tự!!!)\n");
                continue;
            }
            System.out.print("Xác nhận mật khẩu: ");
            String confirmPassword = scanner.nextLine();
            if (!confirmPassword.equals(password)) {
                System.err.println("Mật khẩu xác nhận không trùng kh��p!\n");
                continue;
            }
            System.out.print("Họ và tên: ");
            String name = scanner.nextLine().toUpperCase();
            if (!FixBug.checkName(name)) {
                System.err.println("Họ và tên phải là chữ cái (từ 2-50 ký tự!!!)\n");
                continue;
            }
            System.out.print("Email: ");
            String email = scanner.nextLine().toLowerCase();
            if (!FixBug.checkEmail(email)) {
                System.err.println("Email không hợp lệ! (vd: example@gmail.com)\n");
                continue;
            }
            return new User(username, password, name, email);
        } while (true);
    }

    public void loginMessage(boolean login) {
        if (login) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Đăng nhập thất bại!!!");
        }
    }

    public void registrationMessage(boolean registration) {
        if (registration) {
            System.out.println("Đăng ký thành công!");
        } else {
            System.out.println("Đăng ký thất bại!!!");
        }
    }

    public void messageView(boolean enabled) {
        if (enabled) {
            System.out.println("Thao tác thành công");
        } else {
            System.err.println("Thac tác thất bại!!!");
        }
    }

    public Book addBook() {
        do {
            System.out.println(">>     THÊM SÁCH    <<");
            System.out.print("Tên sách: ");
            String title = scanner.nextLine().toUpperCase();
            if (!FixBug.checkString(title)) {
                System.err.println("Tên sách phải là chữ cái (từ 2-50 ký tự!!!)\n");
                continue;
            }
            System.out.print("Tác giả: ");
            String author = scanner.nextLine().toUpperCase();
            if (!FixBug.checkString(author)) {
                System.err.println("Tác giả phải là chữ cái (từ 2-50 ký tự!!!)\n");
                continue;
            }
            return new Book(title, author);
        } while (true);
    }

    public Book removeBookView() {
        System.out.println(">>      XÓA SÁCH     <<");
        System.out.println("Tên sách :");
        String name = scanner.nextLine().toUpperCase();
        System.out.println("Tác giả :");
        String author = scanner.nextLine().toUpperCase();
        return new Book(name, author);
    }

    public int quantityBook() {
        return FixBug.checkQuatity();
    }

    public void listUserView(List<User> user1) {
        System.out.println(">>      DANH SÁCH THÀNH VIÊN     <<");
        System.out.println("Tên đăng nhập");
        System.out.println("Họ và tên");
        System.out.println("Email");
        for (User user : user1) {
            System.out.println(user.getUsername());
            System.out.println(user.getName());
            System.out.println(user.getEmail());
        }
    }

    public String removeUser(){
        System.out.println(">>     XÓA THÀNH VIÊN     <<");
        System.out.println("Nhập tên tài khoản cần xóa");
        return scanner.nextLine().toUpperCase();
    }

    public void listBook(HashMap<Book, Integer> book) {
        System.out.println(">>      SÁCH HIỆN TẠI    <<");
        System.out.println("Tên sách");
        System.out.println("Tác giả");
        System.out.println("Số lượng");
        for (Book key : book.keySet()) {
            Integer value = book.get(key);
            System.out.println(key.getName());
            System.out.println(key.getAuthor());
            System.out.println(value);
        }
    }

    public int findBook() {
        System.out.println(">>     TÌM SÁCH     <<");
        System.out.println("1. Tìm theo tên :");
        System.out.println("2. Tìm theo tác giả");
        System.out.println("0. Trở lại");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 0 || choice > 2) {
                System.err.println("Lựa chọn không đúng!!!");
            } else {
                return choice;
            }
        } while (true);
    }

    public String findByName() {
        System.out.println("Nhập tên sách cần tìm :");
        return scanner.nextLine().toUpperCase();
    }

    public String findByAuthor() {
        System.out.println("Nhập tác giả sách cần tìm :");
        return scanner.nextLine().toUpperCase();
    }

    public boolean confirmRemove() {
        do {
            System.out.println("Bạn có muốn xóa (nhấn A để đồng ý , nhấn F để hủy)");
            String confirm = scanner.nextLine();
            confirm = confirm.toUpperCase();
            if (confirm.equals("A")) {
                return true;
            } else if (confirm.equals("F")) {
                return false;
            } else {
                System.err.println("Lựa chọn không đúng!!!");
            }
        } while (true);
    }

    public void messageCancel() {
        System.out.println("Thao tác không thành công!!!");
    }

    public String BorrowedBook() {
        System.out.println(">>       MƯỢN SÁCH      <<");
        System.out.println("Nhập tên cần mượn :");
        return scanner.nextLine().toUpperCase();
    }

    public String returnBook() {
        System.out.println(">>       TRẢ SÁCH      <<");
        System.out.println("Nhập tên cần trả :");
        return scanner.nextLine().toUpperCase();
    }

    public void bookLoan(HashMap<BookLoan, Integer> bookLoan) {
        System.out.println(">>     SÁCH ĐANG MƯỢN     <<");
        System.out.println("Tài khoản");
        System.out.println("Tên sách");
        System.out.println("Tác giả");
        for (BookLoan key : bookLoan.keySet()) {
            Integer value = bookLoan.get(key);
            System.out.println(key.getUserNameBorrowed());
            System.out.println(key.getNameBookBorrowed());
            System.out.println(key.getAuthorBookBorrowed());
            System.out.println(value);
        }

    }
}
