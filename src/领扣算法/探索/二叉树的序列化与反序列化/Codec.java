/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.二叉树的序列化与反序列化;

import java.util.LinkedList;


//未通过,可以考虑先跟遍历来保存二叉树或者用先跟和中跟遍历来保存和还原
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        LinkedList<TreeNode> data=new LinkedList<>(),middle=new LinkedList<>();
        StringBuffer res=new StringBuffer(),re=new StringBuffer();
        data.addLast(root);
        boolean b=true;
        while (b){
            b=false;
            while (!data.isEmpty()){
                if (data.peekFirst()==null){
                    re.append("null,");
                    middle.addLast(null);
                    middle.addLast(null);
                }
                else {
                    b=true;
                    re.append(data.peekFirst().val).append(",");
                    middle.addLast(data.peekFirst().left);
                    middle.addLast(data.peekFirst().right);
                }
                data.pollFirst();
            }
            res.append(re);
            re=new StringBuffer();
            data.addAll(middle);
            middle.clear();
        }
        if (res.length()>0)
            res.deleteCharAt(res.length()-1);
        return res.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
       String[] ds=data.split(",");
       if (ds.length==0)
           return null;
       TreeNode head=new TreeNode(Integer.valueOf(ds[0]));
       LinkedList<TreeNode> dalist=new LinkedList<>(),middle=new LinkedList<>();
       dalist.add(head);
       int index=1;
       while (index<ds.length){
           while (!dalist.isEmpty())
           {
               if (index>=ds.length)
               {
                   dalist.clear();
                   break;
               }
               String val=ds[index];
               if (val.equals("null")){
                   middle.add(null);
                   middle.add(null);
                   index+=2;
               }
               else {
                   TreeNode treeNode=new TreeNode(Integer.valueOf(val));
                   if (index%2==1){
                       dalist.peekFirst().left=treeNode;
                   }
                   else {
                       dalist.pollFirst().right=treeNode;
                   }
                   middle.add(treeNode);
                   index++;
               }
           }
           dalist.clear();
           dalist.addAll(middle);
           middle.clear();
       }



       return head;
    }
    
    
    
    public static void main(String arg[]) {//main--来自高金磊


        new Codec().serialize(new Codec().deserialize("1,2,3,null,null,4,5"));
    }
}




  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }