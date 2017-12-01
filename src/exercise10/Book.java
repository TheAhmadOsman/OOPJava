package exercise10;

import java.util.Comparator;
import java.util.Objects;

/**
 * 
 * Class Book
 * 
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 7: Exercise 10
 * 
**/

public class Book {
    private final String title;
    private final String author;
    private Double price;
    private final Integer year;

    public Book(String title, String author, Double price, Integer year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }
    
    public Book(Book copy) {
        this.title = copy.getTitle();
        this.author = copy.getAuthor();
        this.price = copy.getPrice();
        this.year = copy.getYear();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getYear() {
        return year;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.title);
        hash = 37 * hash + Objects.hashCode(this.author);
        hash = 37 * hash + Objects.hashCode(this.price);
        hash = 37 * hash + Objects.hashCode(this.year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        if (!Objects.equals(this.year, other.year)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") by " + author + String.format(" costs $%.2f", price);
    }
}

class ByTitle implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        String t1 = b1.getTitle();
        String t2 = b2.getTitle();
        
        return t1.compareTo(t2);
    }
}

class ByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        String a1 = b1.getAuthor();
        String a2 = b2.getAuthor();
        
        return a1.compareTo(a2);
    }
}

class ByPrice implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        Double p1 = b1.getPrice();
        Double p2 = b2.getPrice();
        
        return (int)(p1 - p2);
    }
}

class ByYear implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        Integer y1 = b1.getYear();
        Integer y2 = b2.getYear();
        
        return y1 - y2;
    }
}