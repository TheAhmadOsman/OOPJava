package notes;

/**
 * Class Game
 * Task 0: Create a class Game with the following private data members: String title, int rating
 * @author yasiro01
 */
public class Game {
  private final String title;
  private final int rating;

  public Game(String title, int rating) {
    this.title = title;
    this.rating = rating;
  }

  public String getTitle() {
    return title;
  }

  public int getRating() {
    return rating;
  }

  @Override
  public String toString() {
    return String.format("%s (%d)", title, rating);
  }
  
}
