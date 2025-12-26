package ex32;

public class Main {

        public static void main(String[] args) {
            MyPolynomial p1 = new MyPolynomial(1, 2, 3);   // 1 + 2x + 3x^2
            MyPolynomial p2 = new MyPolynomial(2, 1);      // 2 + x

            System.out.println("p1 = " + p1);
            System.out.println("p2 = " + p2);

            System.out.println("p1 + p2 = " + p1.add(p2));
            System.out.println("p1 * p2 = " + p1.multiply(p2));

            System.out.println("p1(2) = " + p1.evaluate(2));
        }
    }


