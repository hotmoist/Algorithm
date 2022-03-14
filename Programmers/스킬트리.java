/*
 * Programmers coding test practice
 * Summer/Winter Coding (~2018) (level 2)
 * Problem name : 스킬트리
 */



import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        Queue<Character> q;

        loop : for(String s : skill_trees){
            q = new LinkedList<>();

            for(int i = 0; i < skill.length(); i++){
                q.add(skill.charAt(i));
            }

            for(int i = 0; i < s.length(); i++){
                char w = s.charAt(i);

                if(q.contains(w) && q.peek() != w){
                    continue loop;
                }

                if(q.isEmpty()){
                    break;
                }

                if(q.peek() == w){
                    q.remove();
                }
            }
            answer++;
        }
        return answer;
    }
}
