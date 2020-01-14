package orther.设计模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class 临时修改访问权限 {
    public static void main(String arg[]) throws ClassNotFoundException {//main--来自高金磊
//     Test test=new Test();//无法访问
        Class c=Class.forName(Test.class.getName());
        try {
            System.out.println(c.newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
           System.err.println("这个时候是访问不了的");
        }
        Constructor constructor;
        try {
            //获取无参构造器
            constructor = c.getDeclaredConstructor();
            //允许访问构造器
            constructor.setAccessible(true);
            //通过构造器创建对象
            System.out.println(constructor.newInstance());
        } catch (NoSuchMethodException e) {
            System.err.println("获取构造器失败");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }


}
class Test{
    /**
     * 屏蔽构造函数
     */
    private Test(){

    }
}