/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.气球的最大数量;

import java.util.Arrays;

public class Main {

    public int maxNumberOfBalloons(String text) {
//        balloon
        int middle[]=new int[5];
        for (char c : text.toCharArray()) {
            switch (c){
                case 'a':{
                    middle[0]+=1;
                    break;
                }
                case 'b':
                    middle[1]+=1;
                    break;
                case 'n':
                    middle[2]+=1;
                    break;
                case 'l':
                    middle[3]+=1;
                    break;
                case 'o':
                    middle[4]+=1;
            }
        }
        middle[3]/=2;
        middle[4]/=2;
        Arrays.sort(middle);
        return middle[0];
    }
}
