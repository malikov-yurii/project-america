// updated 2017-05-16 23 40 by tonchief. added getArea;
public abstract class Triangle implements Figure {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double a, double b, double c) {
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
    }


    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double getArea(){
        //Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)
        double p = this.getPerimeter();
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

    public abstract String getColor();
//    public abstract String setColor();
}
