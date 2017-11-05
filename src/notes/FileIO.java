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
import java.util.Scanner;
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
    long start = 0, end = 0;
    try {
      start = System.currentTimeMillis();
      generateFile(PATH + "roster.txt");
      end = System.currentTimeMillis();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      System.out.printf("Written a file using BufferedWriter in %d ms%n", end - start);
    }
    try {
      start = System.currentTimeMillis();
      usePrintWriter(PATH + "roster2.txt");
      end = System.currentTimeMillis();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      System.out.printf("Written a file using PrintWriter in %d ms%n", end - start);
    }
    try {
      start = System.currentTimeMillis();
      readFile(PATH + "roster.txt");
      end = System.currentTimeMillis();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      System.out.printf("Read a file using BufferedReader in %d ms%n", end - start);
    }
    try {
      start = System.currentTimeMillis();
      filterFileByState(PATH + "roster.txt", "IA");
      end = System.currentTimeMillis();
    } catch (FileNotFoundException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
      System.out.printf("Read a file with regex in %d ms%n", end - start);
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
    /* BufferedWriter allows writing to a file */
    BufferedWriter outputFile = new BufferedWriter(new FileWriter(filename));
    for (int i = 0; i < 10000; i++) {
      String str = String.format("%s, %s %s %s%n", faker.name().lastName(),
                                        faker.name().firstName(),
                                        faker.address().fullAddress(),
                                        faker.phoneNumber().phoneNumber());
      /* BufferedWriter uses write method and it's recommended to format a string first */
      outputFile.write(str);
    }
    outputFile.close();
  }
  public static void usePrintWriter(String filename) throws IOException {
    Faker faker = new Faker();
    /* PrinWriter is an easy-to-use wrapper for the FileWriter class */
    PrintWriter outputFile = new PrintWriter(new FileWriter(filename));
    for (int i = 0; i < 10000; i++) {
      String str = String.format("%s, %s %s %s%n", faker.name().lastName(),
                                        faker.name().firstName(),
                                        faker.address().fullAddress(),
                                        faker.phoneNumber().phoneNumber());
      /* With PrintWriter you can use print, println, and printf */
      outputFile.println(str);
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
    /* BufferedReader allows you to access file content */
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        /* Turn each line into a Scanner object and parse it one token at a time */
        Scanner lineContent = new Scanner(line);
        while (lineContent.hasNext()) {
            System.out.println(lineContent.next());
        }
    }
  }
  /**
   * Read file and filter its content using regular expressions
   * @param filename
   * @param state
   * @throws FileNotFoundException
   * @throws IOException 
   */
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
  /**
   * Count lines in a file
   * @param filename
   * @return
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public static int countLines(String filename) throws FileNotFoundException, IOException {
    int linesInFile = 0;
    BufferedReader inputFileContent = new BufferedReader(new FileReader(filename));
    while (inputFileContent.readLine() != null) {
      linesInFile++;
    }
    return linesInFile;
  }
  /**
   * Calculate sum of all numbers in a file
   * @param filename
   * @return
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public static int sumNumbers(String filename) throws FileNotFoundException, IOException {
    int result = 0;
    BufferedReader inputFileContent = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFileContent.readLine()) != null) {
      Scanner lineContent = new Scanner(line);
      while (lineContent.hasNextInt()) {
        result = result + lineContent.nextInt();
      }
    }
    return result;
  }
  /**
   * Get dimensions of a matrix from file content
   * @param filename
   * @return
   * @throws FileNotFoundException
   * @throws IOException 
   */
  public static int[] getDimensions(String filename) throws FileNotFoundException, IOException {
    int[] dimensions = new int[2];
    int row = 0, col = 0;
    BufferedReader inputFileContent = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFileContent.readLine()) != null) {
      row++;
      Scanner lineContent = new Scanner(line);
      col = 0;
      while (lineContent.hasNextInt()) {
        col++;
        lineContent.nextInt();
      }
    }
    dimensions[0] = row;
    dimensions[1] = col;
    return dimensions;
  }
}
