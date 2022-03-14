/*
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 콜라츠 추측
 */

class Solution {
    public int solution(int num) {
        int answer  = 0;           
        long t = num;              
                                   
        while( t != 1){            
             if(answer > 500){     
                 answer  = -1;     
                 break;            
             }                     
                                   
            if (t % 2 == 0){       
                t /= 2;            
            } else {               
                t = t*3 + 1;       
            }                      
            answer++;              
                                   
        }                          
                                   
        return answer;                    
    }
}
