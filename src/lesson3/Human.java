package lesson3;


public class Human {

    //constructor
    public Human() {
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Integer course = 2;
    public String name;
    protected int age;
    private double height;
    double weight;
    public final String type = "HUMAN";

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat() {
        height = 1.2;
        //eat only
    }

    private void sleep() {
        //sleep only
    }
}


//access modifiers
//public - classning public field, constructor, method lari proyektning istalgan joyida korinadi
//protected - papkada korinadi
//private - class ichida korinadi
//default - papkada korinadi