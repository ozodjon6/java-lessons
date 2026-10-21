import lesson3.Human;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //mathematics operations
        int a = 5;
        int b = 28;
        int yigindi = a + b;
        System.out.println("yigindi = " + yigindi);
        int ayirma = a - b;
        System.out.println("ayirma = " + ayirma);

        //butun qismini olish
        int butun = b / a;
        System.out.println("butun = " + butun);

        //qoldiq
        int qoldiq = b % a;
        System.out.println("qoldiq = " + qoldiq);

        //Math
        int sonning_module = Math.abs(a - b);
        System.out.println("sonning_module = " + sonning_module);

        double pow = Math.pow(5, 3);
        System.out.println("pow = " + pow);

        String lastName = "Jumayev";
        String firstName = "Ozodbek";
        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);
    }
}