package 领扣算法.A简单题.字母异位词;

import java.util.HashMap;

public class Main {
    HashMap<Character,Integer> data=new HashMap<>();
    public boolean isAnagram(String s, String t) {
        for (char c : s.toCharArray()) {
            if (data.containsKey(c))
                data.put(c,data.get(c)+1);
            else
                data.put(c, 1);

        }
        for (char c : t.toCharArray()) {
            if (data.containsKey(c))
                data.put(c,data.get(c)-1);
            else
                data.put(c, -1);
        }
        for (Integer value : data.values()) {
            if (value!=0)
                return false;
        }
        return true;
    }
}
