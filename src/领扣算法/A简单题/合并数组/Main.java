package 领扣算法.A简单题.合并数组;

public class Main {
    /**
     *将nums2的数合并到1中
     * @param nums1
     * @param m 数组一有效数字的大小
     * @param nums2
     * @param n 数组2 的大小
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int middle;
        int j;
        //数组一的真实大小是m+n
        //理论上遍历一次num1即可实现
        //每次循环找出nums1[i]和nums2的最小值
        for (int i = 0; i < m+n; i++) {
            //确定数组一的一位
            //将数组2当作容器每次都要遍历
            //标识占位0
            nums1[i]=nums1[i]==0&&i>=m?Integer.MAX_VALUE:nums1[i];
//            if (i>=m&&nums1[i]==0)
//                nums1[i]=Integer.MAX_VALUE;
            for (j = 0; j < n; j++) {
                if (nums1[i]>nums2[j]){
                    middle=nums1[i];
                    nums1[i]=nums2[j];
                    nums2[j]=middle;
                }

            }

        }
    }
    public static void main(String arg[]){//main--来自高金磊

     new Main().merge(new int[]{1,3,4,5,0,0,0}, 4, new int[]{2,3,3}, 3);
    }
}
