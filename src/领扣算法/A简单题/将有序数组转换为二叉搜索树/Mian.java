package 领扣算法.A简单题.将有序数组转换为二叉搜索树;

 class TreeNode {
 int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

class Main {
    public TreeNode sortedArrayToBST(int[] nums) {
        return ToBST(nums,0,nums.length-1);
    }
    public static TreeNode ToBST(int nums[],int left,int right){
        if(left>right)return null;//定义的二分区间为[left,right]，无法进行继续递归，直接退出
        int mid = (int)(left+right)/2;//二分中值
        TreeNode root = new TreeNode(nums[mid]);
        root.left = ToBST(nums,left,mid-1);//注意mid-1 对左半部分进行递归
        root.right = ToBST(nums,mid+1,right);//注意mid+1 对右半部分进行递归
        return root;
    }
}