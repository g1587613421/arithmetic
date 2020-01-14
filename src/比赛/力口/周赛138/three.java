package 比赛.力口.周赛138;

import java.util.ArrayList;
import java.util.List;

public class three {
    List<List<String>> result=new ArrayList<>();
    List<String> re;
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        String key="";
        arraySort(products);
        for (char c : searchWord.toCharArray()) {
            key+=c;
            re=new ArrayList<>();
            for (String product : products) {
                if (re.size()>=3)
                    break;
                if (product.indexOf(key)==0)
                    re.add(product);
            }
            result.add(re);
        }

        return result;
    }
    public  String[] arraySort(String[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j].compareTo(input[j + 1]) > 0) {
                    String temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;

    }
}
