/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.任务调度器;

import java.util.HashMap;

public class Main {
    int time=0,count;
    HashMap<Character,Integer> amount=new HashMap<>();
    HashMap<Character,Integer> t_flag=new HashMap<>();
    public int leastInterval(char[] tasks, int n) {
        n++;
        for (char task : tasks) {
            amount.put(task,amount.getOrDefault(task, 0)+1);
            t_flag.put(task, 0);
        }
        boolean ff;
        while (true){
            ff=true;

            for (Character character : t_flag.keySet()) {
                if (amount.getOrDefault(character,0)==0)
                {
                    amount.remove(character);
                    if (amount.size()==0)
                        return time;
                    continue;
                }
                if (time-(t_flag.get(character)==0?-n:t_flag.get(character))>=n){
                    ff=false;
                    t_flag.put(character, time);
                    time++;
                    amount.put(character, amount.get(character)-1);
                }
            }
            time+=ff?1:0;
        }
    }
    public static void main(String arg[]){//main--来自高金磊
    
        System.out.println(new Main().leastInterval(new char[]{'a','a','a','b','b','b'},2));
    }
}
