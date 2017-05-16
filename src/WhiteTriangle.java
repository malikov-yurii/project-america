/**
 * Created by lecrocodile on 16.05.17.
 */
public class WhiteTriangle extends Triangle {

    private static String WHITE_COLOUR = "WHITE TRIANGLE";

    public WhiteTriangle(double a, double b, double c) {
        super(a, b, c);
    }

//    @Override
//    public void setColor(String color) {
//
//    }

    @Override
    public String getColor() {
        return WHITE_COLOUR;
    }
}
//change