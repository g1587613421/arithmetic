/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.一周中的第几天;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public String dayOfTheWeek(int day, int month, int year) {
        String[] res=new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Date date=new Date(year,month,day);
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);

        return res[calendar.get(Calendar.DAY_OF_WEEK)];
    }
    public static String weekByDate (int year,int month,int day)
    {
        String str="";
        SimpleDateFormat fmt = new SimpleDateFormat("dd MM yyyy");

        Date d = null;
        try {
            d = fmt.parse(day+" "+month+" "+year);
        }catch (Exception e)      {
            e.printStackTrace();
    }

        Calendar cal = Calendar.getInstance();

        cal.setTime(d);

        int weekDay = cal.get(Calendar.DAY_OF_WEEK);

        switch(weekDay) {
            case 1 : str="SUNDAY"; break;
            case 2 : str="MONDAY"; break;
            case 3 : str="TUESDAY"; break;
            case 4 : str="WEDNESDAY"; break;
            case 5 : str="THURSDAY"; break;
            case 6 : str="FRIDAY"; break;
            case 7 : str="SATURDAY"; break;
            default: break;
        }

        return str;
    }
}
