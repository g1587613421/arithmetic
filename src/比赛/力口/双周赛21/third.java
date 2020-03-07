/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛21;

import java.util.ArrayList;
import java.util.LinkedList;

public class third {

    class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
      int max=0;
    ArrayList<TreeNode> middle=new ArrayList<>();
    LinkedList<TreeNode> data=new LinkedList<>();
    public int longestZigZag(TreeNode root) {
        if (root==null||root.right==root.left)
            return 0;
        data.add(root);
        middle.add(root);
        while (data.size()>0){
            TreeNode mm=data.pop();
            PlusR(mm, 0);
            PlusL(mm, 0);
        }

        return max;
    }

    void PlusR(TreeNode ro,int dp){
      if (ro.right==null) {
          max = Math.max(dp , max);
      }
      else {
          if (!middle.contains(ro.right)) {
              data.add(ro.right);
              middle.add(ro.right);
          }
          PlusL(ro.right, dp + 1);
      }

    }
    void PlusL(TreeNode ro,int dp){

        if (ro.left==null)
            max=Math.max(dp, max);
        else {
            if (!middle.contains(ro.left)){
                data.add(ro.left);
            middle.add(ro.left);
            }
            PlusR(ro.left, dp + 1);
        }
    }



//    int max_=0;
//    LinkedList<TreeNode> right=new LinkedList<>(),left=new LinkedList<>();
//    public int longestZigZag(TreeNode root) {
//        if (root==null||root.right==root.left)
//            return 0;
//        if (root.left!=null)
//            right.add(root.left);
//        if (root.right!=null)
//            left.add(root.right);
//
//        while (right.size()!=0||left.size()!=0){
//            if (left.size()>0)
//                PlusL(left.pop(), 0);
//            if (right.size()>0)
//                PlusR(right.pop(), 0);
//        }
//
//        return max_;
//    }
//
//    void PlusR(TreeNode ro,int dp){
//        if (ro.left!=null) {
//            left.add(ro.left);
//            PlusL(ro.left, dp + 1);
//        }
//        else max_=Math.max(max_, dp+1);
//
//
//
//    }
//    void PlusL(TreeNode ro,int dp){
//        if (ro.right!=null) {
//            r.add(ro.right);
//            PlusR(ro.right, dp + 1);
//        }
//        else max_=Math.max(max_, dp+1);
//    }
}
