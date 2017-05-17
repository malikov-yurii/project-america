package shapes.triangles;

import shapes.Color;

/**
 * Created by lecrocodile on 16.05.17.
 */
public class BlackTriangle extends Triangle {

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
