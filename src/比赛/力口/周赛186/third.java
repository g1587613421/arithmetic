/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛186;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class third {


    public int[] findDiagonalOrder(List<List<Integer>> nums) {

        if (nums.size()==1){
            int[] result=new int[nums.get(0).size()];
            int index=0;
            for (Integer num : nums.get(0)) {
                result[index++]=num;
            }
            return result;
        }


        int[] cd=new int[nums.size()];
        for (int i = 0; i < cd.length; i++) {
            cd[i]=nums.get(i).size();
        }
        List<Integer>[] rd=new List[cd.length];
        int mmm=0;
        for (List<Integer> num : nums) {
            rd[mmm++]=num;
        }
        System.out.println(cd.length);
        LinkedList<Integer> res=new LinkedList<>();
        int len=nums.size();
        int maxc= Arrays.stream(cd).max().getAsInt();
        System.out.println(maxc);
        if (maxc==1){
            int[] result=new int[nums.size()];
            int index=0;
            for (List<Integer> num : nums) {
                result[index++]=num.get(0);
            }
            return result;
        }
        for (int i = 0; i < len; i++) {
            int r=i,c=0;
            while (r>=0&&c<maxc){
                if (cd[r]>c)
                    res.add(rd[r].get(c));
                r--;
                c++;
            }
        }
        for (int i = 1; i < maxc; i++) {
            int r=len-1;
            int c=i;

            while (r>=0&&c<=maxc){
                if (cd[r]>c)
                    res.add(rd[r].get(c));
                r--;
                c++;
            }
        }
        int result[]=new int[res.size()];
        for (int i = 0; i < result.length; i++) {
            result[i]=res.pollFirst();
        }
        return result;
    }

}
