package librarytracker;

import librarytracker.exception.BookNotFoundException;
import librarytracker.model.Book;
import librarytracker.model.BookStatus;
import librarytracker.service.LibraryService;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int readInt(Scanner scanner, String prompt) {
        while(true) {
            System.out.println(prompt);
            String inputMenu = scanner.nextLine();
            try {
                int intMenu = Integer.parseInt(inputMenu);
                return intMenu;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while(true) {
            System.out.println("""
                    메뉴: 
                    1. Add a book
                    2. View all books
                    3. Search by title
                    4. Borrow a book
                    5. Return a book
                    6. Delete a book
                    7. Count books by status
                    8. Exit
                    """);
            int menu = readInt(scanner, "선택: ");

            if(menu == 8) break;

            try{
                switch (menu) {
                    case 1: // Add a book
                        System.out.print("Book Category: ");
                        String category = scanner.nextLine();
                        System.out.print("Book Title: ");
                        String title = scanner.nextLine();
                        System.out.print("Author: ");
                        String author = scanner.nextLine();
                        Book addedBook = service.addBook(category, title, author);
                        System.out.println("Added: " + addedBook);
                        break;

                    case 2: // View all books
                        List<Book> books = service.getAllBooks();
                        if(books.isEmpty()) {
                            System.out.println("No books found.");
                        } else {
                            for(Book book: books) {
                                System.out.println(book);
                            }
                        }
                        break;

                    case 3: // Search by title
                        System.out.print("Title: ");
                        String searchTitle = scanner.nextLine();
                        List<Book> searchList = service.searchByTitle(searchTitle);
                        if(searchList.isEmpty()) {
                            System.out.println("No matching books found.");
                        } else {
                            for(Book book: searchList) {
                                System.out.println(book);
                            }
                        }
                        break;

                    case 4: // Borrow a book
                        int borrowBookNumber = readInt(scanner, "Book Number to borrow: ");
                        service.borrowBook(borrowBookNumber);
                        System.out.println("Book borrowed: " + borrowBookNumber);
                        break;

                    case 5: // Return a book
                        int returnBookNumber = readInt(scanner, "Book Number to return: ");
                        service.returnBook(returnBookNumber);
                        System.out.println("Book returned: " + returnBookNumber);
                        break;

                    case 6: // Delete a book
                        int deleteBookNumber = readInt(scanner, "Book Number to delete: ");
                        Book deletedBook = service.deleteBook(deleteBookNumber);
                        System.out.println("Deleted: " + deletedBook);
                        break;

                    case 7: // Count books by status
                        Map<BookStatus, Integer> statusCounts = service.countByStatus();
                        for (BookStatus key: statusCounts.keySet()) {
                            System.out.println(key + " : " + statusCounts.get(key));
                        }
                        break;

                    default:
                        System.out.println("Invalid Menu!");
                        break;
                }
            } catch (BookNotFoundException | IllegalStateException | IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        scanner.close();
    }
}

