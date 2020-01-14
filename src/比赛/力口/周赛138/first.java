package 比赛.力口.周赛138;

public class first {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum=0;
        for (int i = 1; i < points.length; i++) {
            sum+=Math.max(Math.abs(points[i][0]-points[i-1][0]), Math.abs(points[i][1]-points[i-1][1]));
        }
        return sum;
    }
}
