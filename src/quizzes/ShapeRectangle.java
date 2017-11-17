package quizzes;

/**
 * Class ShapeRectasngle
 * @author yasiro01
 */
public class ShapeRectangle extends Shape {
    protected double width;
    protected double height;
    /**
     * @param width
     * @param height
     */
    public ShapeRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    /**
     * @return area
     */
    @Override
    public double getArea() {
        return width * height;
    }
    /**
     * @return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
