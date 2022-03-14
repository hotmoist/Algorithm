/*
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 예산
 */
 
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
      int answer = 0;
        long temp = 0;
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            if( i == 0 && d[i] <= budget){
                temp += d[i];
                answer++;
                continue;
            }

            temp += d[i];
            if(temp <= budget){
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
