/*
 * Programmers coding test practice
 * exercise question( string )(level 1)
 * Problem name : 이상한 문자 만들기
 */
 
 class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int k = 0;

        for(int i = 0; i < s.length(); i++ ){
            char c = s.charAt(i);

            if( c == ' '){
                k = 0;
                sb.append(c);
                continue;
            }

            if(k % 2 == 0){
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
            k++;
        }

        return sb.toString();
    }
}
