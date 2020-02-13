/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.词典中最长的单词;

import java.util.Arrays;

public class Main {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String middle="";
        String max="";
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(middle)==1){
                middle=words[i];
                if (middle.length()>max.length())
                    max=middle;
            }
            else {

                middle=words[i];
            }

        }
        return max;
    }
}
