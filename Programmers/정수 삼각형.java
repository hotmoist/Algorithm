/*
 * Programmers coding test practice
 * exercise question(dynamic programming)(level 3)
 * Problem name : 정수 삼각형
 */
 
 
import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int[][] dp = new int[triangle.length][triangle[triangle.length-1].length];

        for(int i = 0; i < triangle.length; i++){
            for(int j = 0; j < triangle[i].length; j++){
                dp[i][j] = triangle[i][j];
            }
        }

      

        for(int i = 1; i < triangle.length; i++ ){
            for(int j = 0; j < triangle[i].length; j++){
                if( j == 0){
                    dp[i][j] += dp[i-1][j];
                } else {
                    dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]);
                }
            }
        }

        Arrays.sort(dp[triangle.length-1]);

        
        return dp[triangle.length-1][triangle[triangle.length-1].length-1];
    }
}
