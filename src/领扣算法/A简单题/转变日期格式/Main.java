/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.转变日期格式;

public class Main {
    public String reformatDate(String date) {
        String data[]=date.split(" ");
        return data[2]+"-"+getMonth(data[1])+"-"+getDay(data[0]);
    }
    String getDay(String day){
        day=day.substring(0,day.length()-2);
        return day.length()<2?"0"+day:day;
    }
    String getMonth(String month)
    {
        String[] middle=new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < middle.length; i++) {
            if (middle[i].equals(month))
                return i<9?"0"+(i+1):String.valueOf(i+1);
        }
        return "";
    }
}
