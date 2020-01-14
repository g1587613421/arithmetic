package orther.设计模式.观察者模式.线程解决;

/**
 * 观察者类
 */
public class Subject {
   public static boolean state=false;
   public void changeS(){
       new Thread(){
           @Override
           public void run() {
               while (true){
               state=!state;
               try {
                   sleep(8000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }}
       }.start();
   }

}
