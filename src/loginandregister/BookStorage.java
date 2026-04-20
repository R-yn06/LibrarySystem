/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandregister;

/**
 *
 * @author glyzi
 */
public class BookStorage {
    private Book[] books = new Book[50];
    private int count = 0;

 
    public Book[] getAllBooks() {
        return this.books;
    }

    public int getCount() {
        return this.count;
    }

    
    public String addBook(Book b) {
        if (count >= books.length) {
            return "Library is full!";
        }
        books[count++] = b;
        return "Book added successfully!";
    }


    public String viewBooks() {
        if (count == 0) {
            return "No books in the library.";
        }

        String result = "===== ALL BOOKS =====\n";
        for (int i = 0; i < count; i++) {
            result += (i + 1) + ". " + books[i].getInfo() + "\n";
        }
        return result;
    }

    
    public String searchBook(String keyword) {
        String result = "===== SEARCH RESULTS =====\n";
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result += books[i].getInfo() + "\n";
                found = true;
            }
        }

        if (!found) {
            result += "No book found.\n";
        }

        return result;
    }

    
    public String borrowBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                if (books[i].isBorrowed()) {
                    return "Book is already borrowed.";
                }
                books[i].setBorrowed(true);
                return "You borrowed: " + books[i].getTitle();
            }
        }
        return "Book not found.";
    }

  
    public String returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                if (!books[i].isBorrowed()) {
                    return "Book was not borrowed.";
                }
                books[i].setBorrowed(false);
                return "Book returned successfully.";
            }
        }
        return "Book not found.";
    }
    public void loadFromReport(String filename) {
    try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filename))) {
        String line;
        // Skip the 3 header lines
        reader.readLine(); // === LIBRARY INVENTORY REPORT ===
        reader.readLine(); // Title | Author | ...
        reader.readLine(); // -----...
        
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) continue;
            String[] parts = line.split(" \\| ");
            if (parts.length >= 5) {
                String title  = parts[0].trim();
                String author = parts[1].trim();
                int pages     = Integer.parseInt(parts[2].trim());
                boolean borrowed = parts[4].trim().equalsIgnoreCase("Borrowed");
                
                Book b = new Book(title, author, pages);
                b.setBorrowed(borrowed);
                addBook(b);
            }
        }
    } catch (java.io.IOException e) {
        System.out.println("No existing report found, starting fresh.");
    }
}
    
    public String classifyBooks() {
        int longBooks = 0;
        int shortBooks = 0;

        for (int i = 0; i < count; i++) {
            if (books[i].getclassify().equals("Long")) {
                longBooks++;
            } else {
                shortBooks++;
            }
        }

        return "===== BOOK CLASSIFICATION =====\n"
             + "Long Books (>300 pages): " + longBooks + "\n"
             + "Short Books (≤300 pages): " + shortBooks;
    }

    public String getReport() {
        String report = "===== LIBRARY REPORT =====\n";
        report += "Total books: " + count + "\n\n";
        report += viewBooks();
        report += "\n" + classifyBooks();
        return report;
    }


    public Book[] getBooks() {
        return books;
    }

    
}

