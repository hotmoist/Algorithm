/*
 * Programmers coding test practice
 * 월간 코드 첼린지 시즌 1(level 1)
 * Problem name : 내적
 */


class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }
        
        return answer;
    }
}
