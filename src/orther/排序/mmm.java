/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.排序;

import java.util.Scanner;

class BinarySearch {
    private int[]  data;

    public BinarySearch(int[] data){
        this.data = data;
    }

    public int search(Integer key){
        int low;
        int high;
        int mid;

        if(data == null)
            return -1;

        low = 0;
        high = data.length - 1;

        while(low <= high){
            mid = (low + high) / 2;

            if(key.compareTo(data[mid]) < 0){
                high = mid - 1;
            }else if(key.compareTo(data[mid]) > 0){
                low = mid + 1;
            }else if(key.compareTo(data[mid]) == 0){
                return mid;
            }
        }

        return -1;
    }

    private int doSearchRecursively(int low , int high , Integer key){
        int mid;
        int result;

        if(low <= high){
            mid = (low + high) / 2;
            result = key.compareTo(data[mid]);
            if(result < 0){
                return doSearchRecursively(low , mid - 1 , key);
            }else if(result > 0){
                return doSearchRecursively(mid + 1 , high , key);
            }else if(result == 0){
                return mid;
            }
        }

        return -1;
    }

    public int searchRecursively(Integer key){
        if(data ==null)return -1;

        return doSearchRecursively(0 , data.length - 1 , key);
    }

    public static void main(String[] args){
         Scanner scanner=new Scanner(System.in);
        int[] data=new int[scanner.nextInt()];
        for (int i = 0; i < data.length; i++) {
            data[i]=scanner.nextInt();
        }
        BinarySearch binSearch = new BinarySearch(data);
        System.out.println(binSearch.doSearchRecursively(0,data.length,data[data.length/2]));
        System.out.println(binSearch.search(data[data.length/2]));
        
    }
    
}