/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.子域名访问计数;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    HashMap<String,Integer> data=new HashMap<>();
    public List<String> subdomainVisits(String[] cpdomains) {
        for (String cpdomain : cpdomains) {
            String[] middle=cpdomain.split(" ");
            int num=Integer.valueOf(middle[0]);
            data.put(middle[1],data.getOrDefault(middle[1],0)+num);
            String s=cpdomain.substring(cpdomain.indexOf(".")+1);
            data.put(s, data.getOrDefault(s, 0)+num);
            if (s.contains(".")){
                s=s.substring(s.indexOf(".")+1);
                data.put(s, data.getOrDefault(s, 0)+num);
            }
        }
        ArrayList<String> res=new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : data.entrySet()) {
            res.add(stringIntegerEntry.getValue()+" "+stringIntegerEntry.getKey());
        }

        return res;
    }
}
