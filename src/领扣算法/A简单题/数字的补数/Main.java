package 领扣算法.A简单题.数字的补数;

public class Main {
    public int findComplement(int num) {
        int n=0;
        int res=0;
        while (num!=0){
           if ((num&1)==0){
               res+=1<<n;
           }
           n++;
            num=num>>1;
        }
        return res;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.print(new Main().findComplement(4));
    }
}
