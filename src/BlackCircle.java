/**
 * @author Yurii Malikov
 */
public class BlackCircle extends Circle {

    private Color color;

    public BlackCircle() {
        color = Color.BLACK;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    String getName() {
        return getColor().name().toLowerCase() + ' ' + super.getName();
    }

}
