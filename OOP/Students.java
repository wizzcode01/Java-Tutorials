package OOP;

public class Students {
    String name = "Wisdom";
    int age;
    double gpa;
    boolean isEnrolled;

    Students(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    // adding methods
    void study() {
        System.out.println(this.name + " is studying");
    }
}
