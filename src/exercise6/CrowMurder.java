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
 * Class CrowMurder
 * Create a class CrowMurder that uses ArrayList to store a group of Crows.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class CrowMurder {
    private ArrayList<Crow> crows = new ArrayList();

    public CrowMurder(String fileName) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);

            while(line.hasNext()){
                String[] lineItems = line.nextLine().split(",");
                if(lineItems[2].equals("Crow")){
                    Crow thisCrow = new Crow(lineItems[0], Integer.parseInt(lineItems[1]));
                    crows.add(thisCrow);
                }
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(CrowMurder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size() {
        return crows.size();
    }
    
    public Crow getChief() {
        Crow oldestCrow = new Crow("NA", 0, 100);
        
        for(Crow thisCrow: crows)
            if(thisCrow.getAge() > oldestCrow.getAge())
                oldestCrow = thisCrow;
        
        return oldestCrow;
    }
}