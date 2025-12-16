package ex63;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(1, 2, 3, 4);

        System.out.println(p);

        p.moveUp();
        System.out.println("After moveUp: " + p);

        p.moveRight();
        System.out.println("After moveRight: " + p);

        p.moveDown();
        System.out.println("After moveDown: " + p);

        p.moveLeft();
        System.out.println("After moveLeft: " + p);
    }
}
