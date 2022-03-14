import java.util.*;

/*
 * Programmers coding test practice
 * 2019 KaKao developer winter internship Problem (level 1) 
 * question name : 크레인 인형뽑기 게임 
 */

class Solution {
    public int solution(int[][] board, int[] moves) {
       
     Stack<Integer> stack = new Stack<>();
     int answer = 0;
     
     for(int m = 0; m < moves.length; m++){
         for(int i = 0; i < board.length; i++){
             if(board[i][moves[m]-1] != 0){
                 if(!stack.empty() && stack.peek() == board[i][moves[m]-1]){
                    stack.pop();
                    board[i][moves[m]-1] = 0;
                    answer += 2;
                    break;
                 }
                 
                 stack.push(board[i][moves[m]-1]);
                 board[i][moves[m]-1] = 0;
                 break;
             }
         }
     }
          
     while(!stack.empty()){
         int temp = stack.pop();
         
         if(!stack.empty() && temp == stack.peek()){
             answer += 2;
             stack.pop();
         }
         
     }
     
        
        return answer;
    }
}
