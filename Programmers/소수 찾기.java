/*
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 소수 찾기
 */
 
 class Solution {
    public int solution(int n) {
        int answer = 0;

        loop : for(int i = 2; i <= n; i++){
            for(int t = 2; t <= (int)Math.sqrt(i); t++){
                if(i % t == 0){
                    continue loop;
                }
            }

            answer++;
        }

        return answer;
    }
}
