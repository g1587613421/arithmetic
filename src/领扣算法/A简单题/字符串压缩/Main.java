/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.字符串压缩;

public class Main {

    public String compressString(String S) {
        int count=0;
        char per='z'+1;
        StringBuffer res=new StringBuffer();
        for (char c : S.toCharArray()) {
            if (per==c)
                count++;
            else {
                if (count!=0) {
                    res.append(per).append(count);
                    count=1;
                }
                else count++;
                per=c;
            }

        }
        res.append(per).append(count);

        return res.length()<S.length()?res.toString():S;
    }
}
