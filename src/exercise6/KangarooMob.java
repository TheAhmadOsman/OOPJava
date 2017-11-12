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
 * Class KangarooMob
 * Create a class KangarooMob that uses HashSet to store a group of Kangaroos.
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 6
 * 
 */

public class KangarooMob {
    private HashSet<Kangaroo> kangaroos = new HashSet();
    
    public KangarooMob(String fileName) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);

            while(line.hasNext()){
                String[] lineItems = line.nextLine().split(",");
                if(lineItems[2].equals("Kangaroo")){
                    Kangaroo thisKangaroo = new Kangaroo(lineItems[0], Integer.parseInt(lineItems[1]));
                    kangaroos.add(thisKangaroo);
                }
            }
        } catch (FileNotFoundException ex){
            Logger.getLogger(KangarooMob.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int size() {
        return kangaroos.size();
    }
    
    public Kangaroo getChief() {
        Kangaroo oldestKangaroo = new Kangaroo("NA", 0);
        
        for(Kangaroo thisKangaroo: kangaroos)
            if(thisKangaroo.getAge() > oldestKangaroo.getAge())
                oldestKangaroo = thisKangaroo;
        
        return oldestKangaroo;
    }    
}