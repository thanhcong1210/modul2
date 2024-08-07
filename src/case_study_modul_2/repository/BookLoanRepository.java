package case_study_modul_2.repository;

import case_study_modul_2.model.BookLoan;

import java.io.*;
import java.util.HashMap;

public class BookLoanRepository {
    private static BookLoanRepository bookLoanRepository;

    private BookLoanRepository() {
    }

    public static synchronized BookLoanRepository getRepository() {
        if (bookLoanRepository == null) {
            bookLoanRepository = new BookLoanRepository();
        }
        return bookLoanRepository;
    }

    private final String BOOK_LOAN_FILE = "src/case_study_modul_2/data/bookloan.csv";

    private void writeFile(HashMap<BookLoan, Integer> bookLoan) {
        try (
                FileOutputStream fos = new FileOutputStream(BOOK_LOAN_FILE);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(bookLoan);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file!!!");
        }
    }

    public HashMap<BookLoan, Integer> getAll() {
        HashMap<BookLoan, Integer> bookLoanMap = new HashMap<>();
        try (
                FileInputStream fos = new FileInputStream(BOOK_LOAN_FILE);
                ObjectInputStream ois = new ObjectInputStream(fos)
        ) {
            bookLoanMap = (HashMap<BookLoan, Integer>) ois.readObject();
        } catch (EOFException eof) {
        } catch (ClassNotFoundException | IOException e) {
            System.err.println("Lỗi đọc file!!!");
        }
        return bookLoanMap;
    }

    public void add(BookLoan bookLoan, int quantity) {
        HashMap<BookLoan, Integer> bookLoan2 = getAll();
        if (bookLoan2.containsKey(bookLoan)) {
            bookLoan2.put(bookLoan, bookLoan2.get(bookLoan) + quantity);
        } else {
            bookLoan2.put(bookLoan, quantity);
        }
        writeFile(bookLoan2);
    }

    public boolean remove(BookLoan bookLoan, int quantity) {
        HashMap<BookLoan, Integer> bookLoanMap = getAll();
        Integer choice;
        for (BookLoan key : bookLoanMap.keySet()) {
            choice = bookLoanMap.get(key);
            if (key.equals(bookLoan)) {
                if (choice > quantity) {
                    bookLoanMap.put(key, choice - quantity);
                    writeFile(bookLoanMap);
                    return true;
                } else if (choice == quantity) {
                    bookLoanMap.remove(key);
                    writeFile(bookLoanMap);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public HashMap<BookLoan, Integer> findByUserName(String name) {
        HashMap<BookLoan, Integer> bookLoanMap = getAll();
        HashMap<BookLoan, Integer> result = new HashMap<>();
        for (BookLoan key : bookLoanMap.keySet()) {
            if (key.getUserNameBorrowed().equals(name)) {
                result.put(key, bookLoanMap.get(key));
            }
        }
        return result;
    }
}
