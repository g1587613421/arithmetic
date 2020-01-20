package 领扣算法.A简单题.字符串相加;

public class Main {

    public String addStrings(String num1, String num2) {
        StringBuffer res=new StringBuffer();
        char nu1;
        char nu2;
        boolean flag=false;
        for (int i = 0; i < Math.max(num1.length(), num2.length()); i++) {
            nu1=i<num1.length()?num1.charAt(num1.length()-i-1):'0';
            nu2=i<num2.length()?num2.charAt(num2.length()-i-1):'0';
            nu1+=nu2-'0';
            if (flag)
                nu1+=1;
            if (nu1<='9')
                flag=false;
            else
            {
                flag=true;
                nu1-='9';
                nu1+='0'-1;
            }
            res.append(nu1);

        }
        if (flag)
            res.append('1');
        res.reverse();
        return res.toString();
    }
    public static void main(String arg[]){//main--来自高金磊

        System.out.println(new Main().addStrings("11","99"));
    }
}
