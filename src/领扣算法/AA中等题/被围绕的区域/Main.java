/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.被围绕的区域;

public class Main {

    public void solve(char[][] board) {
        if (board.length<3||board[0].length<3)
            return;
        boolean[][] flags=new boolean[board.length+2][board[0].length+2];
        for (int i = 0; i < board.length; i++) flags[i + 1][1] = board[i][0] != 'X';
        for (int i = 0; i < board.length; i++) flags[i + 1][board[0].length] = board[i][board[0].length-1] != 'X';
        for (int i = 0; i < board[0].length; i++) flags[1][i+1] = board[0][i] != 'X';
        for (int i = 0; i < board[0].length; i++) flags[board.length][i+1] = board[board.length-1][i] != 'X';
        while (true){
            boolean b=true;
            for (int i = 1; i <flags.length-2 ; i++) {
                for (int j = 1; j < flags[0].length-2; j++) {
                    if (board[i-1][j-1]=='O'&&!flags[i][j]){
                        if (flags[i][j+1]||flags[i-1][j]||flags[i][j-1]||flags[i+1][j])
                        {
                            flags[i][j]=true;
                            b=false;
                        }
                    }
                }
            }
            if (b)
                break;
        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j]=flags[i+1][j+1]?'O':'X';
            }

        }

    }
    public static void main(String arg[]){//main--来自高金磊
    new Main().solve(new char[][]{{'X','O','X','O','X','O','O','O','X','O'},{'X','O','O','X','X','X','O','O','O','X'},{'O','O','O','O','O','O','O','O','X','X'},{'O','O','O','O','O','O','X','O','O','X'},{'O','O','X','X','O','X','X','O','O','O'},{'X','O','O','X','X','X','O','X','X','O'},{'X','O','X','O','O','X','X','O','X','O'},{'X','X','O','X','X','O','X','O','O','X'},{'O','O','O','O','X','O','X','O','X','O'},{'X','X','O','X','X','X','X','O','O','O'}});
    }
}
