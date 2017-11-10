package notes;

/**
 * Class Customer
 * Task 0: Create a class Customer with the following private data members: double loan, int term
 * @author yasiro01
 */
public class Customer {
  private final double loan;
  private final int term;

  public Customer(double loan, int term) {
    this.loan = loan;
    this.term = term;
  }

  public double getLoan() {
    return loan;
  }

  public int getTerm() {
    return term;
  }

  @Override
  public String toString() {
    return String.format("$%.2f over %d months", loan, term);
  }
  
}
