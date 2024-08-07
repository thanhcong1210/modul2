package case_study_modul_2.controller;

import case_study_modul_2.model.Book;
import case_study_modul_2.model.BookLoan;
import case_study_modul_2.model.User;
import case_study_modul_2.service.AdminService;
import case_study_modul_2.service.BookLoanService;
import case_study_modul_2.service.BookService;
import case_study_modul_2.service.UserService;
import case_study_modul_2.view.LibraryView;

import java.util.HashMap;
import java.util.List;

public class LibraryController {
    private final UserService userService = UserService.getService();
    private final BookService bookService = BookService.getService();
    private final BookLoanService bookLoanService = BookLoanService.getService();
    private final LibraryView libraryView = LibraryView.getView();
    private final AdminService adminService = AdminService.getService();

    private static LibraryController libraryController;

    private LibraryController() {
    }

    public static synchronized LibraryController getLibraryController() {
        if (libraryController == null) {
            libraryController = new LibraryController();
        }
        return libraryController;
    }

    String[] go;

    public void begin() {
        boolean result;
        while (true) {
            int choice = libraryView.homePage();
            switch (choice) {
                case 1:
                    go = libraryView.login();
                    result = adminService.loginAdmin(go);
                    if (result) {
                        libraryView.loginMessage(true);
                        handleAdmin();
                    } else {
                        libraryView.loginMessage(false);
                    }
                    break;
                case 2:
                    handleUserLogin();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void handleAdmin() {
        String string;
        int quantity;
        Book book;
        List<User> userList;
        HashMap<Book, Integer> book1;
        HashMap<BookLoan, Integer> bookLoan;
        while (true) {
            int choice = libraryView.adminMenuView();
            boolean result;
            switch (choice) {
                case 1:
                    book = libraryView.addBook();
                    quantity = libraryView.quantityBook();
                    libraryView.messageView(true);
                    break;
                case 2:
                    book = libraryView.removeBookView();
                    quantity = libraryView.quantityBook();
                    if (libraryView.confirmRemove()) {
                        result = bookService.remove(book, quantity);
                        libraryView.messageView(result);
                    } else {
                        libraryView.messageCancel();
                    }
                    break;
                case 3:
                    bookLoan = bookLoanService.getAll();
                    libraryView.bookLoan(bookLoan);
                    break;
                case 4:
                    book1 = bookService.getAll();
                    libraryView.listBook(book1);
                    break;
                case 5:
                    handleFindBook();
                    break;
                case 6:
                    userList = userService.getAll();
                    libraryView.listUserView(userList);
                    break;
                case 7:
                    string = libraryView.removeUser();
                    if (libraryView.confirmRemove()) {
                        result = userService.removeUser(string);
                        libraryView.messageView(result);
                    } else {
                        libraryView.messageCancel();
                    }
                    break;
                case 0:
                    return;
            }
        }
    }

    private void handleUserLogin() {
        User user;
        boolean result;
        List<User> userList;
        while (true) {
            int choice = libraryView.loginUser();
            switch (choice) {
                case 1:
                    go = libraryView.login();
                    userList = userService.getAll();
                    result = adminService.loginUser(userList, go);
                    if (result) {
                        libraryView.loginMessage(true);
                        handleUser();
                    } else {
                        libraryView.loginMessage(false);
                    }
                    break;
                case 2:
                    user = libraryView.registration();
                    result = userService.addUser(user);
                    libraryView.registrationMessage(result);
                    break;
                case 0:
                    return;
            }
        }
    }

    private void handleUser() {
        BookLoan bookLoan;
        Book book;
        HashMap<BookLoan, Integer> bookLoan2;
        while (true) {
            int choice = libraryView.userMenu();
            String string;
            HashMap<Book, Integer> book2;
            switch (choice) {
                case 1:
                    book2 = bookService.getAll();
                    libraryView.listBook(book2);
                    break;
                case 2:
                    handleFindBook();
                    break;
                case 3:
                    string = libraryView.BorrowedBook();
                    book2 = bookService.getAll();
                    book = bookService.getBookByName(book2, string);
                    if (book != null) {
                        bookLoan = new BookLoan(go[0], book.getName(), book.getAuthor());
                        bookLoanService.add(bookLoan, 1);
                        bookService.remove(book, 1);
                        libraryView.messageView(true);
                    } else {
                        libraryView.messageView(false);
                    }
                    break;
                case 4:
                    bookLoanService.findByUserName(go[0]);
                    break;
                case 5:
                    string = libraryView.returnBook();
                    bookLoan2 = bookLoanService.getAll();
                    bookLoan = bookLoanService.getBookLoanByName(bookLoan2, string);
                    if (bookLoan != null && go[0].equals(bookLoan.getUserNameBorrowed())) {
                        book = new Book(bookLoan.getNameBookBorrowed(), bookLoan.getAuthorBookBorrowed());
                        bookService.add(book, 1);
                        bookLoanService.remove(bookLoan, 1);
                        libraryView.messageView(true);
                    } else {
                        libraryView.messageView(false);
                    }
                    break;
                    case 0:
                        return;
            }
        }
    }

   private void handleFindBook(){
        String string;
        while (true) {
            int choice = libraryView.findBook();
            switch (choice) {
                case 1:
                    string = libraryView.findByName();
                    bookService.findByName(string);
                    break;
                case 2:
                    string = libraryView.findByAuthor();
                    bookService.findByAuthor(string);
                    break;
                case 0:
                    return;
            }
        }
    }
}
