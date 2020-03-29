/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛182;

import java.util.HashMap;

class UndergroundSystem {
    HashMap<Integer,Integer> user_time;
    HashMap<Integer,String> user_station;
    HashMap<String,int[]> station_size;
    public UndergroundSystem() {
        user_station=new HashMap<>();
        user_time=new HashMap<>();
        station_size=new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        user_time.put(id, t);
        user_station.put(id, stationName);
    }

    public void checkOut(int id, String stationName, int t) {
        String key=user_station.get(id)+stationName;
        int[] value=station_size.getOrDefault(key, new int[]{0,0});
        value[0]++;
        value[1]+=t-user_time.get(id);
        station_size.put(key, value);
    }

    public double getAverageTime(String startStation, String endStation) {
        int[] value = station_size.getOrDefault(startStation + endStation, new int[]{0, 0});
        int[] value2 = station_size.getOrDefault(endStation + startStation, new int[]{0, 0});
        return (double)(value[1]+value2[1])/(value[0]+value2[0]);
    }
    
    public static void main(String[] arg){//main--来自高金磊

        UndergroundSystem undergroundSystem = new UndergroundSystem();
        undergroundSystem.checkIn(45, "Leyton", 3);
        undergroundSystem.checkIn(32, "Paradise", 8);
        undergroundSystem.checkIn(27, "Leyton", 10);
        undergroundSystem.checkOut(45, "Waterloo", 15);
        undergroundSystem.checkOut(27, "Waterloo", 20);
        undergroundSystem.checkOut(32, "Cambridge", 22);
        undergroundSystem.getAverageTime("Paradise", "Cambridge");       // 返回 14.0。从 "Paradise"（时刻 8）到 "Cambridge"(时刻 22)的行程只有一趟
        undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 11.0。总共有 2 躺从 "Leyton" 到 "Waterloo" 的行程，编号为 id=45 的乘客出发于 time=3 到达于 time=15，编号为 id=27 的乘客出发于 time=10 到达于 time=20。所以平均时间为 ( (15-3) + (20-10) ) / 2 = 11.0
        undergroundSystem.checkIn(10, "Leyton", 24);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 11.0
        undergroundSystem.checkOut(10, "Waterloo", 38);
        undergroundSystem.getAverageTime("Leyton", "Waterloo");          // 返回 12.0
    }
}