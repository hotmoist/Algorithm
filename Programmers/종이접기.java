/*
 * Programmers coding test practice
 * Summer/Winter(2019) (dynamic programming) (level 3)
 * Problem name : 종이접기
 */
 
 class Solution {
    public int[] solution(int n) {
        int size = (int)Math.pow(2, n) -1;
        int[] dp = new int[size];

        for(int k = 1; k <= n; k++) {
            for (int i = (int)Math.pow(2, k-1)-1 ; i < (int)Math.pow(2, k)-1; i++) {
                if (i + 1 == 1) {
                    dp[i] = 0;
                } else {
                    if (i + 1 == Math.pow(2, k - 1)) {
                        dp[i] = 0;
                    }
                    if (i + 1 > Math.pow(2, k - 1)) {
                        if (dp[(int) Math.pow(2, k) - 2 -  i] == 0) {
                            dp[i] = 1;
                        } else {
                            dp[i] = 0;
                        }
                    }
                }

            }
        }
        return dp;

    }
}
