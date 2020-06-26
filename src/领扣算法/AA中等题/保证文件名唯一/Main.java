/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.AA中等题.保证文件名唯一;

import java.util.HashMap;

public class Main {
    public String[] getFolderNames(String[] names) {
        HashMap<String,Integer> data=new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            data.put(names[i],data.getOrDefault(names[i],-1)+1);
            int count=data.get(names[i]);
            if (count>=1){
                while (true) {
                    String middle_name = names[i] + '(' + count + ')';
                    if (data.containsKey(middle_name))
                    {
                        count++;
                        continue;
                    }
                    else
                    {
                        data.put(names[i],count);
                        names[i]=middle_name;
                        data.put(names[i],data.getOrDefault(names[i],-1)+1);
                        break;
                    }
                }

            }
        }
        return names;
    }

//    public static void main(String arg[]){//main--来自高金磊
//
//        new Main().getFolderNames(new String[]{"onepiece","onepiece(2)","onepiece(2)","onepiece","onepiece"});
//    }
}
