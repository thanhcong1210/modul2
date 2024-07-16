package case_study_2.controller;

import case_study_2.model.Book;
import case_study_2.model.BookOnLoan;
import case_study_2.model.User;
import case_study_2.service.BookOnLoanService;
import case_study_2.service.BookService;
import case_study_2.service.Service;
import case_study_2.service.UserService;
import case_study_2.view.LibraryView;

import java.util.HashMap;
import java.util.List;

public class LibraryController {
    private final UserService userService = UserService.getUserService();
    private final BookService bookService = BookService.getBookService();
    private final BookOnLoanService bookOnLoanService = BookOnLoanService.getBookOnLoanService();
    private final LibraryView view = LibraryView.getLibraryView();
    private final Service service = Service.getService();


    private static LibraryController libraryController;

    private LibraryController() {
    }

    public static synchronized LibraryController getLibraryController() {
        if (libraryController == null) {
            libraryController = new LibraryController();
        }
        return libraryController;
    }

    String[] data;

    public void start() {
        boolean result;
        while (true) {
            int choice = view.mainStatusView();
            switch (choice) {
                //thành công
                case 1:
                    data = view.loginView();
                    result = service.checkLoginAdmin(data);
                    if (result) {
                        view.viewLoginMessage(true);
                        handleAdmin();
                    } else {
                        view.viewLoginMessage(false);
                    }
                    break;
                    //đăng nhập đăng ký
                case 2:
                    handleUserLogin();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void handleAdmin() {
        Book book;
        String str;
        int quantity;
        List<User> users;
        HashMap<Book, Integer> bookMap;
        HashMap<BookOnLoan, Integer> bookOnLoanMap;
        while (true) {
            int choice = view.adminStatusView();
            boolean result;
            switch (choice) {
                case 1:
                    book = view.viewAddBook();
                    quantity = view.viewQuantityBook();
                    bookService.add(book, quantity);
                    view.viewMessage(true);
                    break;
                case 2:
                    bookMap = bookService.getAll();
                    view.viewListBook(bookMap);
                    break;
                case 3:
                    bookOnLoanMap = bookOnLoanService.getAll();
                    view.viewListBookOnLoan(bookOnLoanMap);
                    break;
                case 4:
                    users = userService.getAll();
                    view.viewListUser(users);
                    break;
                case 5:
                    book = view.viewRemoveBook();
                    quantity = view.viewQuantityBook();
                    if (view.viewConfirmRemove()) {
                        result = bookService.remove(book, quantity);
                        view.viewMessage(result);
                    } else {
                        view.viewMessageCancel();
                    }
                    break;
                case 6:
                    str = view.viewRemoveUser();
                    if (view.viewConfirmRemove()) {
                        result = userService.remove(str);
                        view.viewMessage(result);
                    } else {
                        view.viewMessageCancel();
                    }
                    break;
                case 7:
                    handleFindBook();
                    break;
                case 0:
                    return;
            }
        }
    }
    /*
    để người dùng có thể chọn một trong những cái ở trong menu
    như mượn sách, trả sách, tìm kiếm sách, hiển thị sách
     */
    private void handleUser() {
        Book book;
        BookOnLoan bookOnLoan;
        HashMap<BookOnLoan, Integer> bookOnLoanMap;
        while (true) {
            int choice = view.userStatusView();
            String str;
            HashMap<Book, Integer> bookMap;
            switch (choice) {
                case 1:
                    bookMap = bookService.getAll();
                    view.viewListBook(bookMap);
                    break;
                case 2:
                    str = view.viewBorrowBook();
                    bookMap = bookService.getAll();
                    book = bookService.getBookByName(bookMap, str);
                    if (book != null) {
                        bookOnLoan = new BookOnLoan(data[0], book.getName(), book.getAuthor());
                        bookOnLoanService.add(bookOnLoan, 1);
                        bookService.remove(book, 1);
                        view.viewMessage(true);
                    } else {
                        view.viewMessage(false);
                    }
                    break;
                case 3:
                    str = view.viewReturnBook();
                    bookOnLoanMap = bookOnLoanService.getAll();
                    bookOnLoan = bookOnLoanService.getBookOnLoanByName(bookOnLoanMap, str);
                    if (bookOnLoan != null && data[0].equals(bookOnLoan.getUsernameBorrow())) {
                        book = new Book(bookOnLoan.getNameBookBorrow(), bookOnLoan.getAuthorBookBorrow());
                        bookService.add(book, 1);
                        bookOnLoanService.remove(bookOnLoan, 1);
                        view.viewMessage(true);
                    } else {
                        view.viewMessage(false);
                    }
                    break;
                case 4:
                    handleFindBook();
                    break;
                case 5:
                    bookOnLoanService.findByUserName(data[0]);
                    break;
                case 0:
                    return;
            }
        }
    }
    /*
    tìm kiếm sách, hiển thị trang tìm kiếm sách
    và để người dùng chọn 1 trong các tùy chọn
    tìm kiếm theo tên hoặc tác giả
    */
    private void handleFindBook() {
        String str;
        while (true) {
            int choice = view.viewFindBook();
            switch (choice) {
                case 1:
                    str = view.viewFindByName();
                    bookService.findByName(str);
                    break;
                case 2:
                    str = view.viewFindByAuthor();
                    bookService.findByAuthor(str);
                    break;
                case 0:
                    return;
            }
        }
    }
    //xử lý quá trình đăng nhập đăng ký
    private void handleUserLogin() {
        boolean result;
        User user;
        List<User> users;
        while (true) {
            int choice = view.userLoginView();  //hiển thị giao diện đăng nhập cho người dùng
            switch (choice) {
                //nếu đăng nhập thành công thì nó sẽ chạy tới handleUser
                case 1:
                    data = view.loginView();
                    users = userService.getAll();
                    result = service.checkLoginUser(users, data);
                    if (result) {
                        view.viewLoginMessage(true);
                        handleUser();
                    } else {
                        view.viewLoginMessage(false);
                    }
                    break;
                    //để người dùng đăng kí tài khoản mới
                case 2:
                    user = view.registerView();
                    result = userService.add(user);
                    view.viewRegisterMessage(result);
                    break;
                case 0:
                    return;
            }
        }
    }

}