/*
 * Programmers coding test practice
 * exercise question(math)(level 1)
 * Problem name : 약수의 합
 */
 
 class Solution {
    public int solution(int n) {
        int answer = 0;
        int temp = n /2;

        if (n == 1) {
            answer = 1;
        } else if (n == 2) {
            answer = 3;
        } else if(n == 3){
          answer = 4;  
        } else {
            for (int i = 1; i < temp; i++) {
                if (n % i == 0) {
                    temp = n / i;

                    if (temp == i) {
                        answer += i;
                    } else {
                        answer = answer + i + (n / i);
                    }
                }
            }
        }

        
        return answer;
    }
}
