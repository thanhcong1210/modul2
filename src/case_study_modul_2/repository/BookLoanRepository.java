package case_study_modul_2.repository;

import case_study_modul_2.model.BookLoan;

import java.io.*;
import java.util.HashMap;

public class BookLoanRepository {
    private static BookLoanRepository bookLoanRepository;
    private final String BOOK_LOAN = "D:\\modul2\\untitled\\src\\case_study_modul_2\\data\\bookloan.dat";

    private BookLoanRepository() {
    }

    public static synchronized BookLoanRepository getRepository() {
        if (bookLoanRepository == null) {
            bookLoanRepository = new BookLoanRepository();
        }
        return bookLoanRepository;
    }

    public HashMap<BookLoan, Integer> getAll() {
        HashMap<BookLoan, Integer> bookLoan = new HashMap<BookLoan, Integer>();
        try(
                FileInputStream fis = new FileInputStream(BOOK_LOAN);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ){
            bookLoan = (HashMap<BookLoan, Integer>) ois.readObject();
        } catch (EOFException ignored) {
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi đọc file!!!");
        }
        return bookLoan;
    }

    private void writeFile(HashMap<BookLoan, Integer> bookLoan){
        try(
                FileOutputStream fos = new FileOutputStream(BOOK_LOAN);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){
            oos.writeObject(bookLoan);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file!!!");
        }
    }

    public void add(BookLoan bookLoan, int quantity){
        HashMap<BookLoan, Integer> bookLoanMap = getAll();
        if (bookLoanMap.containsKey(bookLoan)) {
            bookLoanMap.put(bookLoan, bookLoanMap.get(bookLoan) + quantity);
        } else {
            bookLoanMap.put(bookLoan, quantity);
        }
        writeFile(bookLoanMap);
    }

    public boolean remove(BookLoan bookLoan, int quantity){
        HashMap<BookLoan, Integer> bookLoanMap = getAll();
        Integer choice;
        for (BookLoan key : bookLoanMap.keySet()) {
            choice = bookLoanMap.get(key);
            if (key.equals(bookLoan)) {
                if (choice == quantity) {
                    bookLoanMap.remove(key);
                    writeFile(bookLoanMap);
                    return true;
                } else if (choice > quantity) {
                    bookLoanMap.put(key, choice - quantity);
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
