/*
 * Programmers coding test practice
 * exercise question( string )(level 1)
 * Problem name : 문자열 내림차순으로 배치하기
 */
 
import java.util.*;

class Solution {
    public String solution(String s) {
          String answer = "";                   
char[] strrArr = new char[s.length()];    
                                          
    for(int i = 0; i < s.length(); i++){  
    strrArr[i] = s.charAt(i);             
}                                         
                                          
    Arrays.sort(strrArr);                 
                                          
    for( char i : strrArr){               
    answer = i + answer;                  
}                                         
                                          
                                          
    return  answer;                       
    }
}
