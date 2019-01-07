package exercise5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Class Chart
 * Task 8: Create a class Chart that contains a private data member HashMap<Integer, Song> 
 * (reuse class Song from task 7). Its constructor must take file name as a parameter, read data from the file 
 * (sample top40pop.csv is provided), create a new Song object from each line, and put that object into a HashMap 
 * using a song position as a key. Implement method getSong that takes an integer position as a parameter and returns a Song at that position. 
 * 
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 4: Exercise 5
 * 
 */
public class Chart {
    private HashMap<Integer, Song> song = new HashMap();

    public Chart(String fileName) {
        try {
            BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
            Scanner line = new Scanner(inputFile);
            while(line.hasNextLine()!= false){
                String lineStr = line.nextLine();
                String[] splitted = lineStr.split(",");
                Song lineSong = new Song(splitted[1], splitted[2]);
                song.put(Integer.parseInt(splitted[0]), lineSong);
            }
        } catch(FileNotFoundException exc) {
            Logger.getLogger(Chart.class.getName()).log(Level.SEVERE, null, exc);
        }
    }

    public Song getSong(int num) {
        return song.get(num);
    }
}