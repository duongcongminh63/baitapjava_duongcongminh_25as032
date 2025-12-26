package ex31;

public class Main {


    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(3.1, 4.05);
        MyComplex c2 = new MyComplex(1.2, -2.0);

        System.out.println(c1);
        System.out.println(c1.isReal());
        System.out.println(c1.magnitude());

        MyComplex c3 = c1.addNew(c2);
        System.out.println(c3);

        c1.addInto(c2);
        System.out.println(c1);
    }
}



