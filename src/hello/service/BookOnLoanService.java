package hello.service;

import hello.model.BookOnLoan;
import hello.repo.BookOnLoanRepo;
import hello.view.LibraryView;

import java.util.HashMap;

public class BookOnLoanService {
    private static BookOnLoanService bookOnLoan;

    private BookOnLoanService() {
    }

    public static synchronized BookOnLoanService getBookOnLoanService() {
        if (bookOnLoan == null) {
            bookOnLoan = new BookOnLoanService();
        }
        return bookOnLoan;
    }

    private final LibraryView view = LibraryView.getLibraryView();
    private final BookOnLoanRepo bookOnLoanRepo = BookOnLoanRepo.getBookOnLoanRepo();

    public void add(BookOnLoan bookOnLoan, Integer quantity) {
        bookOnLoanRepo.add(bookOnLoan, quantity);
    }

    public HashMap<BookOnLoan, Integer> getAll() {
        return bookOnLoanRepo.getAll();
    }

    public boolean remove(BookOnLoan bookOnLoan, Integer quantity) {
        return bookOnLoanRepo.remove(bookOnLoan, quantity);
    }

    public BookOnLoan getBookOnLoanByName(HashMap<BookOnLoan, Integer> bookOnLoanMap, String name) {
        for (BookOnLoan key: bookOnLoanMap.keySet()) {
            if (key.getNameBookBorrow().equals(name)) {
                return key;
            }
        }
        return null;
    }

    public void findByUserName(String name) {
        HashMap<BookOnLoan, Integer> bookOnLoanMap = bookOnLoanRepo.findByUserName(name);
        if (!bookOnLoanMap.isEmpty()) {
            view.viewListBookOnLoan(bookOnLoanMap);
        } else {
            System.err.println("Không tìm thấy sách cần tìm!\n");
        }
    }
}
