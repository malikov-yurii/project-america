/**
 * Created by lecrocodile on 16.05.17.
 */
public class WhiteTriangle extends Triangle {

    public WhiteTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    private Color color;

    public WhiteTriangle() {
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