package Lecutures.Lecture14;

import java.util.ArrayList;

public class ArrayListDisplay {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(6);
        ll.add(4);
        ll.add(78);
        ll.add(789);
        ll.add(56);
        ll.add(12);
        ll.add(67);
        System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i)+" ");
        }
        System.out.println();
        int[] arr={19,23,56,78,90};
        for(int value : ll){
            System.out.print(value);
        }
        for(int value : arr){
            System.out.print(value);
        }
    }
}
