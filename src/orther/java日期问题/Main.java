/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.java日期问题;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Main {
    /**
     * 计算date2与date1之间相差多少--没有误差(使用localDate)
     * @param date1 yyyy-mm-dd
     * @param date2
     * @return 日期差
     */
    public int daysBetweenDates(String date1, String date2) {
        LocalDate localDate=LocalDate.parse(date1);
        LocalDate localDate1=LocalDate.parse(date2);
        return (int)Math.abs( ChronoUnit.DAYS.between(localDate, localDate1));
    }
    //有误差
    public int daysBetweenDatesFromCandle(String date1, String date2) {
        int da[]=new int[3];
        int da1[]=new int[3];
        String[] ds= date1.split("-");
        String[] ds1=date2.split("-");
        for (int i = 0; i < ds.length; i++) {
            da[i]=Integer.valueOf(ds[i]);
            da1[i]=Integer.valueOf(ds1[i]);
        }
        Date dat=new Date(da[0],da[1],da[2]);
        Date dat1=new Date(da1[0],da1[1],da1[2]);
        
        return (int)( Math.abs(dat.getTime()-dat1.getTime())/(1000*60*60*24));
    }

    /**
     * 通过日期(yyyy-mm--dd)是星期几
     * @param year
     * @param month
     * @param day
     * @return
     */
    public  String dayOfTheWeek (int year,int month,int day)
    {
        LocalDate localDate=LocalDate.of(year, month, day);
       int da = localDate.getDayOfWeek().getValue();
       System.out.println(localDate.getDayOfWeek());//直接输出星期几(全大写)
        return new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}[da%7];
    }
    
    public static void main(String arg[]){//main--来自高金磊
    
        Main main=new Main();
        System.out.println(main.daysBetweenDates("1971-06-29","2010-09-24"));
        System.out.println("下面的没有误差");
        System.out.println(main.daysBetweenDatesFromCandle("1971-06-29","2010-09-24"));
    
    }
}
