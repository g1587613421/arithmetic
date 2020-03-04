/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.找出井字棋的获胜者;

public class Main {
    public String tictactoe(int[][] moves) {
        int data[][]=new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            data[moves[i][0]][moves[i][1]]=i%2+1;
        }
        if (data[0][0]!=0&&data[0][0]==data[0][1]&&data[0][1]==data[0][2])
            return data[0][0]==1?"A":"B";
        if (data[1][0]!=0&&data[1][0]==data[1][1]&&data[1][1]==data[1][2])
            return data[1][0]==1?"A":"B";
        if (data[2][0]!=0&&data[2][0]==data[2][1]&&data[2][1]==data[2][2])
            return data[2][0]==1?"A":"B";
        if (data[0][0]!=0&&data[0][0]==data[1][0]&&data[2][0]==data[1][0])
            return data[0][0]==1?"A":"B";
        if (data[0][1]!=0&&data[0][1]==data[1][1]&&data[1][1]==data[2][1])
            return data[0][1]==1?"A":"B";
        if (data[0][2]!=0&&data[0][2]==data[1][2]&&data[1][2]==data[2][2])
            return data[0][2]==1?"A":"B";
        if (data[0][0]!=0&&data[0][0]==data[1][1]&&data[1][1]==data[2][2])
            return data[0][0]==1?"A":"B";
        if (data[0][2]!=0&&data[0][2]==data[1][1]&&data[1][1]==data[2][0])
            return data[0][2]==1?"A":"B";
        return moves.length==9?"Draw":"Pending";
    }

}
