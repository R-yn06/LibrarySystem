/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandregister;

/**
 *
 * @author glyzi
 */
public class Book {
 
    // These are the details of the book
    String title;
    String author;
    int pages;
    boolean isBorrowed;
 
    // Constructor - used to create a new Book object
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.isBorrowed = false; // when added, book is not yet borrowed
    }
 
    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public boolean isBorrowed() { return isBorrowed; }
    public void setBorrowed(boolean borrowed) { this.isBorrowed = borrowed; }
    public String getclassify() { return classify(); }

    // This method checks if the book is Long or Short
    public String classify() {
        if (pages > 300) {
            return "Long";
        } else {
            return "Short";
        }
    }
 
    // This method shows the book info as a String
    public String getInfo() {
        String status;
        if (isBorrowed) {
            status = "Borrowed";
        } else {
            status = "Available";
        }
        return "Title: " + title + " | Author: " + author + " | Pages: " + pages
                + " | Type: " + classify() + " | Status: " + status;
    }
    
    //new codeline
    public String toFileString(){
        return title + "|" + author + "|" + pages + "|" + isBorrowed;
    }
    //new codeline
    public static Book fromFileString(String line){
        String[] parts = line.split("\\|");
        
        Book b = new Book(parts[0], parts[1], Integer.parseInt(parts[2]));
        b.isBorrowed = Boolean.parseBoolean(parts[3]);
        
        return b;
    }
}
