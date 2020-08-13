/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛201;

import java.util.LinkedList;

public class first {
    public String makeGood(String s) {
        char[] data=s.toCharArray();
        char middle='Z';
        LinkedList<Character> characters=new LinkedList<>();
        for (int i = 0; i < data.length; i++) {
            if (characters.isEmpty())
            {
                characters.addLast(data[i]);
                continue;
            }
            else if (Math.abs(data[i]-characters.peekLast())==27){
                characters.pollLast();
                continue;
            }
            characters.addLast(data[i]);
        }
        StringBuffer buffer=new StringBuffer();
        for (Character character : characters) {
            buffer.append(character);
        }
        return buffer.toString();
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println('a'-'A');
    }
}
