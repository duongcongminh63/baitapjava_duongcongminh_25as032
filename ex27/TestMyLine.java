package ex27;

public class TestMyLine {
    public static void main(String[] args) {
        MyLine line = new MyLine(1, 2, 4, 6);

        System.out.println(line);
        System.out.println("Length = " + line.getLength());
        System.out.println("Gradient (rad) = " + line.getGradient());
    }
}
