package 领扣算法.加一;

public class Main {
    public int[] plusOne(int[] digits) {
        int middle[]=new int[digits.length+1];
        int n =digits.length-1;
        for (; n >=0; n--) {
            digits[n]+=1;
            if (digits[n]<10)
                return digits;
            else {
                digits[n]=0;
                if (n==0){

                    middle[0]=1;
                    for (int i = 0; i < digits.length; i++) {
                        middle[i+1]=digits[i];
                    }
                    digits=middle;
                }
            }
        }
          return digits;
    }

}
