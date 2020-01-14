package 领扣算法.AA简单题.对称树;

public class Main {

    public boolean isSymmetric(TreeNode root) {
        if (root==null)
            return false;
//        System.out.println(plus(root.left));
//        System.out.println(plus(root.right));
        return plus(root.left,true).equals(plus(root.right,false));
    }
    public String plus(TreeNode root,boolean left){
        if (root==null)
            return null;
        if (left)
        return root.val+plus(root.left,left)+plus(root.right,left);
        else return root.val+plus(root.right, left)+plus(root.left, left);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}