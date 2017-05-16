/**
 * Created by lecrocodile on 16.05.17.
 */
public class BlackTriangle extends Triangle {

    private static String BLACK_COLOUR = "BLACK TRIANGLE";

    public BlackTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public String getColor() {
        return BLACK_COLOUR;
    }
}
