/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛182;

public class second {
    public int numTeams(int[] rating) {
        int res=0;
        for (int i = 0; i < rating.length; i++) {
            for (int j = i+1; j < rating.length; j++) {
                if (rating[j]<rating[i])
                for (int k = j+1; k < rating.length; k++) {
                    if (rating[k]<rating[j])
                        res++;
                }
            }
        }
        for (int i = 0; i < rating.length; i++) {
            for (int j = i+1; j < rating.length; j++) {
                if (rating[j]>rating[i])
                    for (int k = j+1; k < rating.length; k++) {
                        if (rating[k]>rating[j])
                            res++;
                    }
            }
        }
        return res;
    }
}
