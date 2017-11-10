package notes;

/**
 * Class Garden
 * @author yasiro01
 */
public class PlantGarden {
  Plant[][] myPatch;
  
  public PlantGarden(int width, int depth) {
    myPatch = new Plant[width][depth];
  }
  
  public void plantAPlant(Plant newPlant, int x, int y) {
    if (x < myPatch.length && y < myPatch[0].length) {  
      myPatch[x][y] = newPlant;
    }
  }
  public void chopItDown(int x, int y) {
    myPatch[x][y] = null;
  }
}
