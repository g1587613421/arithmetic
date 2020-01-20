package 领扣算法.A简单题.平衡二叉树;
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Main {
    public boolean isBalanced(TreeNode root) {
        if (root==null)
            return true;
        if (Math.abs(Plus(root.right, 0)-Plus(root.left, 0))>1)
            return false;

        return isBalanced(root.left)&&isBalanced(root.right);
    }
    public static void main(String arg[]){//main--来自高金磊


    }

    private int Plus(TreeNode root, int value) {
      if (root!=null)
          return Math.max(Plus(root.left, value+1),Plus(root.right, value+1));
      else
          return value;

    }
}
