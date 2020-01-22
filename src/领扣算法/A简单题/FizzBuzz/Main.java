package 领扣算法.A简单题.FizzBuzz;

import java.util.LinkedList;
import java.util.List;

public class Main {
    LinkedList<String> result=new LinkedList<>();
    public List<String> fizzBuzz(int n) {
        for (int i = 1; i < n+1; i++) {
            if (i%3==0&&i%5==0)
                result.add("FizzBuzz");
            else if (i%3==0)
                result.add("Fizz");
            else if (i%5==0)
                result.add("Buzz");
            else
                result.add(""+i);
        }
        return result;
    }
}
