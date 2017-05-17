package shapes.rectangles;

import shapes.Color;

/**
 * Created by Alex on 17.05.2017.
 */
public class WhiteRectangle extends Rectangle {

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

