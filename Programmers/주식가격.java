/*
 * Programmers coding test practice
 * Stack/Queue exercise question(level 2)
 * Problem name : 주식가격
 */



class Solution {
    public int[] solution(int[] prices) {
        int[] time = new int[prices.length];
     
       for(int i = 0; i < prices.length-1; i++){
           int t = 0;
           for(int j = i+1 ; j < prices.length; j++){
               if(prices[i] <= prices[j]){
                   t++;
               } else if (prices[i] > prices[j]) {
                   t++;
                   break;
               }
           }

           time[i] = t;
       }


        return time;
    }
}
