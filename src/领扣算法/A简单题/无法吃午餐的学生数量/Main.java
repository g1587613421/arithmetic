/*
 * Copyright (c) 2021.版权所有高金磊
 */

package 领扣算法.A简单题.无法吃午餐的学生数量;

import java.util.Arrays;

public class Main {

    public int countStudents(int[] students, int[] sandwiches) {
        //找到学生吃的最少的那个,如果数量与三明治一样就正确
        int stu1= Arrays.stream(students).sum();
        int san1= Arrays.stream(sandwiches).sum();
        if (san1==stu1)
            return 0;
        int stu0=students.length-stu1;
        for (int i = 0; i < sandwiches.length; i++) {
           switch (sandwiches[i]){
               case 0:
                   if (stu0--==0)
                       return students.length-i;
                   break;
               case 1:
                   if (stu1--==0)
                       return students.length-i;
                   break;
           }

        }
        return 0;
    }
    public static void main(String arg[]){//main--来自高金磊

        new Main().countStudents(new int[]{1,1,1,0,0,1},new int[]{1,0,0,0,1,1});
    }
}
