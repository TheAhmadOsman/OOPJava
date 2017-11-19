package exercise8;

import java.util.ArrayList;

/**
 *
 * Class DigitalMovie
 * MediaLIbrary code 2
 * Implement the constructor that calls a constructor of the superclass
 * Override methods checkin and checkout. They should do nothing
 * Implement method getInfo that returns detailed description of a digital movie
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 5: Exercise 8
 * 
**/

public class DigitalMovie extends Movie {
  private String service;
  
    public DigitalMovie(String service, String director, int releaseYear, long id, String title) {
        super(director, releaseYear, id, title, 1);
        this.service = service;
    }

    @Override
    public void checkin() {
    }

    @Override
    public void checkout() {
    }

    @Override
    public String getInfo() {
        return title + " (" + releaseYear + ")" + " by " + director + " is available via " + service;
    }
    
  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
  }
  
}