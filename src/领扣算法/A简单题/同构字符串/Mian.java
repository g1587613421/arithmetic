package 领扣算法.A简单题.同构字符串;

import java.util.HashMap;

public class Mian {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> res=new HashMap<>();
        char c1,c2;
        for (int i = 0; i < s.length(); i++) {
            c1=s.charAt(i);
            c2=t.charAt(i);
            if (!res.containsKey(c1)&&!res.containsValue(c2)){
                res.put(c1, c2);
            }
            else
            {
                if (!res.containsKey(c1)||res.get(c1)!=c2)
                    return false;
            }

        }
        return true;
    }
    public static void main(String arg[]){//main--来自高金磊
     new Mian().isIsomorphic("ab", "aa");

    }
}
