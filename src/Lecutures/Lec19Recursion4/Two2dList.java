package Lecutures.Lec19Recursion4;

import java.util.ArrayList;
import java.util.List;

public class Two2dList {
    public static void main(String[] args) {
        List<List<Integer>> ll = new ArrayList<>();
        System.out.println(ll);
        ll.add(new ArrayList<>());
        ll.add(new ArrayList<>());
        ll.add(new ArrayList<>());
        ll.get(1).add(10);
        ll.get(1).add(20);
        ll.get(1).add(30);
        System.out.println(ll);
        System.out.println(ll.get(1).get(2));
        System.out.println(ll.get(0).size());
        System.out.println(ll.get(1).size());
        System.out.println(ll.get(2).size());

    }
}
