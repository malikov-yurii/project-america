/**
 * @author Yurii Malikov
 */
public abstract class Shape {

    abstract Color getColor();

    abstract String getName();

    @Override
    public String toString() {
        return getName();
    }
}
