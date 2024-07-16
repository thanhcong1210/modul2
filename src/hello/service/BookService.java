package case_study_2.service;

import case_study_2.model.Book;
import case_study_2.repo.BookRepo;
import case_study_2.view.LibraryView;

import java.util.HashMap;

public class BookService {
    private final BookRepo bookRepo = BookRepo.getBookRepo();
    private final LibraryView view = LibraryView.getLibraryView();

    private static BookService book;

    private BookService() {
    }

    public static synchronized BookService getBookService() {
        if (book == null) {
            book= new BookService();
        }
        return book;
    }

    public void add(Book book, Integer quantity) {
        bookRepo.add(book, quantity);
    }

    public HashMap<Book, Integer> getAll() {
        return bookRepo.getAll();
    }

    public boolean remove(Book book, Integer quantity) {
        return bookRepo.remove(book, quantity);
    }

    public void findByName(String name) {
        HashMap<Book, Integer> books = bookRepo.findByName(name);
        if (!books.isEmpty()) {
            view.viewListBook(books);
        } else {
            System.err.println("Không tìm thấy sách cần tìm\n");
        }
    }

    public void findByAuthor(String author) {
        HashMap<Book, Integer> books = bookRepo.findByAuthor(author);
        if (!books.isEmpty()) {
            view.viewListBook(books);
        } else {
            System.err.println("Không tìm thấy sách cần tìm\n");
        }
    }

    public Book getBookByName(HashMap<Book, Integer> bookMap, String name) {
        for (Book key: bookMap.keySet()) {
            if (key.getName().equals(name)) {
                return key;
            }
        }
        return null;
    }
}
