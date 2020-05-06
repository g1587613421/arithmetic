/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.数组的度;

import java.util.*;

public class Main {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Node> data=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Node node=data.getOrDefault(nums[i],new Node());
            node.setValue(i);
            data.put(nums[i],node);
        }
        ArrayList<Node> res=new ArrayList<>(data.values());
        Collections.sort(res,new Comparator<Node>(){

            @Override
            public int compare(Node o1, Node o2) {
                if (o1.count!=o2.count)
                    return o2.count-o1.count;
                return o1.getvalue()-o2.getvalue();
            }
        });
        return res.get(0).getvalue();
    }
    class Node{
        int pre=Integer.MAX_VALUE;
        int last=Integer.MIN_VALUE;
        int count=0;
        public int getvalue(){
            return last-pre+1;
        }
        void setValue(int val){
            count++;
            pre=Math.min(pre, val);
            last=Math.max(last, val);
        }
    }
}
