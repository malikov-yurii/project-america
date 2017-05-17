package shapes.circles;
// updated 2017-05-17 00 40 by tonchief. Added getPerimeter. Changed hardcoded PI to Math.PI. Renamed methods to conform with updated Shape abstract class

import shapes.Shape;

public abstract class Circle extends Shape{
    
	private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getDiameter(){
        return radius * 2;
    }


    @Override
    public String getName() {
        return "circle";
    }

}
