package 领扣算法.AA中等题.单词搜索;

public class Main {
//???????????????????????????????????????
    public boolean exist(char[][] board, String word) {
        char target[]=word.toCharArray();
        if (target.length==0)
            return true;
        int n=0;
        for (char[] chars : board) {
            for (char aChar : chars) {

                if (aChar==target[n])
                    n++;
                if (n==target.length)
                    return true;
            }
        }
        return false;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED"));
    }
}
