
public class Book {
    //Attributes
    private String isbn;
    private String author = "";
    private String title = "";

    //Constructors
    public Book(String isbn) {
        this.isbn = isbn;
    }
    public Book(String isbn, String author, String title) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    //Operations
    public String getIsbn() {
        return this.isbn;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Book: " + this.title + " Author: " + this.author + " ISBN: " + this.isbn;
    }

    public int compareTo(Book b) {
        return 0;
    }

}
