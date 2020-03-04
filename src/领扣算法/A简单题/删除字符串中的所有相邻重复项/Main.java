/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.删除字符串中的所有相邻重复项;

public class Main {

    public String removeDuplicates(String S) {
        String mm=S;
        StringBuffer data=new StringBuffer(S);
        char middle;

        boolean flag=true;
        while (flag){
            flag=false;
            middle = 'z'+1;
        for (int i = 0; i < mm.length(); i++) {
            if (middle==mm.charAt(i)){
                data.delete(i-1-(mm.length()-data.length()), i+1-(mm.length()-data.length()));
                middle='z'+1;
                flag=true;
            }
            else middle=mm.charAt(i);
        }
        mm=data.toString();

    }
        return mm;
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        new Main().removeDuplicates("aaaaaaaa");
    }

}
