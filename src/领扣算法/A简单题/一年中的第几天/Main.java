/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.A简单题.一年中的第几天;

import java.time.LocalDate;

public class Main {

    public int dayOfYear(String date) {
        LocalDate localDate=LocalDate.parse(date);
        return localDate.getDayOfYear();
    }
}
