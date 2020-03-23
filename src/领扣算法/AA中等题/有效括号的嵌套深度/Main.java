/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.有效括号的嵌套深度;

public class Main {
    public int[] maxDepthAfterSplit(String seq) {
        //计算seq括号的深度
        int leftC=0;
        int max=0;
        char[] chars=seq.toCharArray();
        for (char c : chars) {
            switch (c){
                case '(':
                    leftC++;
                    max=Math.max(leftC, max);
                    break;
                case ')':
                    leftC--;
                    break;
            }

        }
        //将括号的一半(近似)给A另一半给B
        int[] res = new int[chars.length];
        int AC=0,BC=0;
        int value=0;
        for (int i = 0; i < res.length; i++) {
           if (chars[i]=='('){
               if (AC<max/2){
                   AC++;
                   res[i]=0;
               }else {
                   res[i] = 1;
                   BC++;
               }
           }else {
               if (BC>0){
                   BC--;
                   res[i]=1;
               }
               else {
                   AC--;
                   res[i]=0;
               }
           }
        }



return res;

    }
}
