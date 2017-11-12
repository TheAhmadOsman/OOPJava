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
 * Class OwlParliament
 * Create a class OwlParliament that uses HashSet to store a group of Owls.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class OwlParliament {
    private HashSet<Owl> owls = new HashSet();
    
    public OwlParliament(String fileName) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);

            while(line.hasNext()){
                String[] lineItems = line.nextLine().split(",");
                if(lineItems[2].equals("Owl")){
                    Owl thisOwl = new Owl(lineItems[0], Integer.parseInt(lineItems[1]));
                    owls.add(thisOwl);
                }
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(OwlParliament.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size() {
        return owls.size();
    }
    
    public Owl getChief() {
        Owl oldestOwl = new Owl("NA", 0);
        
        for(Owl thisOwl: owls)
            if(thisOwl.getAge() > oldestOwl.getAge())
                oldestOwl = thisOwl;
        
        return oldestOwl;
    }
}