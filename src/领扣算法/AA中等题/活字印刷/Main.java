/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.活字印刷;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    HashSet<String> man=new HashSet<>();
    ArrayList<Character> data=new ArrayList<>(),middle;
    public int numTilePossibilities(String tiles) {
        for (char c : tiles.toCharArray()) {
            data.add(c);
        }
        String mm;
        for (Character datum : data) {
            mm=""+datum;
            if (!man.contains(mm))
            {
                man.add(mm);
                middle=new ArrayList<>(data);
                middle.remove(datum);
                plus(middle, mm);
            }
        }

        return man.size();
    }
    private void plus(ArrayList<Character> da,String res){
        String ss;
        for (Character character : da) {
            ss=res+character;
            if (!man.contains(ss))
            {
                man.add(ss);
                middle=new ArrayList<>(da);
                middle.remove(character);
                plus(middle, ss);
            }
        }
    }
}
