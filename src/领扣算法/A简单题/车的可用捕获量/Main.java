/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.车的可用捕获量;

public class Main {
    public int numRookCaptures(char[][] board) {
        int x=-1,y=-1;
        for (int i = 0; i < board.length; i++) {
            if (x!=-1)
                break;
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j]=='R')
                {
                    x=i;
                    y=j;
                }

            }
        }
        int count=0;
        for (int i = x+1; i < board.length; i++) {
            if (board[i][y]=='p'){
                count++;
                break;
            }
            else if (board[i][y]!='.'){
                break;
            }
        }
        for (int i =x-1; i >=0; i--) {
            if (board[i][y]=='p'){
                count++;
                break;
            }
            else if (board[i][y]!='.'){
                break;
            }
        }
        for (int i = y+1; i < board[0].length; i++) {
            if (board[x][i]=='p'){
                count++;
                break;
            }else
                if (board[x][i]!='.')
                    break;
        }
        for (int i = y-1; i>=0; i--) {
            if (board[x][i]=='p'){
                count++;
                break;
            }else
            if (board[x][i]!='.')
                break;
        }

        return count;

    }
}
