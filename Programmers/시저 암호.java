/*
 * Programmers coding test practice
 * exercise question (String) (level 1)
 * Problem name : 시저암호
 */
 
 class Solution {
    public String solution(String s, int n) {
     StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            int c = s.charAt(i);
            
            if(c != ' ') {
                int t = c + n;
                // Upper letter
                if('A' <= c && c <= 'Z'){
                    if('Z' < t && t <'a'){
                        t = t - 'Z' + 'A' -1;
                    } else if('a' <= t){
                        t -= 26;
                    } 
                }
                
                // lower letter
                if('a' <= c && c <= 'z'){
                    if('z' < t){
                        t -= 26;
                    }
                }
                
                sb.append(Character.toChars(t));
            }else {
                sb.append(Character.toChars(c));
            }
            
            
        }

        return sb.toString();
    }
}
