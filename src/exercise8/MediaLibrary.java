package exercise8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class MediaLibrary
 * @author yasiro01
 */
public class MediaLibrary {
  private ArrayList<Item> myLibrary = new ArrayList();
  
  public MediaLibrary(String filename) throws FileNotFoundException, IOException {
    BufferedReader inputFile = new BufferedReader(new FileReader(filename));
    String line;
    while ((line = inputFile.readLine()) != null) {
        String[] lineContent = line.split(",");
        switch (lineContent[0]) {
          case "1":
            myLibrary.add(new PhysicalMovie(
                            lineContent[5],  // medium
                            lineContent[7],  // location
                            lineContent[3],  // director
                            Integer.parseInt(lineContent[4]),  // releaseYear
                            Long.parseLong(lineContent[1]),  //id
                            lineContent[2],  // title
                            Integer.parseInt(lineContent[6])  // quantity
                          )
                    );
            break;
          case "2":
            myLibrary.add(new DigitalMovie(
                            lineContent[5],  // service
                            lineContent[3],  // director
                            Integer.parseInt(lineContent[4]),  // releaseYear
                            Long.parseLong(lineContent[1]),  //id
                            lineContent[2]  // title
                          )
                    );
            break;
          case "3":
            myLibrary.add(new PaperBook(
                            Integer.parseInt(lineContent[5]),  // pages
                            lineContent[7],  // location
                            lineContent[3],  // author
                            Integer.parseInt(lineContent[4]),  // publishingYear
                            Long.parseLong(lineContent[1]),  //id
                            lineContent[2],  // title
                            Integer.parseInt(lineContent[6])  // quantity
                          )
                    );
            break;
          case "4":
            //String format, String author, int publishingYear, long id, String title, int quantity
            myLibrary.add(new EBook(
                            lineContent[5],  // format
                            lineContent[3],  // author
                            Integer.parseInt(lineContent[4]),  // publishingYear
                            Long.parseLong(lineContent[1]),  //id
                            lineContent[2]  // title
                          )
                    );
            break;
          default:
            break;
        }
    }
  }
  
  public void addItem(Item newItem) {
    myLibrary.add(newItem);
  }

  public Item getItem(int position) {
    return myLibrary.get(position);
  }
  
  public int size() {
    return myLibrary.size();
  }
  
  public void printAllItems() {
    for (Item item: myLibrary) {
      System.out.println(item);
    }
  }
  
  public void printAllItemsDetailed() {
    for (Item item: myLibrary) {
      System.out.println(item.getInfo());
    }
  }
}
