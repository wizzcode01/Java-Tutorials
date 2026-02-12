package OOP.overloadedContructors;

public class App {
    public static void main(String[] args) {
        // overloaded constructors
        users user1 = new users("Wisdom");
        users user2 = new users("Samuel", "dicksonwisdom005@gmail.com");
        users user3 = new users("Samuel", "dicksonwisdom005@gmail.com", 34);
        users user4 = new users();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
