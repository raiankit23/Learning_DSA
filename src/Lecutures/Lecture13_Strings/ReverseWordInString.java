package Lecutures.Lecture13_Strings;

import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args) {
        String s = "    a    good    example    ";
        s = s.trim(); // remove leading space;
        String [] arr = s.split(" +"); // s.split("\s+");
        System.out.println(Arrays.toString(arr));
        String ans = "";
        for(int i=arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";
        }
        ans= ans.trim();
    }

    private static void reverseWordInString(String s) {

    }
}
