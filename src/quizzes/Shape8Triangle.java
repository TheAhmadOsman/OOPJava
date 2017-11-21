package quizzes;

/**
 * Class Triangle
 * @author yasiro01
 */
public class Shape8Triangle extends Shape8 {
  private final int sideA;
  private final int sideB;
  private final int sideC;

  public Shape8Triangle(int sideA, int sideB, int sideC) {
    this.sideA = sideA;
    this.sideB = sideB;
    this.sideC = sideC;
  }

  @Override
  public double getArea() {
    double semi = (sideA + sideB + sideC) / 2;
    return Math.sqrt(semi * (semi - sideA) * (semi - sideB) * (semi - sideC));
  }

  @Override
  public double getPerimeter() {
    return sideA + sideB + sideC;
  }
  
  @Override
  public String toString() {
    return String.format("Triangle");
  }
  
}
