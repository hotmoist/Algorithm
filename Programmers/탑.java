import java.util.*;

/*
 * Programmers coding test practice
 * Using Stack/Queue (level2) 
 * Problem name : 탑
 */

class Solution {
        public int[] solution(int[] height){
            int[] answer = new int[height.length];
            Stack<Integer> s = new Stack<>();
            int count = 1;

            for(int i : height){
                s.push(i);
            }

            loop : while(!s.isEmpty()){
                int temp = s.pop();

                for(int i = height.length - count-1; i >= 0; i--){
                    if(temp < height[i]){
                        answer[height.length-count] = i+1;
                        count++;
                        continue loop;
                    }
                }

                count++;
            }



            return answer;
        }
    }
