/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.春季编程竞赛2020团队赛;

import java.util.HashSet;

public class first {
    public int expectNumber(int[] scores) {
        HashSet<Integer> data=new HashSet<>();
        for (int score : scores) {
            data.add(score);
        }
        return data.size();
    }
}
