package shapes.triangles;

import shapes.Color;

/**
 * Created by lecrocodile on 16.05.17.
 */
public class WhiteTriangle extends Triangle {

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