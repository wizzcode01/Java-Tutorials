package OOP.Inheritance;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        // System.out.println(dog.lives);
        // System.out.println(cat.lives);

        // dog.speak();
        // cat.speak();

        // System.out.println(dog.isAlive);
        // System.out.println(cat.isAlive);

        System.out.println(plant.isAlive);
        plant.photosynthesize();

    }
}
