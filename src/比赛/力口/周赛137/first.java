package 比赛.力口.周赛137;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class first {
    /**
     * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
     * 位于 grid[i][m - 1] 的元素将会移动到 grid[i + 1][0]。
     * 位于 grid[n - 1][m - 1] 的元素将会移动到 grid[0][0]。
     */
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int middle[][];
        for (int  m = 0; m <k ; m++) {
            middle=new int[grid.length ][grid[0].length];
            for (int i = 0; i < grid.length; i++) {
             for (int j = 0; j < grid[0].length; j++) {
                if (j==grid[0].length-1) {
                    if (i == grid.length - 1) {
                        middle[0][0] = grid[i][j];
                        continue;
                    }
                    middle[i + 1][0] = grid[i][j];
                    continue;
                }
                middle[i][j+1]=grid[i][j];
             }
         }
            grid=middle;
        }
        List<Integer> re;

        for (int i = 0; i < grid.length; i++) {
            re=new LinkedList<>();
            for (int j = 0; j < grid[0].length; j++) {
                re.add(grid[i][j]);
            }
            result.add(re);
        }


        return result;
    }

}
