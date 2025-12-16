package ex46;

public class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat("Kitty");
        System.out.println(c1);
        c1.greets();

        Dog d1 = new Dog("Tommy");
        Dog d2 = new Dog("Spike");
        System.out.println(d1);
        d1.greets();
        d1.greets(d2);
    }
}


