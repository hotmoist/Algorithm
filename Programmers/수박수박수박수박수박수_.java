/*
 * Programmers coding test practice
 * exercise question( string )(level 1)
 * Problem name : 수박수박수박수박수?
 */
 class Solution {
    public String solution(int n) {
        if(n == 1){
            return "수";
        }

        if(n % 2 == 1){
            return  solution(--n) + "수";
        } else {
            return solution(--n) + "박";
        }
    }
}
