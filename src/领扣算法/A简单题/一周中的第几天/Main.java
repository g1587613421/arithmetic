/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.一周中的第几天;

import java.time.LocalDate;
public class Main {

        public  String dayOfTheWeek (int day, int month, int year)
        {
            LocalDate localDate=LocalDate.of(year, month, day);
            int da = localDate.getDayOfWeek().getValue();
            return new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}[da%7];
        }

}
