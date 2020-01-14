package 领扣算法.AA简单题.有效的完全平方数;

public class Main {
    public boolean isPerfectSquare(int num) {
        int nu=num;
        int bit=0;
        while (nu>10){
            nu/=10;
            bit++;
        }
        int middle=1;
        for (int i = 0; i < (bit+1)/2; i++) {
            middle*=10;
        }


        while (middle*middle<num)
            middle++;
        return middle*middle==num;
    }
public static void main(String arg[]){//main--来自高金磊
        long pre=System.currentTimeMillis();
    new Main().isPerfectSquare(2147483647);
    System.out.println(System.currentTimeMillis()-pre);
}
}
