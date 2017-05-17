/**
 * Created by Alex on 17.05.2017.
 */
public class WhiteRectangle extends Rectangle {

    private Color color;

    public WhiteRectangle() {
        color = Color.WHITE;
    }

    public WhiteRectangle(double sideA, double sideB) {
        super(sideA, sideB);
        color = Color.WHITE;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getName() {
        return getColor().name().toLowerCase() + ' ' + super.getName();
    }
}

