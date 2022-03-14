/*
 * Programmers coding test practice
 * 2020  KAKAO BLIND RECRUITMENT
 * Problem name : 문자열 압축
 */
 
class Solution {
    public int solution(String s) {
       
         
        String ans = "";
        int answer = 0;

        if(s.length() == 1){
            answer = 1;
        } else {

            for (int i = 1; i < s.length(); i++) {
                String t = "";
                int count = 1;
                ans = "";

                for (int j = 0; j < s.length(); j += i) {
                    String sub;


                    if (j + i >= s.length()) {
                        sub = s.substring(j);

                        if (!t.equals(sub)) {
                            if (count != 1) {
                                ans += (count + t + sub);
                            } else {
                                ans += (t + sub);
                            }
                        } else {
                            count += 1;
                            ans = ans + count + t;
                        }
                        break;

                    } else {
                        sub = s.substring(j, j + i);
                    }

                    if (!t.equals(sub)) {
                        if (count == 1) {
                            ans += t;
                        } else {
                            ans = ans + count + t;
                        }
                        t = sub;
                        count = 1;

                    } else {
                        count++;

                        if (j + i >= s.length()) {
                            ans = ans + count + t;
                        }
                    }
                }

                if (answer == 0) {
                    answer = ans.length();
                } else if (ans.length() < answer) {
                    answer = ans.length();
                }
            }
        }

        return answer;
    }
}
