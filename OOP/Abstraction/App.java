package OOP.Abstraction;

public class App {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Retangle retangle = new Retangle(6, 7);

        // circle.display();
        // triangle.display();
        // retangle.display();
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(retangle.area());
    }
}
