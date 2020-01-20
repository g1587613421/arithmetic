package 领扣算法.AA中等题.third;

//给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
//
//        示例 1：
//
//        输入: "babad"
//        输出: "bab"
//        注意: "aba" 也是一个有效答案。
//        示例 2：
//
//        输入: "cbbd"
//        输出: "bb"


//java 先建立一个二维数组dp,令dp[i][j]表示s[i...j] = 1是回文字符串,用其等于0则表示不是回文子串
//
//        当然我这里这样遇到了内存问题,貌似是数组开太大了的yuanyin,所有这里最好用boolean类型的
//
//        二维数组,那么由 上面的定义就可以知道,如果s.charAt(i)==s.charAt(j)并且dp[i+1][j-1]里面是true,则
//
//        dp[i][j]也为true,之后就可以开始做了
//
//        先将数组初始化,即相邻两个相同的字母组成的子串和单个的字母都是回文串
//
//        所以dp[i][i]为true,dp[i][i+1]也为true
//
//        之后再从最长回文子串为3开始筛选,如果长度比已知的最长回文子串长,那么就更新最长回文子串,ok思想就是这样
class Solution {
    public String longestPalindrome(String s) {
        if (s.length()<=1)
            return s;
        String longest = s.charAt(0)+"";
        int length = s.length();
        boolean[][] dp = new boolean[length][length];
        for(int j = length-1;j>=0;j--){
            //j在前,i在后
            for(int i = j;i<length;i++){
                dp[j][i] = s.charAt(i)==s.charAt(j)&&((i-j<3)||dp[j+1][i-1]);
                if(dp[j][i]&&i-j+1>longest.length()){
                    longest = s.substring(j,i+1);
                }
            }
        }
        return longest;

    }
}