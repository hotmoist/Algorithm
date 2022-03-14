/*
 * Programmers coding test practice
 * exercise question(used queue)(level 1)
 * Problem name : 같은 숫자는 싫어
 */



import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < arr.length; i++){
            if( i == 0){
                q.add(arr[i]);
            }

            if( i > 0 && arr[i-1] != arr[i]){
                q.add(arr[i]);
            }
        }

        answer = new int[q.size()];

        int i = 0;

        while(!q.isEmpty()){
            answer[i] = q.remove();
            i++;
        }

        return answer;
    }
}
