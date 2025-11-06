package ex44;

public class Test {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(1.5f, 2.5f, 0.5f, 1.0f);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
    }
}


