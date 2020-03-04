/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.最小绝对差;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res=new LinkedList<>();
        LinkedList<Integer> middle;
        int min_=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            min_=Math.min(min_, arr[i+1]-arr[i]);
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i+1]-arr[i]!=min_)
                continue;
            middle=new LinkedList<>();
            middle.add(arr[i]);
            middle.add(arr[i+1]);
            res.add(middle);
        }
        return res;
    }
}
