/*
 * Programmers coding test practice
 * exercise question(String)(level 1)
 * Problem name : 문자열 다루기 기본
 */

class Solution {
    public boolean solution(String s) {
       boolean answer = true;
        
        if( s.length() != 4 && s.length() != 6){
            return false;
        }
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!( '0' <= c && c <= '9')){
                answer = false;
                break;
            }
        }

        return answer;
    }
}
