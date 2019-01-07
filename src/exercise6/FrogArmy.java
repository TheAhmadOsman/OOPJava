package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Class FrogArmy
 * Create a class FrogArmy that uses ArrayList to store a group of Frogs.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class FrogArmy {
    private ArrayList<Frog> frogs = new ArrayList();

    public FrogArmy(String fileName) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);

            while(line.hasNext()){
                String[] lineItems = line.nextLine().split(",");
                if(lineItems[2].equals("Frog")){
                    Frog thisFrog = new Frog(lineItems[0], Integer.parseInt(lineItems[1]));
                    frogs.add(thisFrog);
                }
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(FrogArmy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size() {
        return frogs.size();
    }
    
    public Frog getChief() {
        Frog oldestFrog = new Frog("NA", 0);
        
        for(Frog thisFrog: frogs)
            if(thisFrog.getAge() > oldestFrog.getAge())
                oldestFrog = thisFrog;
        
        return oldestFrog;
    }
}