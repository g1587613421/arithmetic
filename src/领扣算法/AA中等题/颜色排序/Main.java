package 领扣算法.AA中等题.颜色排序;

public class Main {
    public void sortColors(int[] nums) {
        int r=0,g=0,b=0;
        for (int num : nums) {
            switch (num){
                case 0:
                    r++;
                    break;
                case 1:
                    g++;
                    break;
                case 2:
                    b++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (r>i)
                nums[i]=0;
            else{
                if (r+g>i)
                    nums[i]=1;
                else nums[i]=2;
        }}
    }
}
