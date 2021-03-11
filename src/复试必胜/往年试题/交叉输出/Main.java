/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 复试必胜.往年试题.交叉输出;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String arg[]){//main--来自高金磊
//         Scanner scanner=new Scanner(System.in);
         int[] data=new int[]{1,67,45,8,9,44,3,77,5,1,444,88,66};
        LinkedList<Integer> num1=new LinkedList<>(),num2=new LinkedList<>();
        for (int i = 0; i < data.length; i++) {
            if (data[i]%2==1)
            {
                num1.addLast(data[i]);
            }
            else num2.addLast(data[i]);
        }
        Collections.sort(num1);
        Collections.sort(num2, (a,b)->(b-a));
        while (!num1.isEmpty()||!num2.isEmpty()){
            if (!num1.isEmpty())
                System.out.println(num1.pollFirst());
            if (!num2.isEmpty())
                System.out.println(num2.pollFirst());
        }
    }
}
