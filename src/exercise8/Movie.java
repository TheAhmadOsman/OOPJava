package exercise8;

/**
 * Class Movie
 * @author yasiro01
 */
public abstract class Movie extends Item {
  protected final String director;
  protected final int releaseYear;

  public Movie(String director, int releaseYear, long id, String title, int quantity) {
    super(id, title, quantity);
    this.director = director;
    this.releaseYear = releaseYear;
  }

  /**
   * Get the value of director
   * @return the value of director
   */
  public String getDirector() {
    return director;
  }

  /**
   * Get the value of releaseYear
   * @return the value of releaseYear
   */
  public int getReleaseYear() {
    return releaseYear;
  }

}
