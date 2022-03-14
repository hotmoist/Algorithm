/*
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 자릿수 더하기
 */
 
 public class Solution {
    public int solution(int n) {
       String s = n+ "";
       int answer = 0;
       
       for(int i = 0; i < s.length(); i++){
           answer += s.charAt(i) - '0';
       }
       
       return  answer;
    }
}
