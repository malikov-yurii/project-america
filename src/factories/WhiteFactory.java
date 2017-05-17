package factories;
import shapes.circles.Circle;
import shapes.circles.WhiteCircle;
import shapes.rectangles.Rectangle;
import shapes.rectangles.WhiteRectangle;
import shapes.triangles.Triangle;
import shapes.triangles.WhiteTriangle;

/**
 * @author Yurii Malikov
 */
public class WhiteFactory extends BaseFactory {

    @Override
    public Circle createCircle() {
        return new WhiteCircle();
    }

    @Override
    public Triangle createTriangle() {
        return new WhiteTriangle();
    }

    @Override
    public Rectangle createRectangle() {
        return new WhiteRectangle();
    }
}
