package 比赛.力口.周赛137;

import java.util.ArrayList;

public class FindElements {
       class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }


    TreeNode root;
    ArrayList<Integer> data=new ArrayList<>();
    public FindElements(TreeNode root) {
        this.root=root;
        root.val=0;
        data.add(0);
        plus(root.left, 1);
        plus(root.right, 2);
    }
    public void plus(TreeNode root,int val){
        if (root==null)
            return;
        data.add(val);
        root.val=val;
        plus(root.left, val*2+1);
        plus(root.right, val*2+2);
    }
    public boolean find(int target) {

        return data.contains(target);
    }


}
