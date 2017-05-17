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
