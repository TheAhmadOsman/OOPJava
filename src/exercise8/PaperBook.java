package exercise8;

/**
 * 
 * Class PaperBook
 * MediaLIbrary code 3
 * Implement the constructor that calls a constructor of the superclass
 * Implement method move() that changes the location of a book
 * Implement method getInfo() that returns detailed description of a paper book
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 5: Exercise 8
 * 
**/

public class PaperBook extends Book {
  private final int pages;
  private String location;

    public PaperBook(int pages, String location, String author, int publishingYear, long id, String title, int quantity) {
        super(author, publishingYear, id, title, quantity);
        this.pages = pages;
        this.location = location;
    }

    @Override
    public String getInfo() {
        return author + " (" + publishingYear + "). " + title + " is located at " + location;
    }

  /**
   * Get the number of pages
   * @return the value of pages
   */
  public int getPages() {
    return pages;
  }
  
  /**
   * Get the value of location
   * @return the value of location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Set the value of location
   * @param location new value of location
   */
  private void setLocation(String location) {
    this.location = location;
  }

  /**
   * Move an item to a new location
   * @param newLocation 
   */
  public void move(String newLocation) {
    location = newLocation;
  }
  
}