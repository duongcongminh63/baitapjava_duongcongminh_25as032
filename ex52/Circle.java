package ex52;

public class Circle extends ex41.Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public Circle() {
        this.radius = 1.0 ;
        this.color = " red " ;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea () {
        return Math.PI * radius * radius ;
    }

    @Override
    public String toString() {
        return "Cricle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
