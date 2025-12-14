package ex26;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(6, 8);

        System.out.println(p1); // (3,4)
        System.out.println("Distance to (0,0): " + p1.distance());
        System.out.println("Distance to p2: " + p1.distance(p2));
        System.out.println("Distance to (1,2): " + p1.distance(1, 2));
    }
}


