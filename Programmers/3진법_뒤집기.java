/*
 * Programmers coding test practice
 * 월간 코드 첼린지 시즌 1(level 1)
 * Problem name : 3진법 뒤집기
 */

class Solution {
    public int solution(int n) {
        int answer = 0;

        int t = n;
        StringBuilder sb = new StringBuilder();

        while(t > 2){
            sb.append( t % 3);
            t /= 3;
        }

        sb.append(t);

        sb.reverse();
        String s = sb.toString();

        for(int i = 0; i < s.length(); i++ ){
            answer += (s.charAt(i) - '0') * Math.pow(3, i);
        }


        return answer;
    }
}
