package ex65;

public class TestResizableCircle {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        System.out.println(c);
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println("Area: " + c.getArea());

        ResizableCircle rc = new ResizableCircle(10);
        System.out.println(rc);
        rc.resize(50); // giảm còn 50%
        System.out.println("After resize:");
        System.out.println(rc);
        System.out.println("Perimeter: " + rc.getPerimeter());
        System.out.println("Area: " + rc.getArea());
    }
}

