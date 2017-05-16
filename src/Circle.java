// updated 2017-05-16 23 40 by tonchief. Implemented Figure. Added getPerimeter. Changed hardcoded PI to Math.PI.

abstract class Circle implements Figure {
    private final double PI = Math.PI;
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * PI * radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }

    public abstract String getColor();
}
