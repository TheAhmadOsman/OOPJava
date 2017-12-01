package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * Class BookShop
 * 
 * @author Ahmad M. Osman - Original template by Dr. Roman Yasinovskyy
 * @assignment Week 7: Exercise 10
 * 
**/

public class BookShop {
  
    private ArrayList<Book> catalog;
    
  public BookShop() {
      catalog = new ArrayList();
  }
  
  public BookShop(String filename) throws FileNotFoundException {
      this();
      BufferedReader inputFile = new BufferedReader(new FileReader(filename));
      Scanner line = new Scanner(inputFile);
      while(line.hasNext()){
          String[] lineItems = line.nextLine().split(","); 
          Book book = new Book(lineItems[0], lineItems[1], Double.parseDouble(lineItems[2]), Integer.parseInt(lineItems[3]));
          catalog.add(book);
      }
  }
  
  public BookShop(BookShop anotherBookShop) {
      this();
      catalog = (ArrayList<Book>)anotherBookShop.getCatalog().clone();
  }
  
  public void addNewTitle(Book book) {
      catalog.add(book);
  }
  
  public int size() {
      return catalog.size();
  }
  
  public void discountAll(Double discountPercent) {
    Double newPrice;
    for(Book book: catalog){
        newPrice = book.getPrice() - (book.getPrice() * (discountPercent/100));
        book.setPrice(newPrice);
    }
  }
  
  public void printCatalog() {
      for(Book book: catalog){
          System.out.println(book);
      }      
  }
  
  public void order(Comparator<Book> comp) {
      Collections.sort(catalog, comp);
  }
  
  public ArrayList<Book> getCatalog() {
      return catalog;
  }
}