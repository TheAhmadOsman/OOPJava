package exercise5;

/**
 * 
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Room {
    private String building;
    private int number;

    public Room() {
        this.building = "NA";
        this.number = 0;
    }
    
    public Room(String building, int number) {
        this.building = building;
        this.number = number;
    }

    public String getBuilding() {
        return building;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return building + " " + number ;
    }   
}