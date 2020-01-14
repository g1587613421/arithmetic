package 领扣算法.AA简单题.丑数;

public class Main {
//    public boolean isUgly(int num) {
//        if (num==0)
//            return false;
//        if (num==1)
//            return true;
//        if (num%2==0){
//            num/=2;
//        }else if (num%3==0){
//            num/=3;
//        }else if (num%5==0){
//            num/=5;
//        }
//        else return false;
//        return isUgly(num);
//    }

    public boolean isUgly(int num) {
     if (num==0)
         return false;
     if (num==1)
         return true;
        do {
            if (num==1)
                return true;
            if (num%2==0){
                num/=2;
            }else
            if (num%3==0){
                num/=3;
             }else
            if (num%5==0){
                 num/=5;
              }else
                  return false;
//         num=num%2==0?num/2:num;
//         num=num%3==0?num/3:num;
//         num=num%5==0?num/5:num;
     }while (true);
    }

}
