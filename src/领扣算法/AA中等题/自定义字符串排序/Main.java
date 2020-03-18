/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.自定义字符串排序;

import java.util.HashMap;

public class Main {
    public String customSortString(String S, String T) {
        HashMap<Character,Integer> data=new HashMap<>();
        for (int i = 0; i < T.length(); i++) {
            data.put(T.charAt(i), data.getOrDefault(T.charAt(i),0)+1);
        }
        StringBuffer res=new StringBuffer();
        int sum;
        for (char c : S.toCharArray()) {

            sum = data.getOrDefault(c, 0);
            if (sum>0)
                data.put(c, 0);
            while (sum!=0){
                sum--;
                res.append(c);
            }

        }
        for (Character character : data.keySet()) {
            if (data.get(character)==0)
                continue;
            sum=data.get(character);
            while (sum!=0){
                sum--;
                res.append(character);
            }
        }
        return res.toString();
    }
}
