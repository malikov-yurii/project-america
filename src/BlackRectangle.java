/**
 * Created by Alex on 17.05.2017.
 */
public class BlackRectangle extends Rectangle {

    private Color color;

    public BlackRectangle() {
        color = Color.BLACK;
    }

    public BlackRectangle(double sideA, double sideB) {
        super(sideA, sideB);
        color = Color.BLACK;
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
