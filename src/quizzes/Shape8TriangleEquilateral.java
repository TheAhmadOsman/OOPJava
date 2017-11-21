package quizzes;

/**
 * Class Equilateral Triangle
 * @author yasiro01
 */
public class Shape8TriangleEquilateral extends Shape8Triangle {

  public Shape8TriangleEquilateral(int side) {
    super(side, side, side);
  }
  
  @Override
  public String toString() {
    return String.format("Equilateral Triangle");
  }
  
}
