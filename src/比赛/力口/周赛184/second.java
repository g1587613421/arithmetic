/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛184;

import java.util.LinkedList;

public class second {
    LinkedList<Integer> res=new LinkedList<>();
    public int[] processQueries(int[] queries, int m) {
        for (int i = 1; i < m+1; i++) {
            res.addLast(i);
        }
        for (int i = 0; i < queries.length; i++) {
            Integer middle=queries[i];
            queries[i]=res.indexOf(middle);
            res.remove(middle);
            res.addFirst(middle);
        }

        return queries;
    }
}
