package exercise8;

/**
 *
 * Class Item
 * Implement constructor of the class Item
 * Implement getters and setters (if applicable) for all data members (id, title, quantity)
 * Implement methods checkout (decrement quantity, if possible) and checkin (increment quantity)
 * Implement method toString that returns a meaningful string with the title and quantity (is possible). See the output file for example
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 5: Exercise 8
 * 
**/

public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
    
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    return quantity > 0;
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
      quantity--;
  }

  /**
   * Check in an item
   */
  public void checkin() {
      quantity++;
  }
  
  @Override
  public String toString() {
    if(quantity == 1)
        return "We have a copy of " + title;
    return "We have " + quantity + " copies of " + title;
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
