/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.双周赛20;

public class third {
    public int numberOfSubstrings(String s) {
        String middle;
        int result=0;
        for (int i = 0; i < s.length(); i++) {
            middle=""+s.charAt(i);
            for (int j = i+1; j < s.length(); j++) {
               middle+=s.charAt(j);
               if (middle.contains("a")&&middle.contains("b"))
               {
                   if (s.indexOf("c",j)!=-1){
                       result+=s.length()-s.indexOf("c",j);
                   }

               }else
                if (middle.contains("c")&&middle.contains("b"))
                {
                    if (s.indexOf("a",j)!=-1)
                    result+=s.length()-s.indexOf("a",j);
                }
                else
                if (middle.contains("a")&&middle.contains("c"))
                {
                    if (s.indexOf("c",j)!=-1)
                    result+=s.length()-s.indexOf("b",j);
                }
                else continue;

                middle=middle.substring(1);

            }

        }
        return result;
    }
    
    
    
    public static void main(String arg[]){//main--来自高金磊
    
        new third().numberOfSubstrings("abcabc");
    }
}
