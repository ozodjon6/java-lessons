package lesson5;

import lesson5.task1.Dog;
import lesson5.task1.Eagle;
import lesson5.task1.parents.Animal;
import lesson5.task1.parents.Beard;

public class Main {
    public static void main(String[] args) {
        //data type
        String a = "test";
        Dog dog = new Dog();

        //upcasting
        Animal upcastedDog = dog;

        //downcasting
        Dog downcastedDog = (Dog) upcastedDog;

        Eagle eagle = new Eagle();
        Beard beard = eagle;
    }
}
