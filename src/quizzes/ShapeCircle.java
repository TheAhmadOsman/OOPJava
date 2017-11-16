package quizzes;

/**
 * Class ShapeCircle
 * @author yasiro01
 */
public class ShapeCircle extends Shape {
    private final double radius;
    /**
     * @param radius
     */
    public ShapeCircle(double radius) {
        this.radius = radius;
    }
    /**
     * @return area
     */
    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
    /**
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
}
