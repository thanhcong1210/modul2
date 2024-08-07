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
    private final LibraryView libraryView = LibraryView.getLibraryView();
    private final AdminService adminService = AdminService.getService();
    private final BookService bookService = BookService.getBookService();
    private final BookLoanService bookLoanService = BookLoanService.getBookLoanService();
    private final UserService userService = UserService.getUserService();

    private static LibraryController libraryController;

    private LibraryController() {
    }

    public static synchronized LibraryController getLibraryController() {
        if (libraryController == null) {
            libraryController = new LibraryController();
        }
        return libraryController;
    }

    String[] dang;

    public void begin() {
        boolean result;
        while (true) {
            int choice = libraryView.homePageView();
            switch (choice) {
                case 1:
                    dang = libraryView.Login();
                    result = adminService.loginAdmin(dang);
                    if (result) {
                        libraryView.viewLogin(true);
                        handleAdmin();
                    } else {
                        libraryView.viewLogin(false);
                    }
                    break;
                case 2:
                    loginUser();
                    break;
                case 0:
                    return;
            }
        }
    }

    private void loginUser() {
        boolean result;
        List<User> user1;
        User user;
        while (true) {
            int choice = libraryView.userLoginView();
            switch (choice) {
                case 1:
                    dang = libraryView.Login();
                    user1 = userService.getAll();
                    result = adminService.loginUser(user1, dang);
                    if (result) {
                        libraryView.viewLogin(true);
                        handleUser();
                    } else {
                        libraryView.viewLogin(false);
                    }
                    break;
                case 2:
                    user = libraryView.Registration();
                    result = userService.add(user);
                    libraryView.viewRegister(result);
                    break;
                case 3:
                    return;
            }
        }
    }

    private void handleAdmin() {
        Book book12;
        String string;
        int quantity;
        List<User> user;
        HashMap<Book, Integer> books;
        HashMap<BookLoan, Integer> bookLoan;
        while (true) {
            int choice = libraryView.adminPageView();
            boolean result;
            switch (choice) {
                case 1:
                    book12 = libraryView.viewAddBook();
                    quantity = libraryView.viewQuantity();
                    bookService.add(book12, quantity);
                    libraryView.viewMessage(true);
                    break;
                case 2:
                    book12 = libraryView.viewRemoveBook();
                    quantity = libraryView.viewQuantity();
                    if (libraryView.viewRemove()) {
                        result = bookService.remove(book12, quantity);
                        libraryView.viewMessage(result);
                    } else {
                        libraryView.viewCancel();
                    }
                    break;
                case 3:
                    books = bookService.getAll();
                    libraryView.viewListBook(books);
                    break;
                case 4:
                    FindBook();
                    break;
                case 5:
                    bookLoan = bookLoanService.getAll();
                    libraryView.viewBookLoan(bookLoan);
                    break;
                case 6:
                    user = userService.getAll();
                    libraryView.viewListUser(user);
                    break;
                case 7:
                    string = libraryView.viewRemoveUser();
                    if (libraryView.viewRemove()) {
                        result = userService.remove(string);
                        libraryView.viewMessage(result);
                    } else {
                        libraryView.viewCancel();
                    }
                    break;
                case 8:
                    return;
            }
        }
    }

    private void handleUser() {
        Book book;
        BookLoan bookLoan;
        HashMap<BookLoan, Integer> bookLoan2;
        while (true) {
            int choice = libraryView.userPageView();
            HashMap<Book, Integer> book2;
            String string;
            switch (choice) {
                case 1:
                    book2 = bookService.getAll();
                    libraryView.viewListBook(book2);
                    break;
                case 2:
                    string = libraryView.viewBorrowedBook();
                    book2 = bookService.getAll();
                    book = bookService.getBookName(book2, string);
                    if (book != null) {
                        bookLoan = new BookLoan(dang[0], book.getName(), book.getAuthor());
                        bookLoanService.add(bookLoan, 1);
                        bookService.remove(book, 1);
                        libraryView.viewMessage(true);
                    } else {
                        libraryView.viewMessage(false);
                    }
                    break;
                case 3:
                    string = libraryView.viewReturnedBook();
                    bookLoan2 = bookLoanService.getAll();
                    bookLoan = bookLoanService.getBookLoanName(bookLoan2, string);
                    if (bookLoan != null && dang[0].equals(bookLoan.getUserNameBorrowed())) {
                        book = new Book(bookLoan.getNameBookBorrowed(), bookLoan.getAuthorBookBorrowed());
                        bookService.add(book, 1);
                        bookLoanService.remove(bookLoan, 1);
                        libraryView.viewMessage(true);
                    } else {
                        libraryView.viewMessage(false);
                    }
                    break;
                case 4:
                    FindBook();
                    break;
                case 5:
                    BookLoanService.findByUserName(dang[0]);
                    break;
                case 6:
                    return;
            }
        }
    }

    private void FindBook() {
        String string;
        while (true) {
            int choice = libraryView.viewFindBook();
            switch (choice) {
                case 1:
                    string = libraryView.viewFindByName();
                    bookService.findByName(string);
                    break;
                case 2:
                    string = libraryView.viewFindByAuthor();
                    bookService.findByAuthor(string);
                    break;
                case 3:
                    return;
            }
        }
    }
}