package ex52;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle(2.0, "blue");
        Cylinder cy = new Cylinder( c, 5.0);

        System.out.println(cy);
        System.out.println("Base area: " + c.getArea());
        System.out.println("Volume: " + cy.getVolume());
    }
}

