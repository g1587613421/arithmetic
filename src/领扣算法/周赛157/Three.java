package 领扣算法.周赛157;

public class Three
{
    public int getMaximumGold(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                //从任一个位置进
                if (grid[i][j]!=0){
                    plus(grid, new boolean[grid.length][grid[0].length],i,j);
                }
            }
        }
        return 0;
    }
    int plus(int[][] grid,boolean err[][],int i ,int j){
        return 0;
    }
}
