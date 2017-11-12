package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Class LemurConspiracy
 * Create a class LemurConspiracy that uses HashSet to store a group of Lemurs.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class LemurConspiracy {
    private HashSet<Lemur> lemurs = new HashSet();
    
    public LemurConspiracy(String fileName) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);

            while(line.hasNext()){
                String[] lineItems = line.nextLine().split(",");
                if(lineItems[2].equals("Lemur")){
                    Lemur thisLemur = new Lemur(lineItems[0], Integer.parseInt(lineItems[1]));
                    lemurs.add(thisLemur);
                }
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(LemurConspiracy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size() {
        return lemurs.size();
    }
    
    public Lemur getChief() {
        Lemur oldestLemur = new Lemur("NA", 0);
        
        for(Lemur thisLemur: lemurs)
            if(thisLemur.getAge() > oldestLemur.getAge())
                oldestLemur = thisLemur;
        
        return oldestLemur;
    }
}