package orther.设计模式.代理模式.动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class mallproxy {
    public Object doForProxy(Object object){
        /*
            三个参数：
                1. 类加载器：真实对象.getClass().getClassLoader()
                2. 接口数组：真实对象.getClass().getInterfaces()
                3. 处理器：new InvocationHandler()
         */
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new InvocationHandler() {

        /*
            1. proxy:代理对象
            2. method：代理对象的方法，被封装成为对象
            3. args:代理对象调用的方法时，传递的实际参数
        */

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //方法体增强
                if(method.getName().equals("salePhones")){
                    //参数增强
                    double money = (double) args[0];
                    money = money * 1.25;
                    System.out.println("参数增强,全国包邮");
                    String invoke = (String) method.invoke(object, money);
                    //返回值增强
                    return invoke+"+返回值增强+免费手机壳";
                }
                Object invoke = method.invoke(object, args);
                return invoke;
            }
        });
    }
}