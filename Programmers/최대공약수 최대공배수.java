/*
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 최대공약수 최대공배수
 */
 
 class Solution {
    public int[] solution(int n, int m) {
         int[] answer = new int[2];
        answer[0] = gcd(n,m);
        answer[1] = lcm(n,m);
        
        return answer;
   }

   int gcd (int a, int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }

        return a;
   }

   int lcm(int a, int b){
        return a*b/gcd(a, b);
   }
}
