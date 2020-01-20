package 领扣算法.A简单题.找不同;

import java.util.HashMap;

public class Main {
    HashMap<Character,Integer> sm,tm;
    public char findTheDifference(String s, String t) {
        sm=new HashMap<>();
        tm=new HashMap<>();
        for (char c: s.toCharArray()) {
            if (!sm.containsKey(c))
                sm.put(c, 1);
            else
                sm.put(c, sm.get(c)+1);
        }
        for (char c : t.toCharArray()) {
            if (!tm.containsKey(c))
                tm.put(c, 1);
            else
                tm.put(c, tm.get(c)+1);
        }

        for (char c : tm.keySet()) {
            if (sm.containsKey(c)) {
                if (sm.get(c) != tm.get(c)) {
                    return c;
                }
            }
            else
                return c;
        }
        return 0;
    }


    public static void main(String arg[]){//main--来自高金磊
     Integer a=new Integer(0);
     Integer b=new Integer(0);
     System.out.println(a==b);
     System.out.println(a.equals(b));

    }
}
