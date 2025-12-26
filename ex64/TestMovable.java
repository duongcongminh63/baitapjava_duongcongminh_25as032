package ex64;

public class TestMovable {
    public static void main(String[] args) {
        MovablePoint p = new MovablePoint(2, 3, 1, 1);
        System.out.println(p);
        p.moveRight();
        p.moveDown();
        System.out.println(p);

        MovableCircle c = new MovableCircle(5, 5, 2, 2, 10);
        System.out.println(c);
        c.moveLeft();
        c.moveUp();
        System.out.println(c);
    }
}

