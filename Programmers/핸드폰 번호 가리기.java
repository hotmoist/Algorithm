/*
 * Programmers coding test practice
 * exercise question(String)(level 1)
 * Problem name : 핸드폰 번호 가리기 
 */

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        for(int i = 0; i < phone_number.length(); i++){
            if( i < phone_number.length()- 4){
                answer += "*";
            } else {
                answer += phone_number.charAt(i) + "";
            }
        }
        
        return answer;
    }
}
