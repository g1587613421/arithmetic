package 领扣算法.A简单题.树的最大深度;

public class Mian {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public int maxDepth(TreeNode root) {
          return Plus(root, 0);
    }
    int Plus(TreeNode root,int value){
        if (root!=null)
            return Math.max(Plus(root.left, value+1),Plus(root.right, value+1));
        else
            return value;
    }
}
