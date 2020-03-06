/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.查找常用字符;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public List<String> commonChars(String[] A) {
        LinkedList<String> res=new LinkedList<>();
        for (char c : A[0].toCharArray()) {
            int min=Integer.MAX_VALUE;
            if (res.contains(""+c))
                continue;
            for (int i = 0; i < A.length; i++) {
                int count=0;
                for (char cc : A[i].toCharArray()) {
                    if (cc==c)
                        count++;
                }
                min=Math.min(count, min);

            }
            for (int j = 0; j < min; j++) {
                res.add(""+c);
            }
        }
        return res;

    }
}
