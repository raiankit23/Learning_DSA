package Lecutures.Lec20Rec5;

// given on cb problems/535
//word search home 79 of leetcode

import java.util.Scanner;

public class RatChasesItsCheese {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];

        for (int i = 0; i < maze.length; i++) {
            String s=sc.next();
            for (int j = 0; j < s.length(); j++) {
                maze[i][j] = s.charAt(j);
            }
        }
        int[][] ans = new int[n][m];
        printPath(maze, 0, 0, ans);
        if(flag==false){
            System.out.println("NO PATH FOUND");
        }
    }

    static boolean flag = false;

    private static void printPath(char[][] maze, int cr, int cc, int[][] ans){

        if(cr<0 || cc>0 || cr>= maze.length||cc>=maze[0].length||maze[cr][cc]=='X'){
            return;
        }

        if(cr== maze.length-1 && cc == maze[0].length-1){
            ans[cr][cc] =1;
            flag = true;
            displayAns(ans);
            return;
        }

        maze[cr][cc]='X';
        ans[cr][cc] = 1;
        int[] row = {-1, 0, 1, 0};
        int[] col = {0, -1, 0, 1};
        for (int i = 0; i < col.length; i++) {
            printPath(maze, cr+ row[i], cc+col[i], ans);
        }
        /*printPath(maze, cr-1, cc, ans); // up
        printPath(maze, cr, cc-1, ans); // left
        printPath(maze, cr+1, cc, ans); // down
        printPath(maze, cr, cc+1, ans); // right*/
        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }

    private static void displayAns(int[][] ans){
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    }
}
