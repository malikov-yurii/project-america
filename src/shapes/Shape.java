package shapes;
/**
 * @author Yurii Malikov
 */
public abstract class Shape {

    public abstract Color getColor();

    public abstract String getName();

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return getName();
    }
}
