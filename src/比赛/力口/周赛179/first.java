/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛179;

public class first {
    public String generateTheString(int n) {
        StringBuffer stringBuffer=new StringBuffer();
        if (n%2==0){
            stringBuffer.append('a');
            n--;
        }
        for (int i = 0; i < n; i++) {
            stringBuffer.append('b');
        }
        return stringBuffer.toString();
    }
}
