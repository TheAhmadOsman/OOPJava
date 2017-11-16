package quizzes;

/**
 *
 * @author yasiro01
 */
public class ShapeSquare extends ShapeRectangle {
    /**
     * @param side
     */
    public ShapeSquare(double side) {
        super(side, side);
    }
    @Override
    public double getArea() {
        return this.width * this.width;
    }
    public double getSide() {
        return this.width;
    }
}
