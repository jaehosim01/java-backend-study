package librarytracker.service;

import librarytracker.exception.BookNotFoundException;
import librarytracker.model.Book;
import librarytracker.model.BookStatus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryService {
    private final Map<Integer, Book> books = new HashMap<>();
    private int nextBookNumber = 1;

    public Book addBook(String category, String title, String author) {
         Book newBook = new Book(
                nextBookNumber,
                category,
                title,
                author
        );

         books.put(nextBookNumber++, newBook);
         return newBook;
    }
    
    public List<Book> getAllBooks() {
        List<Book> allBooks = new ArrayList<>(books.values());
        return allBooks;
    }

    public List<Book> searchByTitle(String title) {
        ArrayList<Book> bookList = new ArrayList<>();

        for(Book book: books.values()) {
            if(book.getTitle().equalsIgnoreCase(title)) {
                bookList.add(book);
            }
        }

        return bookList;
    }

    private Book findBookByNumber(int bookNumber) {
        Book book = books.get(bookNumber);
        if(book == null) {
            throw new BookNotFoundException("Book not found: " + bookNumber);
        }
        return book;
    }

    public void borrowBook(int bookNumber) {
        Book book = findBookByNumber(bookNumber);
        book.borrow();
    }

    public void returnBook(int bookNumber) {
        Book book = findBookByNumber(bookNumber);
        book.returnBook();
    }

    public Book deleteBook(int bookNumber) {
        Book book = findBookByNumber(bookNumber);
        books.remove(bookNumber);

        return book;
    }

    public Map<BookStatus, Integer> countByStatus() {
        Map<BookStatus, Integer> statusCounts = new HashMap<>();
        for(BookStatus status: BookStatus.values()) {
            statusCounts.put(status, 0);
        }

        for(Book book: books.values()) {
            statusCounts.put(book.getStatus(), statusCounts.getOrDefault(book.getStatus(), 0) + 1);
        }

        return statusCounts;
    }
}
