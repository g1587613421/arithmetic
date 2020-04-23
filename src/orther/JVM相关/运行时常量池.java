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
        String abss="a"+"b";//将会去寻找"ab"是不是在常量表里面StringTable
        System.out.println(ab==abs);
        System.out.println(ab==abss);
        
        String ss=new String("1215")+new String("4546");
        ss.intern();//将堆中的字符串对象放入常量栈中
        String sm="12154546";
        System.out.println(sm==ss);
        System.out.print(ss=="12154546");

    }
}
