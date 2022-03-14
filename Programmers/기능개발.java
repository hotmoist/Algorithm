/*
 * Programmers coding test practice
 * exercise question(stack / queue)(level 2)
 * Problem name : 기능 개발
 */

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for(int i : progresses){
            queue.add(i);
        }

        int i = 0;

        while (!queue.isEmpty()){
            int work = 0;
            int temp = queue.peek();

            if(temp >= 100){
                while (temp >= 100 && !queue.isEmpty()){
                    queue.remove();
                    i++;
                    work++;
                    if(!queue.isEmpty()) {
                        temp = queue.peek();
                    }
                }
                list.add(work);
            }


            for(int t = 0; t < queue.size(); t++){
                temp = queue.remove();
                queue.add(temp + speeds[t+i]);
            }

        }

        int[] arr = new int[list.size()];

        for (int j = 0; j < list.size(); j++){
            arr[j] = list.get(j);
        }

        return arr;
    }
}
