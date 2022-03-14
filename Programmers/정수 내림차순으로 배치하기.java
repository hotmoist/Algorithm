/*
 * Programmers coding test practice
 * exercise question(level 1)
 * Problem name : 정수 내림차순으로 배치하기
 */
 
import java.util.*;

class Solution {
    public long solution(long n) {
       String s = n + "";
        long answer = 0;
        Integer[] arr = new Integer[s.length()];

        for(int i = 0; i < s.length(); i++ ){
            arr[i] = s.charAt(i) - '0';
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            answer += (Math.pow(10, i) * arr[i]);
        }

        return answer;
    }
}
