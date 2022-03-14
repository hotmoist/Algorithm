import java.util.*;
/*
 * Programmers coding test practice
 * exercise question(stringbuilder)(level 1)
 * Problem name : 가운데 글자 가져오기
 */

class Solution {
    public String solution(String s) {
      
        
        StringBuilder answer = new StringBuilder();

        int t = s.length()/2;
        
        if(s.length() % 2 == 0){
            answer.append(s.charAt(t-1));
            answer.append(s.charAt(t));
          
            
        } else {
            answer.append(s.charAt(t));
        }


        return answer + "";
        
      
    }
}
