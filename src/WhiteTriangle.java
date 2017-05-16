/**
 * Created by lecrocodile on 16.05.17.
 */
public class WhiteTriangle extends Triangle {

    private static String WHITE_COLOUR = "WHITE TRIANGLE";

    public WhiteTriangle(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    protected String getColour() {
        return WHITE_COLOUR;
    }
}
