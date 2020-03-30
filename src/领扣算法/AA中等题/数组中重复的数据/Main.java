/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.数组中重复的数据;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        int index=0,middle;
        for (int i = 0; i < nums.length; i++) {
            index=nums[i]-1;
            if (index<0)
                continue;
            nums[i]=0;
            while (index>=0){

                if (nums[index]==0){
                    nums[index]=-1;
                    break;
                }
                if (nums[index]==-1) {
                    res.add(index + 1);
                    break;
                }
                else {

                    middle = nums[index] - 1;
                    nums[index] = -1;
                    index=middle;
                }
            }

        }

        return res;

    }
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().findDuplicates(new int[]{2,3,2,3});
    }
}
