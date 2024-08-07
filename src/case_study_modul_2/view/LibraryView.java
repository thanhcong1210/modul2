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

    public static LibraryView view;

    private LibraryView() {
    }

    public static synchronized LibraryView getLibraryView() {
        if (view == null) {
            view = new LibraryView();
        }
        return view;
    }

    public int homePageView() {
        System.out.println(">>      XIN CHÀO    <<");
        System.out.println("1. Admin");
        System.out.println("2. Người dùng");
        System.out.println("3. Thoát");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 1 || choice > 3) {
                System.err.println("Lựa chọn không đúng\n");
            } else {
                return choice;
            }
        } while (true);
    }

    public int adminPageView() {
        System.out.println(">>      ADMIN      <<");
        System.out.println("1. Thêm sách");
        System.out.println("2. Xóa sách");
        System.out.println("3. Hiển thị sách hiện tại");
        System.out.println("4. Tìm sách");
        System.out.println("5. Sách cho mượn");
        System.out.println("6. Xem danh sách thành viên");
        System.out.println("7. Xóa thành viên");
        System.out.println("8. Quay lại");
        System.out.print("Chọn chức năng: ");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 1 || choice > 8) {
                System.err.println("Lựa chọn không khả dụng\n");
            } else {
                return choice;
            }
        } while (true);
    }

    public int userPageView() {
        System.out.println(">>      NGƯỜI DÙNG      <<");
        System.out.println("1. Xem sách hiện tại");
        System.out.println("2. Mượn sách");
        System.out.println("3. Trả sách");
        System.out.println("4. Tìm sách");
        System.out.println("5. Sách đang mượn");
        System.out.println("6. Quay lại");
        System.out.print("Chọn chức năng: ");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 1 || choice > 6) {
                System.err.println("Lựa chọn không đúng");
            } else {
                return choice;
            }
        } while (true);
    }

    public int userLoginView() {
        System.out.println(">>      TRANG ĐĂNG NHẬP      <<");
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        System.out.println("3. Quay lại");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 1 || choice > 3) {
                System.err.println("Lựa chọn không đúng");
            } else {
                return choice;
            }
        } while (true);
    }

    public User Registration() {
        do {
            System.out.println(">>      ĐĂNG KÝ      <<");
            System.out.println("Tài khoản");
            String username = scanner.nextLine().toUpperCase();
            if (!FixBug.isUserName(username)) {
                System.err.println("Tên đăng nhập phải là chữ cái hoặc số! (từ 6-16 ký tự!!!)");
                continue;
            }
            System.out.print("Mật khẩu: ");
            String password = scanner.nextLine();
            if (!FixBug.isPassword(password)) {
                System.err.println("Mật khẩu phải là chữ cái, số hoặc ký tự đặc biệt (từ 8-16 ký tự!!!)");
                continue;
            }
            System.out.print("Xác nhận mật khẩu: ");
            String confirmPassword = scanner.nextLine();
            if (!confirmPassword.equals(password)) {
                System.err.println("Mật khẩu xác nhận không trùng kh��p!");
                continue;
            }
            System.out.print("Họ tên: ");
            String name = scanner.nextLine().toUpperCase();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            if (!FixBug.isEmail(email)) {
                System.err.println("Email không hợp lệ!");
                continue;
            }
            return new User(username, password, name, email);
        } while (true);
    }

    public String[] Login() {
        System.out.println(">>      ĐĂNG NHẬP      <<");
        System.out.print("Tên tài khoản: ");
        String userName = scanner.nextLine().toUpperCase();
        System.out.print("Mật khẩu: ");
        String password = scanner.nextLine();
        return new String[]{userName, password};
    }

    public void viewLogin(boolean result) {
        if (result) {
            System.out.println(">>    Đăng nhập thành công   <<");
        } else {
            System.err.println(">>    Đăng nhập thất bại     <<");
        }
    }

    public void viewRegister(boolean result) {
        if (result) {
            System.out.println(">>    Đăng ký thành công     <<");
        } else {
            System.err.println(">>    Đăng ký thất bại     <<");
        }
    }

    public void viewMessage(boolean result) {
        if (result) {
            System.out.println(">>     Thông báo thành công    <<");
        } else {
            System.err.println(">>     Thông báo thất bại      <<");
        }
    }

    public Book viewAddBook() {
        do {
            System.out.println(">>      THÊM SÁCH      <<");
            System.out.println(">>      Tên sách       <<");
            String name = scanner.nextLine().toUpperCase();
            if (!FixBug.isBookName(name)) {
                System.err.println("Tên sách phải từ 3-50 ký tự!. Không hợp lệ");
                continue;
            }
            System.out.println(">>      Tác giả      <<");
            String author = scanner.nextLine().toUpperCase();
            if (!FixBug.isAuthor(author)) {
                System.err.println("Tên tác giả phải từ 3-50 ký tự!. Không hợp lệ");
                continue;
            }
            return new Book(name, author);
        } while (true);
    }

    public Book viewRemoveBook() {
        System.out.println(">>      XÓA SÁCH      <<");
        System.out.print("Tên sách: ");
        String name = scanner.nextLine().toUpperCase();
        System.out.print("Tác giả: ");
        String author = scanner.nextLine().toUpperCase();
        return new Book(name, author);
    }

    public int viewFindBook() {
        System.out.println(">>      TÌM SÁCH      <<");
        System.out.print("1. Tìm theo tên sách ");
        System.out.print("2. Tìm theo tên tác giả ");
        System.out.print("3. Trở lại ");
        int choice;
        do {
            choice = FixBug.checkChoice();
            if (choice < 1 || choice > 3) {
                System.err.println(">>      Lựa chọn không đúng      <<");
            } else {
                return choice;
            }
        } while (true);
    }

    public String viewFindByName() {
        System.out.print("Tên sách cần tìm : ");
        return scanner.nextLine().toUpperCase();
    }

    public String viewFindByAuthor() {
        System.out.print("Tên tác giả cần tìm : ");
        return scanner.nextLine().toUpperCase();
    }

    public void viewBookLoan(HashMap<BookLoan, Integer> bookLoan) {
        System.out.println(">>      SÁCH ĐANG CHO MƯỢN      <<");
        System.out.println("Tài khoản");
        System.out.println("Tên sách");
        System.out.println("Tác giả");
        for (BookLoan key : bookLoan.keySet()) {
            Integer value = bookLoan.get(key);
            System.out.format(key.getUserNameBorrowed(), key.getNameBookBorrowed(), key.getAuthorBookBorrowed(), value);
        }
    }

    public void viewListBook(HashMap<Book, Integer> book) {
        System.out.println(">>      SÁCH HIỆN TẠI      <<");
        System.out.println("Tên sách");
        System.out.println("Tác giả");
        System.out.println("Số lượng");
        for (Book key : book.keySet()) {
            Integer value = book.get(key);
            System.out.format(key.getName(), key.getAuthor(), value);
        }
    }

    public String viewBorrowedBook() {
        System.out.println(">>      MƯỢN SÁCH      <<");
        System.out.println("Nhập tên sách cần mượn");
        return scanner.nextLine().toUpperCase();
    }

    public String viewReturnedBook() {
        System.out.println(">>      TRẢ SÁCH      <<");
        System.out.println("Nhập tên sách cần trả");
        return scanner.nextLine().toUpperCase();
    }

    public boolean viewRemove() {
        do {
            System.out.println("Bạn có đồng ý xóa (nhấn M để đồng ý xóa, nhấn N để hủy");
            String choice = scanner.nextLine();
            choice = choice.toUpperCase();
            if (choice.equals("M")) {
                return true;
            } else if (choice.equals("N")) {
                return false;
            } else {
                System.err.println(">>      Lựa chọn không hợp lệ     <<");
            }
        } while (true);
    }

    public void viewCancel() {
        System.out.println("Thông báo hủy");
    }

    public void viewListUser(List<User> users) {
        System.out.println(">>      DANH SÁCH NGƯỜI DÙNG      <<");
        System.out.println("Tài khoản");
        System.out.println("Họ tên");
        System.out.println("Email");
        for (User user : users) {
            System.out.format("%s, %s, %s%n", user.getUsername(), user.getName(), user.getEmail());
        }
    }

    public String viewRemoveUser() {
        System.out.println(">>      XÓA NGƯỜI DÙNG      <<");
        System.out.print("Tài khoản cần xóa: ");
        return scanner.nextLine().toUpperCase();
    }

    public int viewQuantity() {
        return FixBug.checkQuatity();
    }

}
