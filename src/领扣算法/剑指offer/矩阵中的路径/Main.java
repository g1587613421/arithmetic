/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.剑指offer.矩阵中的路径;

public class Main {
    //并查集
    char[][] board;
    char[] word;
    boolean res=false;
    public boolean exist(char[][] board, String word) {
        this.board=board;
        this.word=word.toCharArray();
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[0].length; j++) {
                //i,j为起点
                if (this.word[0]!=board[i][j])
                    continue;
                //访问
                boolean[][] flag;
                flag = new boolean[board.length][board[0].length];
                flag[i][j]=true;
                plus_down(i, j,flag ,1);
                flag = new boolean[board.length][board[0].length];
                flag[i][j]=true;
                plus_rx(i, j, flag,1);
                flag = new boolean[board.length][board[0].length];
                flag[i][j]=true;
                plus_up(i, j, flag,1);
                flag = new boolean[board.length][board[0].length];
                flag[i][j]=true;
                plus_lx(i, j, flag,1);
            }
        }
        return res;
    }
    void plus_lx(int i,int j,boolean[][] flag,int count){
        debug(count);
        if (count==word.length)
            res=true;
        if (res)
            return;
        i--;
        if (i<0||flag[i][j])
            return;
        if (word[count]==board[i][j])
        {
            //标记
            flag[i][j]=true;
            count++;

            //访问
            plus_down(i, j, flag,count);
            plus_rx(i, j, flag,count);
            plus_up(i, j, flag,count);
            plus_lx(i, j, flag,count);
        }
    }


    void plus_rx(int i,int j,boolean[][] flag,int count){
        debug(count);

        if (count==word.length)
            res=true;
        if (res)
            return;
        i++;
        if (i>=board.length||flag[i][j])
            return;
        if (word[count]==board[i][j])
        {
            //标记
            flag[i][j]=true;
            count++;

            //访问
            plus_down(i, j, flag,count);
            plus_rx(i, j, flag,count);
            plus_up(i, j, flag,count);
            plus_lx(i, j, flag,count);
        }

    }
    void plus_up(int i,int j,boolean[][] flag,int count){
        debug(count);

        if (count==word.length)
            res=true;
        if (res)
            return;
        j--;
        if (j<0||flag[i][j])
            return;
        if (word[count]==board[i][j])
        {
            //标记
            flag[i][j]=true;
            count++;

            //访问
            plus_down(i, j, flag,count);
            plus_rx(i, j, flag,count);
            plus_up(i, j, flag,count);
            plus_lx(i, j, flag,count);
        }
    }

    public void plus_down(int i,int j,boolean[][] flag,int count) {
        debug(count);
        if (count==word.length)
            res=true;
        if (res)
            return;
        j++;
        if (j>= flag[0].length ||flag[i][j])
            return;
        if (word[count]==board[i][j])
        {
            //标记
            flag[i][j]=true;
            count++;
            //访问
            plus_down(i, j, flag,count);
            plus_rx(i, j, flag,count);
            plus_up(i, j, flag,count);
            plus_lx(i, j, flag,count);
        }

    }

    private void debug(int count) {
        if (count==11){
            return;
        }
    }
    public static void main(String arg[]){//main--来自高金磊
        new Main().exist(new char[][]{{'A','B','C','E'},{'S','F','E','S'},{'A','D','E','E'}}, "ABCEFSADEESE");

//        new Main().exist(new char[][]{{'a','a'}}, "aaaa");
//        new Main().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
    }

}
