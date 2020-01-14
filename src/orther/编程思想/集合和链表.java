package orther.编程思想;

import java.util.*;

public class 集合和链表 {
    public static void main(String arg[]){//main--来自高金磊
     //List有序,可以重复
        ArrayList<Integer> arrayList=new ArrayList<>();
        Vector<Integer> vector=new Vector<>();
        LinkedList linkedList=new LinkedList();

        HashSet<Integer> hashSet=new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet=new LinkedHashSet<>();
        TreeSet<Integer> treeSet=new TreeSet<>();

        int data[]=new int[]{1,4,32,5,2,4,5,4};

        for (int datum : data) {
            arrayList.add(datum);
            vector.add(datum);
            {
                //两个
                linkedList.push(datum);
//               System.out.println(linkedList.add(datum));
            }

            hashSet.add(datum);
            linkedHashSet.add(datum);
            treeSet.add(datum);
        }
        System.out.println();
        System.out.println("arraylist");
        for (Integer da : arrayList) {
            System.out.print(da);
        }
        System.out.println();
        System.out.println("vector");
        for (Integer da : vector) {
            System.out.print(da);
        }
        System.out.println();
        System.out.println("linkedList");
        for (Object o : linkedList) {
            System.out.print((int)o);

        }

    }
}
