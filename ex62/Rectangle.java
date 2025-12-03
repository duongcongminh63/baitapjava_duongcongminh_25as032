package ex62;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + '}';
    }

    @Override
    public double getArea() {
        return width*length;
    }

    @Override
    public double getPerimeterd() {
        return 2*(length+width);
    }
}
