package case_study_modul_2.service;

import case_study_modul_2.model.Book;
import case_study_modul_2.repository.BookRepository;
import case_study_modul_2.view.LibraryView;

import java.util.HashMap;

public class BookService {

    private static BookService bookService;
    private final BookRepository bookRepository = BookRepository.getRepository();
    private final LibraryView libraryView = LibraryView.getView();

    private BookService() {
    }

    public static synchronized BookService getService() {
        if (bookService == null) {
            bookService = new BookService();
        }
        return bookService;
    }

    public boolean remove(Book book, Integer quantity) {
        return bookRepository.remove(book, quantity);
    }

    public void add(Book book, Integer quantity){
        bookRepository.add(book, quantity);
    }

    public HashMap<Book, Integer> getAll() {
        return bookRepository.getAll();
    }

    public void findByName(String name) {
        HashMap<Book, Integer> books = bookRepository.findByName(name);
        if (!books.isEmpty()) {
            libraryView.listBook(books);
        } else {
            System.err.println("Không tìm thấy sách cần tìm!!!");
        }
    }

    public void findByAuthor(String author) {
        HashMap<Book, Integer> books = bookRepository.findByAuthor(author);
        if (!books.isEmpty()) {
            libraryView.listBook(books);
        } else {
            System.err.println("Không tìm thấy sách cần tìm!!!");
        }
    }

    public Book getBookByName(HashMap<Book, Integer> book, String name){
        for (Book key : book.keySet()){
            if (key.getName().equals(name)){
                return key;
            }
        }
        return null;
    }
}
