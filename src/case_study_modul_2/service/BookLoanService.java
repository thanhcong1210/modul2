package case_study_modul_2.service;

import case_study_modul_2.model.BookLoan;
import case_study_modul_2.repository.BookLoanRepository;
import case_study_modul_2.view.LibraryView;

import java.util.HashMap;

public class BookLoanService {
    private static BookLoanService bookLoanService;
    private static LibraryView libraryView = LibraryView.getView();
    private static BookLoanRepository bookLoanRepository = BookLoanRepository.getRepository();

    private BookLoanService() {
    }

    public static synchronized BookLoanService getService() {
        if (bookLoanService == null) {
            bookLoanService = new BookLoanService();
        }
        return bookLoanService;
    }

    public HashMap<BookLoan, Integer> getAll() {
        return bookLoanRepository.getAll();
    }

    public void add(BookLoan bookLoan, Integer quantity) {
        bookLoanRepository.add(bookLoan, quantity);
    }

    public boolean remove(BookLoan bookLoan, Integer quantity) {
        return bookLoanRepository.remove(bookLoan, quantity);
    }

    public BookLoan getBookLoanByName(HashMap<BookLoan, Integer> bookLoan, String name) {
        for (BookLoan key : bookLoan.keySet()) {
            if (key.getNameBookBorrowed().equals(name)) {
                return key;
            }
        }
        return null;
    }

    public void findByUserName(String userName) {
        HashMap<BookLoan, Integer> bookLoanMap = bookLoanRepository.findByUserName(userName);
        if (!bookLoanMap.isEmpty()) {
            libraryView.bookLoan(bookLoanMap);
        } else {
           System.err.println("Không tìm thấy sách cần tìm!!!");
        }
    }
}
