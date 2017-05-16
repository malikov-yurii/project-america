/**
 * @author Yurii Malikov
 */
public abstract class Shape {

    abstract Color getColor();

    abstract String getName();

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return getName();
    }
}
