package 比赛.力口.周赛138;

public class four {
    int sum=0;
    public int numWays(int steps, int arrLen) {
        left(steps-1, arrLen-1,-1);
        stop(steps-1, arrLen-1,0);
        right(steps-1, arrLen-1, 1);
        return sum;
    }
    public void left(int steps, int arrLen,int now)
    { if (steps==0&&now==0){
        sum++;
        return;
    }
        if (now<0||now>steps)
        return;

    left(steps-1, arrLen, now-1);
    stop(steps-1, arrLen, now);
    right(steps-1, arrLen, now+1);
    }
    public void stop(int steps, int arrLen,int now)
    {
        if (steps==0&&now==0){
            sum++;
            return;
        }
        if (now>steps)
            return;
        left(steps-1, arrLen, now-1);
        stop(steps-1, arrLen, now);
        right(steps-1, arrLen, now+1);

    }
    public void right(int steps, int arrLen,int now)
    {
        if (steps==0&&now==0){
            sum++;
            return;
        }
        if (now>arrLen||now>steps)
            return;
        left(steps-1, arrLen, now-1);
        stop(steps-1, arrLen, now);
        right(steps-1, arrLen, now+1);

    }
}
