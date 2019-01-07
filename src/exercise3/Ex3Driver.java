package exercise3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Ahmad M. Osman - Original template by Dr. Roman
 * @assignment Week 2: Exercise 3
 */
public class Ex3Driver {
  public static final String PATH = "data/";
  /**
   * main application function
   * @param args 
   */
  public static void main(String[] args) {
    int[][] matrix1 = null;
    int[][] matrix2 = null;
    int[][] result = null;
    try {
      matrix1 = readFile(PATH + "matrix1.txt");
      matrix2 = readFile(PATH + "matrix2.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    catch (IOException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, null, ex);
    }
    System.out.println("Matrix 1");
    System.out.println(" Dimensions: " + matrix1.length + "x" + matrix1[0].length);
    printMatrix(matrix1);
    System.out.println("Matrix 2");
    System.out.println(" Dimensions: " + matrix2.length + "x" + matrix2[0].length);
    printMatrix(matrix2);
    if (matrix1[0].length == matrix2.length) {
      result = multiply(matrix1, matrix2);
    } else {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, "{0}", "Impossible to multiply matrices");
      System.exit(0);
    }
    System.out.println("Result");
    printMatrix(result);
    try {
      writeMatrix(result, PATH + "result.txt");
    } catch (FileNotFoundException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, ex.toString(), ex);
    }
    catch (IOException ex) {
      Logger.getLogger(Ex3Driver.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  /**
   * Print a matrix
   * @param matrix to print
   */
  public static void printMatrix(int[][] matrix) {
    for (int[] row: matrix) {
      for (int item: row) {
        System.out.printf("%5d", item);
      }
      System.out.printf("%n");
    }
  }
  /**
   * Write a matrix to the file
   * @param matrix 
   * @param filename 
   * @throws java.io.FileNotFoundException 
   */
  public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException, IOException {
      BufferedWriter outputFile = new BufferedWriter(new FileWriter(filename));
      for(int i = 0; i < matrix.length; i++){
          for(int j = 0; j < matrix[i].length; j++){
              outputFile.write(matrix[i][j] + " ");
          }
          outputFile.write("\n");
    }
    outputFile.close();

  }
  /**
   * Read a matrix from a file
   * @param filename
   * @return matrix read from a file
   * @throws java.io.FileNotFoundException
   */
  public static int[][] readFile(String filename) throws FileNotFoundException, IOException {      
    /*
    10. Open the input file and create a Scanner object to read its content
    20. Read two values (rows and columns) from the first line, if possible
    30. Create a new 2-D array
    40. Read data from the file, one line at a time, using the Scanner object
    50. Split each line into individual tokens and put them into your array
    60. Return the array
    */

    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    Scanner fileScanner = new Scanner(inputFile);
    String line = fileScanner.nextLine();
    
    // I assumed reading those two values, "if possible" according to your instructions, 
    // means reading them and that your code template will handle any exceptions - or that simply 
    // this is a trick statement and that we can read the two values. Anyway, since there was not any
    // errors when dealing with the files you've provided, I assume there is not much exceptions handling
    // left for me to do.
    int rowsNum = 0, columnsNum = 0;
    String[] matrixDim = line.split(" ");
    rowsNum = Integer.parseInt(matrixDim[0]);
    columnsNum = Integer.parseInt(matrixDim[1]);
        
    int[][] matrix = new int[rowsNum][columnsNum];
    
    for(int i = 0; i < rowsNum; i++){
        line = fileScanner.nextLine();
        String[] lineSplitted = line.split(" ");
        for(int j = 0; j < columnsNum; j++){
            matrix[i][j] = Integer.parseInt(lineSplitted[j]);
        }
    }
    return matrix;
  }
  /**
   * Multiply two matrices
   * @param matrix1
   * @param matrix2
   * @return the resulting matrix
   */
  public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
      // I noticed that all the exceptions handling for incompaitable matrices multiplication 
      // e.g. matrix 1 columns number not equal to matrix 2 rows number
      // is handled in the main function. I am just going to implement the multiplication algorithm itself.
      
      int[][] result = new int[matrix1.length][matrix2[0].length];
      
      for(int i = 0; i < matrix1.length; i++)
          for(int j = 0; j < matrix2[0].length; j++)
              for(int k = 0; k < matrix1[0].length; k++)
                  result[i][j] += matrix1[i][k] * matrix2[k][j];

      return result;
  }
}