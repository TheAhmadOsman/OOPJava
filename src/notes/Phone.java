package notes;

/**
 * class Phone
 * @author yasiro01
 */
public class Phone {
  private String model;
  private String os;
  private int releaseYear;
  
  public Phone() {
    model = "IdontKnow";
    os = "Whatever";
    releaseYear = 0;
  }
  public Phone(String model, String os, int year) {
    this.model = model;
    this.os = os;
    releaseYear = year;
  }
  
  public String getModel() {
    return model;
  }
  
  public void setModel(String newModel) {
    model = newModel;
  }
  
  
  
}
