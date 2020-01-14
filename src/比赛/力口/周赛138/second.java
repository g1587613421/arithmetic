package 比赛.力口.周赛138;

import java.util.HashMap;
import java.util.Map;

public class second {
    int sum=0;
    Map<Integer,Integer> x=new HashMap<>();
    Map<Integer,Integer> y=new HashMap<>();
    public int countServers(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j]==1)
                {
                    x.put(i, x.containsKey(i)?x.get(i)+1:1);
                    y.put(j, y.containsKey(j)?y.get(j)+1:1);
                }
            }

        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j]==0)
                    continue;
                if (x.get(i)>=2||y.get(j)>=2)
                    sum++;

            }
        }

        return sum;
    }
}
