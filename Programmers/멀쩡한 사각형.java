/*
 * Programmers coding test practice
 * Summer/Winter Coding(2019) (level 2)
 * Problem name : 멀쩡한 사각형
 */
 
 class Solution {
    public long solution(int w, int h) {
        long answer = 0;        
        long g = gcd(w, h);        
        answer = ((long)w*(long)h) - (w+h - g);
        
        return answer;
    }

    public static long gcd(int a, int b){
        if( b == 0) return a;

        return gcd(b, a%b);
    }
}
 
