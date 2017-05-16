/**
 * Created by lecrocodile on 16.05.17.
 */
public class BlackTriangle extends Triangle {

    private Color color;

    private static String BLACK_COLOUR = "BLACK TRIANGLE";

    public BlackTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    public BlackTriangle() {
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
