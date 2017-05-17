package factories;
import shapes.circles.BlackCircle;
import shapes.circles.Circle;
import shapes.rectangles.BlackRectangle;
import shapes.rectangles.Rectangle;
import shapes.triangles.BlackTriangle;
import shapes.triangles.Triangle;

/**
 * @author Yurii Malikov
 */
public class BlackFactory extends BaseFactory {

    @Override
    public Circle createCircle() {
        return new BlackCircle();
    }

    @Override
    public Triangle createTriangle() {
        return new BlackTriangle();
    }

    @Override
    public Rectangle createRectangle() {
        return new BlackRectangle();
    }
}
