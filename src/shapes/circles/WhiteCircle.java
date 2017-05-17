package shapes.circles;

import shapes.Color;

/**
 * @author Vitalii Yaichenia
 */
public class WhiteCircle extends Circle {

    private static final Color color = Color.WHITE;

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getName() {
        return getColor().name().toLowerCase() + ' ' + super.getName();
    }
}
