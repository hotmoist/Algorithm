/*
 * Programmers coding test practice
 * stack / queue(level 2)
 * Problem name : 쇠막대기
 */
import java.util.*;

class Solution {
    public int solution(String arrangement) {
        Queue<Character> queue = new LinkedList<>();
        int answer = 0;
        int s = 0;


        for(int i = 0; i < arrangement.length(); i++){
            char c = arrangement.charAt(i);

            queue.add(c);
        }

        while(!queue.isEmpty()){
            char c = queue.remove();
            if( !queue.isEmpty()) {
                char temp = queue.peek();

                if (c == '(') {
                    s++;
                    if (temp == ')') {
                        s--;
                        answer += s;
                        queue.remove();
                    }
                }

                if (c == ')') {
                    s--;
                    answer += 1;
                }
            } else {
                if( c == ')'){
                    answer+= 1;
                }
            }

            }
        return  answer;


    }
}
