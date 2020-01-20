package 领扣算法.AA中等题.字符串转换int;

public class Main {

    public int myAtoi(String str) {
        StringBuffer res=new StringBuffer();
        for (char c : str.toCharArray()) {
            if (c==' '&&res.toString().equals(""))
                continue;
            if (res.length()==0&&(c=='-'||c=='+'))
            {
                res.append(c);
                continue;
            }
            if ((c<='9'&&c>='0'))
                res.append(c);
            else
                break;
        }
        int r;
        try {
            r = Integer.valueOf(res.toString());
        } catch (NumberFormatException e) {
            if (res.length()==0||res.length()==1)
                return 0;
            r=res.charAt(0)=='-'?Integer.MIN_VALUE:Integer.MAX_VALUE;
        }
        return r;
    }
    public static void main(String arg[]){//main--来自高金磊

     System.out.println(new Main().myAtoi("  0000000000012345678"));
    }
}
