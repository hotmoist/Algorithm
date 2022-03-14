/*
 * Programmers coding test practice
 * exercise question(level 1)
 * Problem name : 자연수 뒤집어 배열로 만들기
 */
 
 class Solution {
    public int[] solution(long n) {
        String s = n + "";
        int[] answer = new int[s.length()];

        for(int i = s.length()-1; i >= 0; i-- ){
            answer[s.length() - (i+1)] = s.charAt(i) -'0';
        }

        return answer;
    }
}
