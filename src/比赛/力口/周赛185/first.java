/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛185;

import java.util.LinkedList;

public class first {
    public String reformat(String s) {
        LinkedList<Character> num=new LinkedList<>(),chars=new LinkedList<>();
        for (char c : s.toCharArray()) {
            if (c<='9'&&c>='0'){
                num.add(c);
            }
            else chars.add(c);
        }
        if (num.size()<chars.size()){
            LinkedList<Character> middle=num;
            num=chars;
            chars=middle;
        }
        StringBuffer stringBuffer=new StringBuffer();
        while (!num.isEmpty()&&!chars.isEmpty()){
            stringBuffer.append(num.poll()).append(chars.poll());
        }
        if (!num.isEmpty())
            stringBuffer.append(num.poll());
        return num.isEmpty()&&chars.isEmpty()?stringBuffer.toString():"";

    }

}
