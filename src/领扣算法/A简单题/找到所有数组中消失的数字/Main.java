/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.找到所有数组中消失的数字;

import Tools.SimpleTimeTest;

import java.util.ArrayList;
import java.util.List;

public class Main {
    boolean flag[];
    List<Integer> result=new ArrayList<>();
    public List<Integer> findDisappearedNumbers(int[] nums) {
        flag=new boolean[nums.length+1];
        for (int num : nums) {
            flag[num]=true;
        }
        for (int i = 1; i < flag.length+1; i++) {
            if (!flag[i])
                result.add(i);
        }
        return result;
    }
public static void main(String arg[]){//main--来自高金磊
        Main main=new Main();
    SimpleTimeTest.TestMethod();
    main.findDisappearedNumbers(null);
    SimpleTimeTest.endMethod("");
}
}
