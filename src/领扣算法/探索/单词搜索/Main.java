/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.单词搜索;

import java.util.Arrays;

public class Main {
    char[] chars;
    public boolean exist(char[][] board, String word) {
        char[][] data=new char[board.length+2][board[0].length+2];
        Arrays.fill(data[0],'0');
        Arrays.fill(data[data.length-1],'0');
        for (int i = 0; i < data.length; i++) {
            data[i][0]=data[i][data[0].length-1]='0';
        }
        for (int i = 1; i < data.length-1; i++) {
            for (int j = 1; j < data[0].length-1; j++) {
                data[i][j]=board[i-1][j-1];
            }
        }
        chars=word.toCharArray();
        for (int i = 1; i < data.length-1; i++) {
            for (int j = 1; j < data[0].length-1; j++) {
                if (data[i][j]==chars[0]){
                    char middle=data[i][j];
                    data[i][j]='0';
                    if (plus(data, i, j, 1))
                        return true;
                    else data[i][j]=middle;
                }
            }
        }
        return false;
    }

    private boolean plus(char[][] board,int x,int y,int index){
        if (index>chars.length-1)
            return true;
        if (board[x][y+1]==chars[index]){
            char middle=board[x][y+1];
            board[x][y+1]='0';
            if (plus(board, x, y+1, index+1))
                return true;
            board[x][y+1]=middle;
        }
        if (board[x][y-1]==chars[index]){
            char middle=board[x][y-1];
            board[x][y-1]='0';
            if (plus(board, x, y-1, index+1))
                return true;
            board[x][y-1]=middle;
        }
        if (board[x-1][y]==chars[index]){
            char middle=board[x-1][y];
            board[x-1][y]='0';
            if (plus(board, x-1, y, index+1))
                return true;
            board[x-1][y]=middle;
        }
        if (board[x+1][y]==chars[index]){
            char middle=board[x+1][y];
            board[x+1][y]='0';
            if (plus(board, x+1, y, index+1))
                return true;
            board[x+1][y]=middle;
        }
        return false;
    }
}
