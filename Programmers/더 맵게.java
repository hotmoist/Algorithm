/*
 * Programmers coding test practice
 * exercise question(heap)(level 2)
 * Problem name : 더 맵게
 */
 
 import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
         int answer = -1;
       PriorityQueue<Integer> q = new PriorityQueue<>();
       int t = 0;
       int times = 0;

       for(int i : scoville){
           q.offer(i);
       }

       while(q.size() > 1){
           if(q.peek() >= K){
               answer = times;
               break;
           }

           int t1 = q.poll();
           int t2 = q.poll();

           t = t1 +(t2 * 2);
           q.offer(t);
           times++;
       }

       if(q.poll() >= K){
           answer = times;
       }

       return answer;

    }
}
