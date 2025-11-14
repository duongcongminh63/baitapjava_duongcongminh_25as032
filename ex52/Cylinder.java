package ex52;

import ex41.Circle;

public class Cylinder {
    private Circle base ;
    private double height ;
    public Cylinder () {
        this.base = new Circle() ;
        this.height = 1.0;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getVolume () {
        return base.getArea() * height ;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
