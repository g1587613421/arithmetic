/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.生命游戏;

public class Main {

    public void gameOfLife(int[][] board) {
        int[][] data=new int[board.length+2][board[0].length+2];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                data[i+1][j+1]=board[i][j];
            }
        }
        for(int i=1;i<data.length-1;i++){
            for(int j=1;j<data[0].length-1;j++){
                int sum=0;
                sum+=data[i-1][j-1]+data[i-1][j]+data[i-1][j+1]+data[i][j-1]+data[i][j+1]+data[i+1][j-1]+data[i+1][j]+data[i+1][j+1];
                if(board[i-1][j-1]==1){
                    if(sum>3||sum<2){
                        board[i-1][j-1]=0;
                    }
                }
                else{
                    if(sum==3){
                        board[i-1][j-1]=1;
                    }
                }
            }
        }



    }
}
