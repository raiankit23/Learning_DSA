package Lecutures.Lecture14;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        System.out.println(ll.size());
        System.out.println(ll);
        ll.add(10);
        ll.add(5);
        ll.add(20);
        System.out.println(ll);
        ll.add(3, 9);// index range 0 to size
        System.out.println(ll);
        System.out.println(ll.get(2)); // index range 0 to size-1
        System.out.println(ll.remove(1));
        System.out.println(ll);
        System.out.println(ll.set(1, -11)); //update
        /*
        * Arraylist Operation
        *
        * 1.Creation
        * 2.Addition of element
        * 3.Getting a data at any index
        * 4.remove
        * 5.update
        * 6.size
        * 7.display
        * 8.
        * */
    }
}
