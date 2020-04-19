/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛185;

import java.util.LinkedList;

public class third {
    public int minNumberOfFrogs(String croakOfFrogs) {
        LinkedList<Integer> c=new LinkedList<>(),r=new LinkedList<>(),o=new LinkedList<>(),a=new LinkedList<>(),k=new LinkedList<>();
        int index=0;
        int max=0;
        for (char c1 : croakOfFrogs.toCharArray()) {
            switch (c1){
                case 'c':
                    c.add(index++);
                    break;
                case 'r':
                    r.add(index++);
                    break;
                case 'o':
                    o.add(index++);
                    break;
                case 'a':
                    a.add(index++);
                    break;
                case 'k':
                    k.add(index++);
                    break;
            }
            max=Math.max(max, c.size()-k.size());
        }
//        HashSet<String> flag=new HashSet<>();
        if (c.size()!=r.size()||r.size()!=o.size()||o.size()!=a.size()||a.size()!=k.size())
            return -1;
        while (!c.isEmpty())
        {
//            String s = (r.getFirst()-c.getFirst())+","+(o.getFirst()-r.getFirst())+","+(a.getFirst()-o.getFirst())+","+(k.getFirst()-a.getFirst());
            if (c.pollFirst()<r.peekFirst()&&r.pollFirst()<o.peekFirst()&&o.pollFirst()<a.peekFirst()&&a.pollFirst()<k.pollFirst())
            {

            }
            else return -1;
        }
        return max;

    }
}
