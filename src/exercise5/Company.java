package exercise5;

/**
 * 
 * Class Company
 * Task 4: Create a class Company with the following private data members: String name, double stockPrice. Implement a setter method for the stockPrice.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Company {
    private String name;
    private double stockPrice;

    public Company(String name, double stockPrice) {
        this.name = name;
        this.stockPrice = stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public String getName() {
        return name;
    }

    public double getStockPrice() {
        return stockPrice;
    }

    @Override
    public String toString() {
        return name + String.format(" trading at $%.2f", stockPrice);
    }
}