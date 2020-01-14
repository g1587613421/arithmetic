package 领扣算法.实现strStr;

public class Main {

    public int strStr(String haystack, String needle) {
        char[] ne=needle.toCharArray();
        if (ne.length==0)
            return 0;
        boolean b;
        int i;
        char[] hy=haystack.toCharArray();
        for (int n = 0; n < hy.length-ne.length+1; n++) {
            if (ne[0]==hy[n]){
                b=true;
                for ( i = 1; i < ne.length; i++) {
                    if (hy[n+i]!=ne[i])
                    {
                        b=false;
                        break;
                    }

                }
                if (b) return n;
            }


        }
        return -1;
    }
    public static void main(String arg[]){//main--来自高金磊

     new Main().strStr("hello", "ll");
    }
}
