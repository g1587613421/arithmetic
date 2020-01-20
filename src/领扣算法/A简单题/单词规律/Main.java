package 领扣算法.A简单题.单词规律;

import java.util.HashMap;

public class Main {
    HashMap<Character,String> data=new HashMap<>();
    String middle="";
    char[] keys;
    String values[];
    public boolean wordPattern(String pattern, String str) {
        keys = pattern.toCharArray();
        values = str.split(" ");
        if (keys.length!=values.length)
            return false;
        for (int n = 0;n<keys.length;n++){
            if (data.containsKey(keys[n]))
            {
                if (!data.get(keys[n]).equals(values[n]))
                    return false;
            }
            else {
                data.put(keys[n],values[n]);
            }
        }

        for (String value : data.values()) {
            if (middle.equals(value))
                return false;
            middle=value;
        }
        return true;
    }
}
