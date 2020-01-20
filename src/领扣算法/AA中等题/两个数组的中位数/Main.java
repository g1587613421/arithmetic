package 领扣算法.AA中等题.两个数组的中位数;

public class Main {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]  middle;

        if (nums1.length==0) middle=nums2;
        else
            if (nums2.length==0) middle=nums1;
            else {
        middle = new  int[nums1.length+nums2.length];
        for (int n = 0,n1=0,n2=0; n < middle.length; n++) {
            if (n1>=nums1.length)
            {
                middle[n]=nums2[n2++];
                continue;
            }
            if (n2>=nums2.length)
            {
                middle[n]=nums1[n1++];
                continue;
            }
            if (nums1[n1]<nums2[n2]){
                middle[n]=nums1[n1++];
            }
            else
                middle[n]=nums2[n2++];
        }}
        if (middle.length%2!=0)
            return middle[middle.length/2];
        return (0.5d*(middle[middle.length/2-1]+middle[middle.length/2]));
    }


    public static void main(String arg[]){//main--来自高金磊

     System.out.println(new Main().findMedianSortedArrays(new int[]{2,3,4}, new int[]{1}));
    }
}
