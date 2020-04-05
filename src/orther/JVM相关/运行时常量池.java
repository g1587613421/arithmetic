/*
 * Copyright (c) 2020.版权所有高金磊
 */

package orther.JVM相关;

public class 运行时常量池 {
    
    public static void main(String arg[]){//main--来自高金磊
        String a="a";
        System.out.println(a=="a");
        String aa="a";
        System.out.println(a==aa);//aa和a都在运行常量池
        String aaa=new String("a");
        System.out.println(aaa==a);
        
        String ab="ab";
        String abs=a+"b";//abs=new StringBuild().append().append().toString();--ab在运行常量池中--abs在heap中
        System.out.println(ab==abs);

        
    }
}
