/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.N叉树的层序遍历;

import 领扣算法.A简单题.N叉树的最大深度.Node;

import java.util.ArrayList;
import java.util.List;
public class Main {
    List<List<Integer>> result=new ArrayList<>();
    List<List<Node>> data=new ArrayList<>(),data2=new ArrayList<>();
    List<Integer> res=new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if (root!=null)
        {
            res.add(root.val);
            data.add(root.children);
            result.add(res);

        }
        while (data.size()!=0){
            res=new ArrayList<>();
            for (List<Node> datum : data) {
                for (Node node : datum) {
                    res.add(node.val);
                    data2.add(node.children);
                }
            }
            if (res.size()!=0)
            result.add(res);
            data.clear();
            data.addAll(data2);
            data2.clear();
        }


        return result;
    }
    public static void main(String arg[]){//main--来自高金磊
    List<Node> root=new ArrayList<>();
    Node ro=new Node();
    ro.val=1;
    List<Node> ch=new ArrayList<>();
    Node ro1=new Node(2);
    ch.add(ro1);

    new Main().levelOrder(ro);
    }
}
