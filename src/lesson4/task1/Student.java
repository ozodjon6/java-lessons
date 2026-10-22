package lesson4.task1;

public class Student extends Human {
    private Integer course;
    private Double averageMark;

    public Student() {

    }

    @Override
    public void walk() {

    }

    public Student(String firstName, String lastName, int age, Integer course, Double averageMark) {
        super(firstName, lastName, age);
        this.course = course;
        this.averageMark = averageMark;
    }

    //method overloading
    @Override
    public void eat() {
        //
    }

    @Override
    public void sleep() {

    }

    public void eat(String apple) {

    }

    public String eat(String apple, String banana) {
        //
        return "";
    }


    private void study() {
        //study
    }

    public void mark(Double mark) {
        //
    }

    public Double getAverageMark() {
        return averageMark;
    }
}
