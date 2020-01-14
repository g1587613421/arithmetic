package 领扣算法.解码;

public class Main {

    int result=0;
    /**
     *'A'的字符集对应的是65
     * @param s
     * @return
     */
    public int numDecodings(String s) {
        if (s.charAt(0)=='0'||s.indexOf("00")!=-1)
            return 0;
        numD(s.toCharArray(),0,0);
        return result;
    }
    public void numD(char[] nums,int start,int pre){
        //只剩下一位或者一位也没有的是否即可确定已经确定最终结果
        if (nums.length-1<=start){
            result++;
            return;
        }
        //已经确定剩余2位+
        if (nums[start]-'0'>2||(nums[start]-'0'==2&&nums[start+1]-'0'>=7)){
            //只能读取一位:
            numD(nums, start+1, 0);
            return;
        }
        if (nums[start+1]=='0'){
            numD(nums, start+2, 0);
            return;
        }
        //读取两位
        numD(nums, start+1, 0);
        numD(nums, start+2, 0);
    }
    public static void main(String arg[]){//main--来自高金磊
     System.out.println(new Main().numDecodings("0"));

    }
}
