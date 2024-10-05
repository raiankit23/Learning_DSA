package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class StringCompression2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(stringCompression(str));
    }
    private static String stringCompression(String str){
        StringBuilder sb = new StringBuilder();
        int count=1;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else {
                sb.append(str.charAt(i));
                if(count>1){
                    sb.append(count);
                }
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        if(count>1){
            sb.append(count);
        }
        return sb.toString();
    }
}
