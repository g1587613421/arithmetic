package 领扣算法.AA简单题.路径总和;

public class Main {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)
            return false;
        sum-=root.val;
        if (sum==0&&root.right==null&&root.left==null)
            return true;
        return hasPathSum(root.left, sum)||hasPathSum(root.right, sum);
    }
}
