/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.分糖果;

import java.util.HashSet;

public class Main {

    public int distributeCandies(int[] candies) {
        int max=candies.length/2;
        HashSet<Integer> data=new HashSet<>();
        for (int candy : candies) {
                data.add(candy);
        }

        return data.size()>max?max:data.size();
    }
}
