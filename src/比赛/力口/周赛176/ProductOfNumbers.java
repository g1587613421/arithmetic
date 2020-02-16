/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 比赛.力口.周赛176;

import java.util.LinkedList;

public class ProductOfNumbers {
    LinkedList<Integer> data;
    LinkedList<Integer> middle;
    public ProductOfNumbers() {
        data=new LinkedList<>();
        middle=new LinkedList<>();
    }

    public void add(int num) {
        data.addFirst(num);
    }

    public int getProduct(int k) {
        if (k==0)
            return 1;
       return data.get(k-1)*getProduct(k-1);
    }
    
    
    
    public static void main(String arg[]) {//main--来自高金磊

        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        productOfNumbers.getProduct(2); // 返回 20 。最后 2 个数字的乘积是 5 * 4 = 20
        productOfNumbers.getProduct(3); // 返回 40 。最后 3 个数字的乘积是 2 * 5 * 4 = 40
        productOfNumbers.getProduct(4); // 返回  0 。最后 4 个数字的乘积是 0 * 2 * 5 * 4 = 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        productOfNumbers.getProduct(2); // 返回 32 。最后 2 个数字的乘积是 4 * 8 = 32
        System.out.println(productOfNumbers.getProduct(2));
    }
}
