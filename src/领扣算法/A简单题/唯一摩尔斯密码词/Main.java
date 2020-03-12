/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.唯一摩尔斯密码词;

import java.util.HashMap;

public class Main {

    public int uniqueMorseRepresentations(String[] words) {
        String[] data=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String,Integer> res=new HashMap<>();
        for (String word : words) {
            StringBuffer stringBuffer=new StringBuffer();
            for (char re : word.toCharArray()) {
                stringBuffer.append(data[re-'a']);
            }
            res.put(stringBuffer.toString(), res.getOrDefault(stringBuffer.toString(), 0)+1);
        }
        return res.size();
    }
    
    
    public static void main(String[] arg){//main--来自高金磊
    
        new Main().uniqueMorseRepresentations(new String[]{"za"});
    }
}
