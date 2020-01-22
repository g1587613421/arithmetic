package 领扣算法.AA中等题.求解方程;

public class Main {
    public String solveEquation(String equation) {
        equation+="=";
        int x=0;//x的系数
        int num=0;
        int flag=1;
        int symbol=1;

        String middle="";
        char c;
        for (int i = 0; i < equation.length(); i++) {
            c=equation.charAt(i);
            if (c>='0'&&c<='9')
                middle+=c;
            else
                if (c=='x'){
                    x+=symbol*flag*(middle.equals("")?1:Integer.valueOf(middle));
                    middle="";
                }
                else if (c=='-'){
                    num-=flag*symbol*Integer.valueOf(middle.equals("")?"0":middle);
                    symbol=-1;
                    middle="";
                }else if (c=='+'){
                    num-=flag*symbol*Integer.valueOf(middle.equals("")?"0":middle);
                    middle="";
                    symbol=1;
                }
                else if (c=='='){
                    num-=flag*symbol*Integer.valueOf(middle.equals("")?"0":middle);
                    middle="";
                    symbol=1;
                    flag=-1;
                }
        }
        if (x==0)
        {
            if (num==0)
                return "Infinite solutions";
            else
                return "No solution";
        }

        return "x="+num/x;
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().solveEquation("2x+3x-6x=x+2"));
    }
}
