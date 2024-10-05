package Assignments.Assignment5_Strings;

import java.util.Scanner;

public class CBNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        char n =
        String str = "81615";
        System.out.println(countCBNumber(str));
    }
    private static int countCBNumber(String str){
            int count = 0;
            boolean[] visited = new boolean[str.length()];
            for(int len=1;len< str.length();len++){
                for(int j=len;j<=str.length();j++){
                    int i=j-len;
                    String newStr = (str.substring(i, j));
                    if(checkCbNumber(Integer.parseInt(newStr)) && isVisited(visited, i, j-1)){
                        count++;
                        for (int k=i;k<=j-1;k++){
                            visited[k] = true;
                        }
                    }
                }
                return count;
            }


        return 0;
    }

    private static boolean isVisited(boolean[] visited, int i, int j){
        for(int k=i;k<=j;k++){
            visited[k] = false;
        }
        return true;
    }


    private static boolean checkCbNumber(int num){
        if(num==0 || num==1){
            return false;
        }

        int[] cbNumber = {2, 3, 5, 7, 11, 13, 19, 23, 29};
        for(int i=0;i< cbNumber.length;i++){
            if(num==cbNumber[i]){
                return true;
            }
        }

        for(int i=0;i< cbNumber.length;i++){
            if(num%cbNumber[i]==0){
                return false;
            }
        }
        return true;


    }
}
