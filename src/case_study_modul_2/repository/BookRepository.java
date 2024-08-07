package case_study_modul_2.repository;

import case_study_modul_2.model.Book;

import java.io.*;
import java.util.HashMap;

public class BookRepository {
    private static final String FILE_BOOK = "D:\\modul2\\untitled\\src\\case_study_modul_2\\data\\book.dat";
    private static BookRepository bookRepository;

    private BookRepository() {
    }

    public static synchronized BookRepository getRepository() {
        if (bookRepository == null) {
            bookRepository = new BookRepository();
        }
        return bookRepository;
    }

    public boolean remove(Book book, int quantity) {
        HashMap<Book, Integer> book1 = getAll();
        Integer choice;
        for (Book key : book1.keySet()) {
            choice = book1.get(key);
            if (key.equals(book)) {
                if (choice > quantity) {
                    book1.put(key, choice - quantity);
                    writeFile(book1);
                    return true;
                } else if (choice == quantity) {
                    book1.remove(key);
                    writeFile(book1);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public HashMap<Book, Integer> getAll() {
        HashMap<Book, Integer> book = new HashMap<>();
        try(
                FileInputStream fis = new FileInputStream(FILE_BOOK);
                ObjectInputStream ois = new ObjectInputStream(fis)
                ) {
            book = (HashMap<Book, Integer>) ois.readObject();
        } catch (EOFException ignored) {
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi đọc file!!!");
        }
        return book;
    }

    public void writeFile(HashMap<Book, Integer> book){
        try(
                FileOutputStream fos = new FileOutputStream(FILE_BOOK);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ){
            oos.writeObject(book);
        } catch (IOException e) {
            System.err.println("Lỗi ghi file!!!");
        }
    }

    public void add(Book book, int quantity) {
        HashMap<Book, Integer> book1 = getAll();
        if (book1.containsKey(book)) {
            book1.put(book, book1.get(book) + quantity);
        } else {
            book1.put(book, quantity);
        }
        writeFile(book1);
    }

    public HashMap<Book, Integer> findByName(String name) {
        HashMap<Book, Integer> bookMap = getAll();
        HashMap<Book, Integer> result = new HashMap<>();
        for (Book key : bookMap.keySet()) {
            if (key.getName().equals(name)) {
                result.put(key, bookMap.get(key));
            }
        }
        return result;
    }

    public HashMap<Book, Integer> findByAuthor(String author){
        HashMap<Book, Integer> bookMap = getAll();
        HashMap<Book, Integer> result = new HashMap<>();
        for (Book key : bookMap.keySet()) {
            if (key.getAuthor().equals(author)) {
                result.put(key, bookMap.get(key));
            }
        }
        return result;
    }
}
