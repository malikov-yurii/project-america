package factories;

import shapes.circles.Circle;
import shapes.rectangles.Rectangle;
import shapes.triangles.Triangle;

/**
 * @author Yurii Malikov
 */
public abstract class BaseFactory {

	public abstract Circle createCircle();

	public abstract Triangle createTriangle();

    public abstract Rectangle createRectangle();
}
