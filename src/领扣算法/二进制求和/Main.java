package 领扣算法.二进制求和;

public class Main {
    public String addBinary(String a, String b) {
       char[] ac=a.toCharArray();
       char[] bc=b.toCharArray();
       char[] middle;
       if (ac.length<bc.length){//交换保证ac最大
           middle = ac;
           ac=bc;
           bc=middle;
       }
       int sub=0;
       int last=0;
        StringBuffer res=new StringBuffer();
        for (int n = ac.length-1; n>=0; n--) {
            last=ac[n]-48+sub+((bc.length+n-ac.length)>=0?bc[bc.length+n-ac.length]-48:0);
            if (last>1){
                last-=2;
                sub=1;
            }
            else sub=0;
            res.insert(0, last);
        }
        if (sub!=0)
        res.insert(0, "1");

        return res.toString();

    }
    public static void main(String arg[]){//main--来自高金磊
     new Main().addBinary("0", "0");

    }
}
