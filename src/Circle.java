// updated 2017-05-17 00 40 by tonchief. Added getPerimeter. Changed hardcoded PI to Math.PI. Renamed methods to conform with updated Shape abstract class

abstract class Circle extends Shape{
    private double radius;

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI  * radius * radius;
    }

    public double getDiameter(){
        return radius * 2;
    }

    public double getCircumference(){
        return 2 * Math.PI  * radius;
    }


    @Override
    String getName() {
        return "circle";
    }

}
