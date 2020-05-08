/*
 * Copyright (c) 2020.版权所有高金磊
 */

package 领扣算法.探索.猜数字大小;

public abstract class Main implements g {
    public int guessNumber(int n) {
        int pre=0;
        int middle=0;
        if (guess(1)==0)
            return 1;
        if (guess(n)==0)
            return n;
        while (pre<=n){
            middle = (pre/2+n/2)+1;
            switch (guess(middle))
            {
                case 1:
                    pre=middle+1;
                    break;
                case -1:
                    n=middle-1;
                    break;
                case 0:
                    return middle;
            }
        }
        return middle;
    }


}
interface g{
    int guess(int num);
}