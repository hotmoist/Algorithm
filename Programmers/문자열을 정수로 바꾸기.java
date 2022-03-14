/*
 * Programmers coding test practice
 * exercise question( String )(level 1)
 * Problem name : 문자열을 정수로 바꾸기 
 */
 
 class Solution {
    public int solution(String s) {
        int answer;
        String temp;
        if(s.charAt(0) == '-'){
            temp = s.substring(1);
            answer = Integer.parseInt(temp);
            answer *= -1;

            return answer;
        }else
        {
            return Integer.parseInt(s);
        }
    }
}
