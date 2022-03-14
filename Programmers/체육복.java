/*
 * Programmers coding test practice
 * Greedy (level 1)
 * Problem name : 체육복
 */


class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
         int[] d = new int [n+2];

            for(int i = 1; i < n+1; i++){
                d[i] = 1;
            }

            for(int i : lost){
                d[i] -= 1;
            }

            for(int i : reserve){
                d[i] += 1;
            }

            for(int i = 1; i < n+1; i++){
                if(d[i] >= 1){
                    answer += 1;

                    continue;
                }

                if(d[i] == 0){
                    if(d[i-1] == 2){
                        d[i] = 1;
                        d[i-1] -= 1;
                    } else if(d[i+1] == 2){
                        d[i] = 1;
                        d[i+1] -= 1;
                    } else {
                        continue;
                    }

                    answer += 1;
                }

            }

        
        return answer;
    }
}
