/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.检测大写字母;

public class Main {

    public boolean detectCapitalUse(String word) {
        return word.equals(word.toLowerCase())||word.equals(word.toUpperCase())||plus(word);
    }
    boolean plus(String word){
        char middle=word.charAt(0);
        word=word.substring(1);
        return (middle<'Z'&&middle>'A')&&(word.equals(word.toLowerCase())||word.equals(word.toUpperCase()));
    }
}
