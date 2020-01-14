package 领扣算法.AA简单题.颠倒二进制位;

public class Mian {
    public int reverseBits(int n) {
        String data=Integer.toBinaryString(n);
        int res=0;
        int count=32-data.length();
        for (char c : data.toCharArray()) {
            if (c-'1'==0){
                res+=1<<count;
            }
            count++;
        }
        return res;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.print(new Mian().reverseBits(0b00000010100101000001111010011100));
    }
}
