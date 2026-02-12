package OOP.overloadedContructors;

public class users {
    String username;
    String email;
    int age;

    users() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    users(String username) {
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }

    users(String username, String email) {
        this.username = username;
        this.email = email;
    }

    users(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
