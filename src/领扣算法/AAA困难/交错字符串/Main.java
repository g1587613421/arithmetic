/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AAA困难.交错字符串;

import Tools.SimpleTimeTest;

public class Main {


    int f1=0,f2=0,f3=0;
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length()+s2.length()!=s3.length())
            return false;

        return  plus(s1, s2, s3, 0, 0, 0);
    }
    char middle,ff1,ff2;
    boolean plus(String s1, String s2, String s3,int f1,int f2,int f3){
        if (f3>=s3.length())
            return true;
        middle=s3.charAt(f3);
        if (s1.length()>f1)
            ff1=s1.charAt(f1);
        if (s2.length()>f2)
            ff2=s2.charAt(f2);
        if (ff2==ff1&&ff2==middle)
            return plus(s1, s2,s3 , f1+1, f2, f3+1)||plus(s1, s2,s3 , f1, f2+1, f3+1);
        if (ff2==middle)
            return plus(s1, s2,s3 , f1, f2+1, f3+1);
        if (ff1==middle)
            return plus(s1, s2, s3, f1+1, f2, f3+1);
        return false;
    }

    public static void main(String arg[]){//main--来自高金磊

        SimpleTimeTest.TestMethod();
        new Main().isInterleave("bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa",
                "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab",
                "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab");
        SimpleTimeTest.endMethod("");
    }
}
