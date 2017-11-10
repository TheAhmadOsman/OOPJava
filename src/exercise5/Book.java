package exercise5;

/**
 * 
 * Class Book
 * Task 2: Create a class Book with the following private data members: String title, String author, double price
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "NA";
        this.author = "NA";
        this.price = 0.0;
    }    
    
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " by " + author + " costs " + price;
    }
}