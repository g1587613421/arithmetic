/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.划分字母区间;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public List<Integer> partitionLabels(String S) {
      int[][] data=new int[26][2];
        char[] chars=S.toCharArray();
        ArrayList<Integer> res=new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
          int[] d=data[chars[i]-'a'];
          if (d[0]==0)
          {
              d[0]=i+1;
              d[1]=d[0];
          }
          else d[1]=i+1;
        }
        Arrays.sort(data,Comparator.comparingInt(a->a[0]));
        int start=1,end=data[0][1];
        for (int i = 1; i < data.length; i++) {
            if (data[i][0]==0)
                continue;
            if (data[i][0]>end&&end!=0){
                res.add(end-start+1);
                start=data[i][0];
                end=data[i][1];
                continue;
            }
            end=Math.max(end, data[i][1]);
            
        }
        res.add(end-start+1);
        return res;
    }
    
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().partitionLabels("eaaaabaaec");
    }
}
