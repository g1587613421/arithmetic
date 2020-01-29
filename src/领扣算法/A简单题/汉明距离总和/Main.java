package 领扣算法.A简单题.汉明距离总和;

public class Main {
    public int totalHammingDistance(int[] nums) {
        if(nums.length<=1){
            return 0;
        }
        int len=nums.length;
        int[] sums=new int[32];
        int x=0;
        for(int i=0;i<len;i++){//统计每个二进制位上的1出现个数
            for(int j=0;j<32;j++){
                sums[j]+=nums[i]&1;
                nums[i]=nums[i]>>1;
                if(nums[i]==0){
                    break;
                }
            }
        }
        int sum=0;
        for(int i=0;i<32;i++){//通过对每个二进制位上的1的个数和0的个数相乘，求和
            sum+=sums[i]*(len-sums[i]);
        }
        return sum;
    }
}
