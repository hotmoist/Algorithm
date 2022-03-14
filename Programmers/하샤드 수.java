/*
 * Programmers coding test practice
 * exercise question( String )(level 1)
 * Problem name : 하샤드 수
 */

class Solution {
    public boolean solution(int x) {
        String s = x + "";
        int t = 0;

       for(int i = 0; i < s.length() ; i++){
           t += Integer.parseInt(s.substring(i, i+1));
       }

       if( x % t == 0){
           return true;
       }else {
           return false;
       }

    }
}
