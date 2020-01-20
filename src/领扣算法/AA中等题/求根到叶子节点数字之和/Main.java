package 领扣算法.AA中等题.求根到叶子节点数字之和;
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

class Main {
    int res=0;
    public int sumNumbers(TreeNode root) {
        if (root==null)
            return 0;
        plus(root, 0);
        return res;
    }
    void plus(TreeNode root,int num)
    {
        num=num*10+root.val;
        if (root.left==null&&root.right==null)
        {
            res+=num;
            return;
        }
        if (root.right!=null)
            plus(root.right, num);
        if (root.left!=null)
            plus(root.left, num);
    }
}