/*
 * Programmers coding test practice
 * dynamic Programming (level 3)
 * Problem name : 타일 장식물
 */
 
 class Solution {
    public long solution(int N) {
          long[] dp = new long[N+1];
       
       for(int i = 0; i < dp.length; i++){
           if ( i <= 1){
               dp[i] = 1;
           } else {
               dp[i] = dp[i-1] + dp[i-2];
           }
       }
       
       long a = dp[N];
       long b = dp[N-1];
       
       return (2 * a) + (2 * b);
    }
}
