package OOP.Interface;

public class App {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        // rabbit.flee();
        // hawk.hunt();

        fish.flee();
        fish.hunt();
    }
}
