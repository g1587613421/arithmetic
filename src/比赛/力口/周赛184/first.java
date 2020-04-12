/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛184;

import java.util.LinkedList;
import java.util.List;

public class first {
    LinkedList<String> res=new LinkedList<>();
    public List<String> stringMatching(String[] words) {
        for (String word : words) {
            for (String s : words) {
                if (s.contains(word)&&!s.equals(word))
                {
                    res.add(word);
                    break;
                }
            }
        }
        return res;
    }
}
