/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.检查单词是否为句中其他单词的前缀;

public class Main {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String data[]=sentence.split(" ");
        for (int i = 0; i < data.length; i++) {
            if (data[i].startsWith(searchWord)){
                return i+1;
            }

        }
        return -1;
    }
}
