/*
 * Programmers coding test practice
 * 2018 KAKAO BLIND RECRUITMENT
 * Problem name : 다트게임
 */
 
 import java.util.*;

class Solution {
    public int solution(String dartResult) {
      int[] score = new int[3];
        int index = 0;
        String temp = "";
        int answer = 0;

        String[] st = dartResult.split("");

        for (String s : st) {

            if (s.equals("#")) {
                score[index-1] *= -1;
                continue;
            }

            if (s.equals("*")) {
                for (int i = index-1; i >= index - 2; i--) {
                    if (i < 0) {
                        break;
                    }

                    score[i] *= 2;
                }
                continue;
            }

            if (s.equals("S")) {
                score[index] = Integer.parseInt(temp);
                index++;
                temp = "";
                continue;
            }

            if (s.equals("D")) {
                score[index] = (int) Math.pow(Integer.parseInt(temp), 2);
                index++;
                temp = "";
                continue;
            }

            if (s.equals("T")) {
                score[index] = (int) Math.pow(Integer.parseInt(temp), 3);
                index++;
                temp = "";
                continue;
            }

            temp += s;
        }

        for (int i : score) {
            answer += i;
        }

        return answer;
    }
}
