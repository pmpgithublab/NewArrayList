package ua.training;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        NewArrayList<Integer> list = new NewArrayList<>();

        System.out.println("Array contains (after creation): " + list);

        list.add(2);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(0);

        System.out.println("Array contains (after add() method): " + list);
        System.out.println("Array contains number 9: " + list.contains(9));
        System.out.println("Array contains number 5: " + list.contains(5));
        System.out.println("Array contains at position 2 number: " + list.get(2));
        System.out.println("Array contains (before set() method): " + list);
        list.set(3, 4);
        System.out.println("Array contains (after set(3, 4) method): " + list);
        list.remove(4);
        System.out.println("Array contains (after remove(4) method): " + list);
        list.sort(Comparator.comparingInt(o -> o));
        System.out.println("Array contains (after sort() method): " + list);
        System.out.println("Print the array elements:");
        for (Integer i: list) {
            System.out.println(i);
        }
        System.out.println("Array is empty: " + list.isEmpty());
        System.out.println("Array contains (before clear() method): " + list);
        list.clear();
        System.out.println("Array contains (after clear() method): " + list);
        System.out.println("Array is empty: " + list.isEmpty());
    }

}
