package 领扣算法.A简单题.最长回文字符串;

import java.util.HashMap;

public class Main {
    HashMap<Character,Integer> result=new HashMap<>();
    int sum=0;
    public int longestPalindrome(String s) {
        for (char c : s.toCharArray()) {
            if (result.containsKey(c))
                result.put(c, result.get(c)+1);
            else result.put(c, 1);
        }
        for (Integer value : result.values()) {
            sum+=value%2==0?value:value-1;
        }
        if (sum<s.length())
            sum++;
        return sum;


    }

}
