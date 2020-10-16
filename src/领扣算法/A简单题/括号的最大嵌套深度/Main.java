/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.括号的最大嵌套深度;

public class Main {
    public int maxDepth(String s) {
      int max=0,count=0;
        for (char c : s.toCharArray()) {
           switch (c){
               case '(':
                   count++;
                   break;
               case ')':
                   count--;
                   break;
           }
           max=Math.max(max, count);
        }
return max;
    }
}
