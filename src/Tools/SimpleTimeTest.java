/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package Tools;public class SimpleTimeTest<T> {
    //分段计算
    static long omm=0;
    static long mmm=0;
     private static void init(){
         omm=System.currentTimeMillis();
     }
     public SimpleTimeTest(){

    }
    /***
     * 测试类初始化的时间
     * @param o
     * @return
     * @throws Exception
     */
     public void TestInit(Object o){
         init();
         Class c=o.getClass();
         try {
             Object ob=c.newInstance();
         } catch (InstantiationException e) {
             System.err.println("默认的空构造函数不可用");
             e.printStackTrace();
         } catch (IllegalAccessException e) {
             System.err.println("构造函数权限不正确");
             e.printStackTrace();
         }

         recording(""+o.getClass().getName(),"初始化", "",omm, System.currentTimeMillis());

     }

     public static void TestMethod(){
         mmm=System.currentTimeMillis();
     }
     public static void endMethod(String description){
         recording("","",description, mmm, System.currentTimeMillis());
     }

    /**
     * 打印操作的时间信息
     * @param action 动作名称
     * @param log  记录的日志内容
     * @param description 对该操作的其他描述
     * @param end 结束时间,为了消除方法调用产生的时间差这个需要手动传入
     */
    private static void recording(String action,String log,String description,long start,long end){

         System.out.println(action+"    "+log+"     "+description+"    "+"\n开始时间:"+start+"\n结束时间:"+end+"\n用时"+(end-start));

    }

}
