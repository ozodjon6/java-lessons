package lesson5.task3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        //massiv
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;

        //dynamic array
        int[] ints2 = new int[6];
        ints2[0] = ints[0];
        ints2[1] = ints[1];
        ints2[2] = ints[2];
        ints2[3] = ints[3];
        ints2[4] = ints[4];
        ints2[5] = 5;


        //List interface
        //ArrayList
        //LinkedList
        List<String> list1 = new ArrayList();
        list1.add("test");

        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);//capacity * 1.5 = 5 * 1.5 = 7.5 = 8;
        System.out.println("list.get(0) = " + list.get(0));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(0);
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        System.out.println("linkedList.get(0) = " + linkedList.get(0));


    }
}
