/*
 *Programmers coding test practice 
 * brute force (level 1)
 * Problem name : 
 */


import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[0];

            int s1 = 0, s2 = 0, s3 = 0;

            for (int i = 0; i < answers.length; i++) {

                // 1번 수포자
                if ((i % 5 + 1) == answers[i]) {
                    s1++;
                }
                // 2번 수포자
                if (i % 2 == 0) {
                    if (answers[i] == 2) {
                        s2++;
                    }
                } else {
                    int k = i % 8;
                    if (k == 1 && answers[i] == 1) s2++;
                    if (k == 3 && answers[i] == 3) s2++;
                    if (k == 5 && answers[i] == 4) s2++;
                    if (k == 7 && answers[i] == 5) s2++;
                }

                // 3번 수포자

                int j = i % 10;
                if (j < 2 && answers[i] == 3) s3++;
                else if (j >= 2 && j < 4 && answers[i] == 1) s3++;
                else if (j >= 4 &&j < 6 && answers[i] == 2) s3++;
                else if (j >= 6 &&j < 8 && answers[i] == 4) s3++;
                else if ( j >= 8 && j < 10 && answers[i] == 5) s3++;
            }


            if(s1 == s2 && s2 == s3){
                answer = new int[]{1,2,3};
            }

            if(s1 > s2 && s1 > s3){
                answer = new int[]{1};
            }

            if(s2 > s1 && s2> s3){
                answer = new int[]{2};
            }

            if(s3 > s1 && s3 > s2){
                answer = new int[]{3};
            }

            if( s1 == s2 && s2 > s3){
                answer = new int[]{1,2};
            }

            if(s1 == s3 && s3 > s2){
                answer = new int[]{1,3};
            }

            if(s2 == s3 && s3 > s1){
                answer = new int[]{2,3};
            }


        return answer;
    }
}
