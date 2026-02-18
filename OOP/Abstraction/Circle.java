package OOP.Abstraction;

public class Circle extends Shape {

    double radius;

    // constructor
    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
