/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.单词的压缩编码;

import java.util.Arrays;

public class Main {

    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words,(a,b)->(b.length()-a.length()));
        StringBuilder middle=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (middle.indexOf(words[i]+"#")!=-1)
                continue;
            middle.append(words[i]).append("#");
        }
        return middle.length();
    }
}
