import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
//        extracted();
//        extracted1();
//        extracted2();
//        extracted3();
//        extracted4();
//        extracted5();
//        extracted6();
//        extracted7();
//        extracted8();
//        extracted9();
    }

    private static void extracted9() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }
    }

    private static void extracted8() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
    }

    private static void extracted7() {
        int a = 0;
        do {
            System.out.println("a = " + a);
            a++;
        } while (a < 5);
    }

    private static void extracted6() {
        int a = 0;
        while (a < 5) {
            System.out.println("a = " + a);
            a++;
        }
    }

    private static void extracted5() {
        String[] strs = new String[5];
        strs[0] = "Ozod senior";
        strs[1] = "Ozod junior";

        for (String str : strs) {
            System.out.println("str = " + str);
        }
    }

    private static void extracted4() {
        int[] nums = new int[5];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;

        for (int num : nums) {
            System.out.println("num = " + num);
        }
    }

    private static void extracted3() {
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);
        }

        for (int i = 10; i > 0; i -= 2) {
            System.out.println("i = " + i);
        }

        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println("i = " + i);
        }
    }

    private static void extracted2() {
        Scanner scanner = new Scanner(System.in);
        String footballerName = scanner.nextLine();
        switch (footballerName) {
            case "Ronaldo": {
                System.out.println("test");
                System.out.println("The best");
                break;
            }
            case "Messi":
                System.out.println("Not The best");
                System.out.println("Not The best");
                break;
            case "Neymar":
                System.out.println("Maybe the best");
                break;
            default:
                System.out.println("Enter footballer!");
        }

        switch (footballerName) {
            case "Ronaldo" -> System.out.println("The best");
            case "Messi" -> System.out.println("Not The best");
            case "Neymar" -> System.out.println("Maybe The best");
            default -> System.out.println("Enter footballer!");
        }
    }

    private static void extracted1() {
        int a = -5;
        if (a > 0) {
            System.out.println("musbat");
        } else if (a < 0) {
            System.out.println("manfiy");
        } else {
            System.out.println("nol");
        }
    }

    private static void extracted() {
        //Mantiqiy amallar
        //or and not
        boolean a = true;
        boolean b = false;
        boolean c = a || b;
        System.out.println("c = " + c);

        boolean d = a && b;
        System.out.println("d = " + d);

        boolean e = !a;
        System.out.println("e = " + e);
    }
}
