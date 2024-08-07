package case_study_modul_2.service;

import case_study_modul_2.model.BookLoan;
import case_study_modul_2.repository.BookLoanRepository;
import case_study_modul_2.view.LibraryView;

import java.util.HashMap;

public class BookLoanService {
    private static BookLoanService bookLoanService;

    private BookLoanService() {
    }

    public static synchronized BookLoanService getBookLoanService() {
        if (bookLoanService == null) {
            bookLoanService = new BookLoanService();
        }
        return bookLoanService;
    }

    private static final BookLoanRepository bookLoanRepository = BookLoanRepository.getRepository();
    private static final LibraryView libraryView = LibraryView.getLibraryView();

    public HashMap<BookLoan, Integer> getAll() {
        return bookLoanRepository.getAll();
    }

    public void add(BookLoan bookLoan, Integer quantity) {
        bookLoanRepository.add(bookLoan, quantity);
    }

    public boolean remove(BookLoan bookLoan, Integer quantity) {
        return bookLoanRepository.remove(bookLoan, quantity);
    }

    public BookLoan getBookLoanName(HashMap<BookLoan, Integer> bookLoan, String name) {
        for (BookLoan key : bookLoan.keySet()) {
            if (key.getNameBookBorrowed().equals(name)) {
                return key;
            }
        }
        return null;
    }

    public static void findByUserName(String name) {
        HashMap<BookLoan, Integer> bookLoanMap = bookLoanRepository.findByUserName(name);
        if (!bookLoanMap.isEmpty()) {
            libraryView.viewBookLoan(bookLoanMap);
        }else {
            System.err.println("Không tìm thấy sách cần tìm!!!");
        }
    }

}
