package ex42;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "Hanoi");
        System.out.println(p1);

        Student s1 = new Student("Bob", "Danang", "IT", 2, 1500.5);
        System.out.println(s1);

        Staff st1 = new Staff("Carol", "Hue", "Greenwood School", 2500);
        System.out.println(st1);
    }
}
