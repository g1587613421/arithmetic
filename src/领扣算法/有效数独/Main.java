package 领扣算法.有效数独;

public class Main {
    boolean aBoolean[];//记忆每一组的存在数
    int count=0;
    public boolean isValidSudoku(char[][] board) {
        for (char[] chars : board) {
            if (!(checkline(chars)&& checkrows(board,count)&&checkRec(board,count++)))
                return false;

        }
        return true;
    }

    private boolean checkRec(char[][] board, int i) {
        aBoolean=new boolean[10];
//      int start=i*3;
      //起始位置是[i*3%9][i*3/9]
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (board[i*3%9+j][(i*3/9)*3+k]!='.')
                    if (!aBoolean[board[i*3%9+j][(i*3/9)*3+k]-'0'])
                        aBoolean[board[i*3%9+j][(i*3/9)*3+k]-'0']=true;
                    else return false;
            }

        }
        return true;
    }

    private boolean checkrows(char[][] board, int count) {
        aBoolean=new boolean[10];
        for (int i = 0; i < board.length; i++) {
            if (board[i][count]!='.')
                if (!aBoolean[board[i][count]-'0'])
                    aBoolean[board[i][count]-'0']=true;
                else return false;
        }
        return true;
    }

    //判断每一行
    private boolean checkline(char[] chars) {
        aBoolean=new boolean[10];
        for (char aChar : chars) {
            if (aChar!='.')
                if (!aBoolean[aChar-'0'])
                    aBoolean[aChar-'0']=true;
                else return false;
        }

        return true;
        
    }
public static void main(String arg[]){//main--来自高金磊

 System.out.println(new Main().checkline(new char[]{'1','1'}));
 System.out.println(new Main().isValidSudoku(new char[][]{{'.','9','.','.','4','.','.','.','.'},
                                                     {'1','.','.','.','.','.','6','.','.'},
                                                     {'.','.','3','.','.','.','.','.','.'},
                                                     {'.','.','.','.','.','.','.','.','.'},
                                                     {'.','.','.','7','.','.','.','.','.'},
                                                     {'3','.','.','.','5','.','.','.','.'},
                                                     {'.','.','7','.','.','4','.','.','.'},
                                                     {'.','.','.','.','.','.','.','.','.'},
                                                     {'.','.','.','.','7','.','.','.','.'}}));
}
}
