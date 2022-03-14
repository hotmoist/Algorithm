/*
 * Programmers coding test practice
 * exercise question(math)(level 2)
 * Problem name : 위장
 */


import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for(int val : map.values()){
            answer *= val+1;
        }
        return answer -1;
    }
}
