package shapes.circles;

import shapes.Color;;

/**
 * @author Yurii Malikov
 */
public class BlackCircle extends Circle {

    private static final Color color = Color.BLACK;

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getName() {
        return getColor().name().toLowerCase() + ' ' + super.getName();
    }

}
