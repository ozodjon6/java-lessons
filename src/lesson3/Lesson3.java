package lesson3;

//class
//interface
//voris olish
//methods

public class Lesson3 {
    public static void main(String[] args) {
        Car tiko = new Car();
        tiko = null;
    }
}

class Car {
    //variables
    //global variables
    //fields
    //int, long, double, float, boolean - primitive variables
    //Integer, Long, Double, Float, Boolean, String, Car - non primitive variables
    private String color;
    private int year;

    //o`zgaruvchilar
    private double probeg = 0;

    //o`zgarmaslar
    private final String brand = "NEXIA";

    //method
    //method void
    public void run(double distance) {
        //local variable
        double x = 0;
        probeg += distance;
    }

    //method not void
    public double getProbeg() {
        return probeg;
    }
}