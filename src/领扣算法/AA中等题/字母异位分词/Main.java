package 领扣算法.AA中等题.字母异位分词;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public List<List<String>> groupAnagrams(String[] strs) {
        String data[]=new String[strs.length];
        char[] middle;
        for (int i = 0; i < strs.length; i++) {
            middle=strs[i].toCharArray();
            Arrays.sort(middle);
            data[i]=new String(middle);
        }
        LinkedList<String> res;
        LinkedList<List<String>> result=new LinkedList<>();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i]!=null){
                res = new LinkedList<>();
                res.addLast(strs[i]);
                strs[i]=null;
                for (int j = i+1; j < strs.length; j++) {
                   if (data[i].equals(data[j]))
                   {
                       res.addLast(strs[j]);
                       strs[j]=null;
                   }
                }
                result.addLast(res);
            }
        }
        return result;
    }
}
