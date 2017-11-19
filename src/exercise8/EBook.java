package exercise8;

/**
 * 
 * Class EBook
 * MediaLIbrary code 4
 * Implement the constructor that calls a constructor of the superclass
 * Override methods checkin and checkout. They should do nothing
 * Implement method getInfo that returns detailed description of an ebook
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 5: Exercise 8
 * 
**/

public class EBook extends Book {
  private final String format;

    public EBook(String format, String author, int publishingYear, long id, String title) {
        super(author, publishingYear, id, title, 1);
        this.format = format;
    }

    @Override
    public void checkin() {
    }

    @Override
    public void checkout() {
    }

    @Override
    public String getInfo() {
        return author + " (" + publishingYear + "). " + title + " is available for " + format;
    }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
}