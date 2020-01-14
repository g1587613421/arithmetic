package 比赛.全国大学生程序设计大赛.区域赛;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class five {
    public static void main(String arg[]){//main--来自高金磊
        Map<String,Double> data=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        int su=scanner.nextInt();
        for (int i = 0; i < su; i++) {
            String name=scanner.next();
            int num=scanner.nextInt();
            double d=num*scanner.nextDouble();
            if (!data.containsKey(name))
                data.put(name, d);
            else 
                data.put(name, d+data.get(name));
        }
        data=sortMapByValues(data);
        for (String s : data.keySet()) {
            System.out.println(s+" "+data.get(s));
        }
    }

    public static <K extends Comparable, V extends Comparable> Map<K, V> sortMapByValues(Map<K, V> aMap) {
        HashMap<K, V> finalOut = new LinkedHashMap<>();
        aMap.entrySet()
                .stream()
                .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                .collect(Collectors.toList()).forEach(ele -> finalOut.put(ele.getKey(), ele.getValue()));
        return finalOut;
    }
}
