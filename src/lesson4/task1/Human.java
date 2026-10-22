package lesson4.task1;

public abstract class Human {
    private String firstName;
    private String lastName;
    private int age;

    public Human() {
    }

    public Human(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public abstract void walk();

    public abstract void eat();

    public abstract void sleep();
}
