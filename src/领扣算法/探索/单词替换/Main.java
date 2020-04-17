/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.单词替换;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Main {
    public String replaceWords(List<String> dict, String sentence) {
        HashMap<Character,Node> data=new HashMap<>(),middle;
        Collections.sort(dict,(a,b)->(a.length()-b.length()));
        for (String s : dict) {
            middle=data;
            for (char c : s.toCharArray()) {
                if (!middle.containsKey(c))
                {
                    Node node=new Node(c);
                    middle.put(c, node);
                }else break;

                middle=middle.get(c).data;
            }
        }

        String[] res=sentence.split(" ");
        for (int i = 0; i < res.length; i++) {
            middle=data;
            StringBuffer ms=new StringBuffer();
            for (char c : res[i].toCharArray()) {
                if (middle.containsKey(c)){
                    ms.append(c);
                    middle=middle.get(c).data;
                }else break;
            }
            if (ms.length()>0&&middle.keySet().size()==0)
            res[i]=ms.toString();
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (String re : res) {
            stringBuilder.append(" ").append(re);
        }
        if (stringBuilder.length()>1&&stringBuilder.charAt(0)==' ')
            stringBuilder.deleteCharAt(0);
        if (stringBuilder.length()>1&&stringBuilder.charAt(stringBuilder.length()-1)==' ')
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }



    class Node{
        char aChar;
        HashMap<Character,Node> data;
        public Node(char c){
            aChar=c;
            data=new HashMap<>();
        }
    }
}
