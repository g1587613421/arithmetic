/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛177;

import java.util.Calendar;
import java.util.Date;

public class first {
    public int daysBetweenDates(String date1, String date2) {
        Calendar  calendar=Calendar.getInstance() ,calendar1=Calendar.getInstance(),calendar2;

        String t1[]=date1.split("-");
        String t2[]=date2.split("-");

        calendar.set(Integer.valueOf(t1[0]),Integer.valueOf(t1[1]),Integer.valueOf(t1[2]));
        calendar1.set(Integer.valueOf(t2[0]),Integer.valueOf(t2[1]),Integer.valueOf(t2[2]));
        if (calendar.before(calendar1)){
            calendar2=calendar;
            calendar=calendar1;
            calendar1=calendar2;
        }
        return Math.abs((int) (Math.ceil((double)( calendar.getTime().getTime()-calendar1.getTime().getTime()))/(1000*3600*24)));
    }
    public static void main(String arg[]){//main--来自高金磊
        Date date = new Date();
        date.setYear(1998);
        date.setMonth(2);
        date.setDate(20);
        System.out.println(date.getTime());
    }
}
