/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.加和;

import java.util.HashSet;

public class Main {
    private void Add_num(int k,int[] nums){
        HashSet<Integer> target=new HashSet<>();
        HashSet<Integer> res=new HashSet<>();
        for (int num : nums) {
            if (target.contains(num)&&!res.contains(k-num)){
                //找到答案
                res.add(num);
            }
            else {
                target.add(k-num);
            }
        }
        for (Integer re : res) {
            System.out.println(re+"  ,  "+(k-re));
        }

    }
    public static void main(String arg[]){//main--来自高金磊
        Main mm=new Main();
        mm.Add_num(10, new int[]{3,4,2,3,7,7,45,4,8,-4,32,1,3,4,5,54,3,2,8,4,4,3,4});
    }
}
