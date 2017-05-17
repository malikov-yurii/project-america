package shapes.triangles;

import shapes.Shape;

public abstract class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(){

    }

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }


    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p	- sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    @Override
    public String getName() {
        return "triangle";
    }

}
