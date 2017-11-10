package exercise5;

/**
 * 
 * Class College
 * Task 5: Create a class College with the following private data members: String name, int rank. Implement setter method for the rank.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class College {
    private String name;
    private int rank;

    public College(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name + " is ranked #" + rank;
    }
}