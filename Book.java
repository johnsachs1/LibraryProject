package com.company;

public class Book {

    String title;
    boolean borrowed;
    boolean returned;


    // Creates a new Book
    public Book(String bookTitle) {
        this.title = bookTitle;
        this.borrowed = false;
        this.returned = true;
        // Implement this method
    }

    // Marks the book as rented
    public boolean borrowed() {
        return this.borrowed;
        // Implement this method
    }

    // Marks the book as not rented
    public boolean returned() {
        // Implement this method
        return false;
    }

    // Returns true if the book is rented, false otherwise
    public boolean isBorrowed() {

        if (returned == true) {
            System.out.println("This is in stock!");
        } else {
            System.out.println("OH NO ITS NOT HERE!!!! :(((((");
        }

        return false;
    }

    // Returns the title of the book
    public String getTitle() {
        return this.title;
        // Implement this method

    }
    public static void main(String[] arguments) {
        // Small test of the Book class
        Book example = new Book("The Da Vinci Code");
        System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());
        System.out.println("Borrowed? (should be true): " + example.isBorrowed());
        example.returned();
        System.out.println("Borrowed? (should be false): " + example.isBorrowed());

    }
}
