package 领扣算法.周赛157;

public class one {

    public int minCostToMoveChips(int[] chips) {
        int or=0;
        for (int chip : chips) {
            if (chip%2==0){
                or++;
            }
        }

        return Math.min(or, chips.length-or);
    }
}
