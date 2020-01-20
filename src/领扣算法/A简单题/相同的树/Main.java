package 领扣算法.A简单题.相同的树;

public class Main {
    //和对称二叉树中的方法相同



      public class TreeNode {
          int val;
        TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
     }

    /**
     * T:100
     * M:88
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null||q==null)
        {
            return p==q;
        }
          if (p.val!=q.val)
              return false;
          return isSameTree(p.left, q.left)&&isSameTree(p.right, q.right);
    }

}
