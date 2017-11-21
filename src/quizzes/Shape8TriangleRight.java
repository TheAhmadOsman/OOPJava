package quizzes;

/**
 * Class Right Triangle
 * @author yasiro01
 */
public class Shape8TriangleRight extends Shape8Triangle {
  public Shape8TriangleRight(int sideA, int sideB, int sideC) throws Exception {
    super(sideA, sideB, sideC);
    if (!isItRight(sideA, sideB, sideC)) {
      throw new Exception("Incorrect values");
    }
  }
  
  private boolean isItRight(int a, int b, int c) {
    return a * a + b * b == c * c || 
           a * a + c * c == b * b ||
           b * b + c * c == a * a;
  }
  
  @Override
  public String toString() {
    return String.format("Right Triangle");
  }
  
}
