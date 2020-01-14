package 领扣算法.AA简单题.最小深度;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Main {
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        Plus(root, 1);
        return min==Integer.MAX_VALUE?0:min;
    }
    private void Plus(TreeNode root,int deep){
        if (deep>=min)
            return;
        if (root==null)
            return;
        if (root.right==null&&root.left==null) {
            min = deep;
            return;
        }

        Plus(root.left, deep+1);
        Plus(root.right, deep+1);
    }
}