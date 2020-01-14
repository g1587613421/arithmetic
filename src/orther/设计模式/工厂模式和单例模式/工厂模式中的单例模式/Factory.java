package orther.设计模式.工厂模式和单例模式.工厂模式中的单例模式;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Factory {
    static Human human;
    public static Human createHuman() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        if (human==null)
        {
            Class c=Class.forName(Human.class.getName());
            Constructor<Human> constructor=c.getDeclaredConstructor();
            constructor.setAccessible(true);
            human=constructor.newInstance();
        }
        return human;
    }
}
