import java.util.*;
/*
 * Programmers coding test practice
 * exercise question(math)(level 2)
 * Problem name : 124나라의 숫자
 */

class Solution {
    public String solution(int n) {
         Stack<Integer> s = new Stack<>();
        StringBuilder answer = new StringBuilder();
        int t = n;
        int r = 0;

       while(t != 0){
            r = t % 3;
            t = t / 3;

            if( r == 0){
                t -= 1;
                s.push(4);
                continue;
            }
            s.push(r);
        }
        
         while(!s.empty()){
            answer.append(s.pop());
        }

        return answer+"";
    }
}
