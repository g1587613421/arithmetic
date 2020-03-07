/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛21;

public class second {

    public int findTheLongestSubstring(String s) {
        if (s.length()==1){
            return "aeiou".contains(s)?0:1;
        }
        int[] as=new int[s.length()+1],es=new int[s.length()+1],is=new int[s.length()+1],os=new int[s.length()+1],us=new int[s.length()+1];
        as[0]=es[0]=is[0]=us[0]=os[0]=0;
        char[] data=s.toCharArray();
         for (int i = 1; i < s.length()+1; i++) {

            as[i]=as[i-1];
            es[i]=es[i-1];
            is[i]=is[i-1];
            os[i]=os[i-1];
            us[i]=us[i-1];
            switch (data[i-1]){
                case 'a':
                    as[i]++;
                    break;
                case 'e':
                    es[i]++;
                    break;
                case 'i':
                    is[i]++;
                    break;
                case 'o':
                    os[i]++;
                    break;
                case 'u':us[i]++;
            }

        }
        int max=0;
        for (int i = 0; i <data.length ; i++) {

            for (int j = data.length-1; j>i; j--) {
                if (j-i<max)
                    break;
                if ((as[j+1]-as[i])%2==0&&(es[j+1]-es[i])%2==0&&(is[j+1]-is[i])%2==0&&(os[j+1]-os[i])%2==0&&(us[j+1]-us[i])%2==0){
                    max=j-i;
                }
            }

        }

        return max+1;
    }
}
