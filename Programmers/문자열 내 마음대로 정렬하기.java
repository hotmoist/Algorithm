/*
 * Programmers coding test practice
 * exercise question(string compare)(level 1)
 * Problem name : 문자열 내 마음대로 정렬하기
 */

import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
       
        Arrays.sort(strings);
        for (int a = 0; a < strings.length - 1; a++) {
            for (int b = 0; b < strings.length - a - 1; b++) {
                if (strings[b].charAt(n) > strings[b + 1].charAt(n)) {
                    String temp = strings[b];
                    strings[b] = strings[b + 1];
                    strings[b + 1] = temp;
                }


            }


        }
        return strings;
    }
}
