package orther.设计模式.工厂模式和单例模式.工厂模式中的单例模式;

import java.lang.reflect.InvocationTargetException;

public class test {
    public static void main(String arg[]) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {//main--来自高金磊
     Factory.createHuman().getID();
     Factory.createHuman().getID();
     Factory.createHuman().getID();
     Factory.createHuman().getID();


    }
}
