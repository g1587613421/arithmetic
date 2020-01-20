package 领扣算法.AA中等题.单词接龙;

import java.util.ArrayList;
import java.util.List;

public class Main {
    char[] begin;
    int count=0;
    int middle ,middle2;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord.equals(endWord))
            return count;
        wordList.remove(beginWord);
        begin=beginWord.toCharArray();
        //每次在wordlist中找到一个单词与beginWord只差一个字符
        for (String s : wordList) {
            middle=0;
            middle2=0;
            for (char c : s.toCharArray()) {
                if (begin[middle2++]==c)
                    middle++;
            }
            if (middle==middle2-1)
            {
                count++;
                return ladderLength(s, endWord, wordList);
            }
        }
        return 0;
    }

    public static void main(String arg[]){//main--来自高金磊
        List<String> test=new ArrayList<>();
        test.add("hot");
        test.add("dot");
        test.add("lot");
        test.add("log");
        test.add("cog");
     System.out.println(new Main().ladderLength("hit", "cog",test));

    }
}
