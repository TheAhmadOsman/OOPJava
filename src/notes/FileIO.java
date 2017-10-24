package notes;

import com.github.javafaker.Faker;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author yasiro01
 */
public class FileIO {
  public static final String PATH = "data/";
  public static void main(String[] args) {
    /*
    try {
      generateFile(PATH + "roster.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    }
    */
    /*
    try {
      readFile(PATH + "roster.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    }
    */
    
    try {
      filterFileByState(PATH + "roster.txt", "MD");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    }
    
  }
  /**
   * Generate a file of random records
   * @param filename
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public static void generateFile(String filename) throws FileNotFoundException, IOException {
    Faker faker = new Faker();
    BufferedWriter outputFile = new BufferedWriter(new FileWriter(filename));
    for (int i = 0; i < 10000; i++) {
      String str = String.format("%s, %s %s %s%n", faker.name().lastName(),
                                        faker.name().firstName(),
                                        faker.address().fullAddress(),
                                        faker.phoneNumber().phoneNumber());
      outputFile.write(str);
    }
    outputFile.close();
  }
  /**
   * Read file content and print it to the screen
   * @param filename
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public static void readFile(String filename) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        System.out.println(line);
    }
  }
  public static void filterFileByState(String filename, String state) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    Pattern p = Pattern.compile("(\\w+), (\\w+) .+" + state + ".+");
    while ((line = inputFile.readLine()) != null) {
        Matcher m = p.matcher(line);
        while (m.find()) {
          System.out.printf("%s %s%n", m.group(2), m.group(1));
        }
    }
  }
}
