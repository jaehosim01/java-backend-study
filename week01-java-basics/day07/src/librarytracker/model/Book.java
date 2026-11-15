package librarytracker.model;

public class Book {
    private final int bookNumber;
    private final String category;
    private final String title;
    private final String author;
    private BookStatus status;

    public Book(int bookNumber, String category, String title, String author) {
        if(bookNumber < 1) {
            throw new IllegalArgumentException("Book number must be positive");
        }

        validateNotBlank(category, "Category");
        validateNotBlank(title, "Title");
        validateNotBlank(author, "Author");

        this.bookNumber = bookNumber;
        this.category = category;
        this.title = title;
        this.author = author;
        this.status = BookStatus.AVAILABLE;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public BookStatus getStatus() {
        return status;
    }

    public void borrow() {
        if(status != BookStatus.AVAILABLE) {
           throw new IllegalStateException("Book is not available: " + bookNumber);
        }
        this.status = BookStatus.LOANED;
    }

    public void returnBook() {
        if(status != BookStatus.LOANED) {
            throw new IllegalStateException("Book is not loaned: " + bookNumber);
        }
        this.status = BookStatus.AVAILABLE;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Book Number=" + bookNumber +
                ", Category='" + category + '\'' +
                ", Title='" + title + '\'' +
                ", Author='" + author + '\'' +
                ", Status=" + status +
                '}';
    }

    private static void validateNotBlank(String value, String fieldName) {
        if(value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " cannot be empty");

        }
    }
}
