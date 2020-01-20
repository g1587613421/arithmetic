package 领扣算法.A简单题.层次遍历;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
      List<List<Integer>> res=new ArrayList<>();
      Map<Integer,List<Integer>> data=new HashMap<>();
        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Plus(root, 0);
            for (int i = data.size()-1; i >=0; i--) {
                res.add(data.get(i));
            }
            return res;
        }
        private void Plus(TreeNode root,int deep){
            if (root==null)
                return;
            List<Integer> middle=data.getOrDefault(deep, new ArrayList<>());
            middle.add(root.val);
            data.put(deep, middle);
            Plus(root.left, deep+1);
            Plus(root.right, deep+1);
        }
}
