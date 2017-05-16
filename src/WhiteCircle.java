/**
 * @author Yurii Malikov
 */
public class WhiteCircle extends Circle {

    private Color color;

    public WhiteCircle() {
        color = Color.WHITE;
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
