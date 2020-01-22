package 领扣算法.A简单题.FizzBuzz;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<String> result=new LinkedList<>();
    StringBuffer middle= new StringBuffer();
    int i;
    public List<String> fizzBuzz(int n) {


        for (i = 1; i < n+1; i++) {
            middle.delete(0, middle.length());
           if (i%3==0)
               middle.append("Fizz");
           if (i%5==0)
               middle.append("Buzz");
           if (middle.length()==0)
               middle.append(i);
           result.add(middle.toString());
        }
        return result;
    }
}
