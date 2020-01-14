package orther;

public class 位运算 {
    public static void main(String arg[]){//main--来自高金磊
       int A=0b10101;
       int B=0b01010;
/*      System.out.println();有缓存
      System.err.println();无缓存
      所以如果不休眠会有顺序混乱
 */
       System.out.println("A:"+A);
       System.out.println("B:"+B);
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.err.println(A&B);
       System.err.println(A|B);
       
       System.out.println(A>>3);
       System.out.println(A<<2);
       
       int num=5;
       System.out.println("判断奇偶性");
       System.out.println((num&1)==0?"偶":"奇");
       num++;
       System.out.println((num&1)==0?"偶":"奇");
       
       //不用临时变量交换两个数
        A=10;
        B=555;
        A=A^B;
        B=B^A;
        A=A^B;
        System.out.println(A+"\n"+B);

        //取int的某一位(二进制)
        A=654321;
        int bit=5;
        System.out.print((A>>2)&1);
        
        //int型平均数(防止溢出)
        A=Integer.MAX_VALUE-1;
        B=A;
        System.out.println("溢出型"+(A+B)/2);
        System.out.println((A&B)+((A^B)>>1));
        
        //如果使用先平均再相加也出现小数溢出****
        B=A=Integer.MAX_VALUE;
        System.out.println(A/2+B/2);
        System.out.println("应该是:"+A);
        
    }
}
