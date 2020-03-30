/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.快手笔试;

import java.util.Scanner;

    public class second {

        public static void main(String[] arg){//main--来自高金磊
            Scanner scanner=new Scanner(System.in);
            String[] strings=scanner.nextLine().split(" ");
            int[] data = new int[strings.length];
            StringBuffer res=new StringBuffer();
            for (int i = 0; i < data.length; i++) {
                data[i]=Integer.valueOf(strings[i]);
            }
            if (strings.length<=2){
                System.out.println("-1");
                return;
            }
            int max1=Math.max(data[0],data[1]),cm1=1;
            int max2=data[1]+data[0]-max1;
            for (int i = 2; i < data.length; i++) {
                if (max1!=max2&&data[i]<max1&&cm1==1){
                    res.append(i).append(" ");
                    max2=data[i];
                    continue;
                }
                if (max1==max2)
                    cm1++;
                if (data[i]==max1){
                    cm1++;
                    continue;
                }
                if (data[i]>=max2&&data[i]<max1){
                    if (cm1==1)
                    res.append(i).append(" ");
                    max2=data[i];
                }
                else {
                    if (data[i]>max1){
                        max2=max1;
                        cm1=1;
                        max1=data[i];
                    }
                    else if (data[i]>max2&&data[i]!=max1){
                        max2=data[i];
                    }
                }

            }
            System.out.println(res.length()==0?"-1":res.toString());

        }


}
