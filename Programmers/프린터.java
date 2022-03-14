/*
 * Programmers coding test practice
 * exercise question( stack / queue)(level 2)
 * Problem name : 프린터
 */
 
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Printer> q = new LinkedList<>();
        int answer = 1;
        int max = 0;

        for(int i = 0; i < priorities.length; i++){
            q.add(new Printer(i, priorities[i]));

            if(priorities[i] > max){
                max = priorities[i];
            }
        }

        while(!q.isEmpty()){
            Printer t = q.remove();

            if( t.pri < max){
                q.add(t);
            }else {
                // change max
                priorities[t.loc] = 0;
                max = 0;
                for(int i = 0; i < priorities.length; i++){
                    if(priorities[i] > max){
                        max = priorities[i];
                    }
                }

                if (t.loc == location){
                    break;
                }
                answer++;
            }

        }

        return answer;
    }


    private static class Printer{
        int loc, pri;

        Printer(int loc, int pri){
            this.loc = loc;
            this.pri = pri;
        }
    }
}
