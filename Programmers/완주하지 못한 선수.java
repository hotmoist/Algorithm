import java.util.*;

/*
 * Programmers coding test practice
 * Exercise question : Hash (level 1)
 * Problem name : 완주하지 못한 선수
 */

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
       HashMap<String, Integer> m = new HashMap<>();
      
      for(String s : participant){
          if(m.containsKey(s)){
              m.replace(s, m.get(s)+1);
              continue;
          }
          
          m.put(s, 1);
      }
      
      for(String s: completion){
          if(m.get(s) > 0){
              m.replace(s, m.get(s)-1);
          }
      }
      
      for(String s : participant){
          if(m.get(s) > 0){
              answer = s;
              break;
          }
      }
     
        
        return answer;
    }
}
