/*
 * Programmers coding test practice
 * exercise question(character compare)(level 1)
 * Problem name : 문자열 내 p와y의 개수
 */


class Solution {
    boolean solution(String s) {
       int p = 0;
        int y = 0;

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            
            if(c == 'p' || c =='P'){
                p++;
            }
            
            if(c == 'y' || c == 'Y'){
                y++;
            }
        }
        
        if( p == y){
            return true;
        } else {
            return false;
        }

        
 
    }
}
