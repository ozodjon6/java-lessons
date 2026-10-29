package lesson;

import java.util.*;

/**
 * List - interface List
 * 1. ArrayList - add() listga elemetn qoshish, get() - element olish. FIFO usulida yozadi. Object dan voris olganlan class obyektlarini
 * saqlaydi, null qiymat ham saqlaydi. Asosida dinamik array yotadi. Indexlangan bolganligin uchun Öqişda tez.
 * 2. LinkedList - add() listga elemetn qoshish, get() - element olish. FIFO usulida yozadi. Object dan voris olganlan class obyektlarini
 *  * saqlaydi, null qiymat ham saqlaydi. Asosida node lar yotadi. Yozishda tez, oqishda sekin. Sababi indexlanmagan.
 * 3. Stack
 * 4. Vector
 * **************************
 * Set -  interface Set: unique qiymat saqlaydi. null saqlaydi.
 * 1. HashSet - juda tez, hash qiymati boyicha tartiblab saqlaydi, kiritish tartibida  saqlamaydi
 * 2. LinkedHashSet - tez yozadi va o`chiradi, kiritish tartibida saqlaydi
 * 3. TreeSet - tartiblab saqlaydi, null olmaydi, qiymatlarning o`sish tartibida saqlaydi
 * ************************
 * Queue - x
 * 1. ArrayQue -
 * 2. PriorityQue -
 * ************************
 * Map - interface Map, dictionary, qiymatlarni key value juftligida saqlaydi
 * 1. HashMap -
 * 2. LinkedHashMap -
 * 3. TreeMap -
 */

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> numberWord = new HashMap<>();
        numberWord.put(1, "one");
        numberWord.put(2, "two");
        numberWord.put(3, "three");
        numberWord.put(4, "four");

        System.out.println(numberWord.get(3));

        numberWord.forEach((k, w) -> {
            System.out.println("k = " + k + " v =" + w);
        });
    }

    private static void extracted5() {
        HashMap<String, String> uzEnDict = new HashMap<>();
        uzEnDict.put("bormoq", "go");
        uzEnDict.put("yemoq", "eat");
        uzEnDict.put("ichmoq", "drink");
        uzEnDict.put("uxlamoq", "sleep");

        System.out.println(uzEnDict.get("bormoq"));
    }

    private static void extracted4() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(7);
        set.add(81);
        set.add(10);
        set.add(9);
        set.add(9);

        for (Integer i : set) {
            System.out.println("i = " + i);
        }
    }

    private static void extracted3() {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(7);
        set.add(81);
        set.add(10);
        set.add(null);
        set.add(9);
        set.add(9);

        for (Integer i : set) {
            System.out.println("i = " + i);
        }
    }

    private static void extracted2() {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(7);
        set.add(81);
        set.add(10);
        set.add(null);
        set.add(9);
        set.add(9);

        for (Integer i : set) {
            System.out.println("i = " + i);
        }
    }

    private static void extracted1() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("one");
        ll.add("two");
        ll.add("there");
        ll.add("there");
        ll.add(null);
        ll.add("four");
        ll.add("five");
        System.out.println("ll.get(3) = " + ll.get(3));

        for (String s : ll) {
            System.out.println("s = " + s);
        }
    }

    private static void extracted() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);  //0
        list.add(11); //1
        list.add(12); //2
        list.add(13); //3
        list.add(14);
        list.add(15);
        list.add(16);
        System.out.println("list.get(3) = " + list.get(3));

        for (Integer item : list) {
            System.out.println("item = " + item);
        }
    }
}
