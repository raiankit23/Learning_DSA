package Assignments.Assign4_Binary_2dArray;

public class BookAllocation {
    public static void main(String[] args) {
        int[] page = {10, 20, 30, 40};
        int nos = 2;
        System.out.println(minPages(page, nos));
    }
    private static int minPages(int[] page, int nos){
            int low = 0;
            int high = 0;
            for(int i=0;i<page.length;i++){
                high += page[i];
            }
            int ans =0;
            while(low<=high){
                int mid = (low+high)/2;
                if(isItPossible(page, nos, mid)==true){
                    ans=mid;
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            return ans;
    }

    private static boolean isItPossible(int [] page, int nos, int mid){
         int student = 1;
         int readPage = 0;
         for(int i=0;i<page.length;){
             if(readPage + page[i]<=mid){
                 readPage+=page[i];
                 i++;
             }else {
                 readPage=0;
                 student++;
             }
             if(student>nos){
                 return false;
             }
         }
         return true;
    }
}
