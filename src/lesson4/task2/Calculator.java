package lesson4.task2;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public int add(int...ints) {
        int r = 0;
        for (int anInt : ints) {
            r += anInt;
        }
        return r;
    }

    public void execute(Object...args) {

    }
}
