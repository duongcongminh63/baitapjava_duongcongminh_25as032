package ex41;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println(c1);
        System.out.println("Thể tích = " + c1.getVolume());

        Cylinder c2 = new Cylinder(2.0, 5.0, "blue");
        System.out.println(c2);
        System.out.println("Thể tích = " + c2.getVolume());
    }
}

