/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.哈弗曼树;

import java.util.PriorityQueue;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
        int[] data=new int[]{1,4,6,3,2,8};
        PriorityQueue<TreeNode> middle=new PriorityQueue<>((a,b)->(a.num-b.num));
        for (int datum : data) {
            middle.add(new TreeNode(datum));
        }
        while (middle.size()>1){
            TreeNode le=middle.poll();
            TreeNode ri=middle.poll();
            TreeNode node=new TreeNode(le.num+ri.num);
            node.nextL=le;
            node.nextR=ri;
            middle.add(node);
        }
        PrintTree(middle.poll());
    }
//用中序遍历检验得到的答案
    private static void PrintTree(TreeNode poll) {
        if (poll==null)
            return;
        PrintTree(poll.nextL);
        System.out.println(poll.num);
        PrintTree(poll.nextR);
    }
}
class TreeNode{
    public TreeNode nextL;
    public TreeNode nextR;
    public int num;
    public TreeNode(int num){
        this.num=num;
    }

}