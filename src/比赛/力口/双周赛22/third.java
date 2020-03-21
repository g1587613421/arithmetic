/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛22;

import java.util.Arrays;
import java.util.Comparator;

public class third {
    int[][] data;
    int[] middle;
    public int getKth(int lo, int hi, int k) {
        if (hi-lo<=0)
            return lo;
        data = new int[hi-lo+1][2];
        middle = new int[hi*3+1];
        for (int i = lo; i <hi+1; i++) {
            middle[i]=plus(i,0);
        }
        for (int i = 0; i < data.length; i++) {
            data[i]=new int[]{middle[lo+i],lo+i};
        }

        Arrays.sort(data,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0]==o2[0])
                    return o1[1]-o2[1];
                return o1[0]-o2[0];
            }
        });
        return data[k-1][1];
    }
    private int plus(int target,int i){
        if (target==1)
            return i;
        while (target>middle.length-1)
        {
            i++;
            target/=2;
        }
        if (middle[target]==0)
             middle[target]=target%2==0?plus(target/2,i+1):plus(target*3+1,i+1);
        return middle[target]+i;
    }

    public static void main(String[] arg){//main--来自高金磊
    
        new third().getKth(12, 15, 2);
    }
}
