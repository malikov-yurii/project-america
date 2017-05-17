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
