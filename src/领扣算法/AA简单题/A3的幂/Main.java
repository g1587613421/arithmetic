package 领扣算法.AA简单题.A3的幂;

public class Main {

    public boolean isPowerOfThree(int n) {
        String data=Integer.toString(n, 3);
        return data.indexOf('1')==data.lastIndexOf('1')&&n>1&&data.lastIndexOf('1')!=-1&&data.indexOf('2')==-1;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().isPowerOfThree(45);
    }
}
