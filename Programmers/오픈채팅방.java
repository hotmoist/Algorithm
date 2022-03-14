/*
 * Programmers coding test practice
 * 2019 KAKAO BLIND RECRUITMENT
 * Problem name : 오픈채팅방
 */
 
 import java.util.*;

class Solution {
    public String[] solution(String[] record) {
         String[] answer;
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String[] info = record[i].split(" ");

            if (info[0].equals("Enter")) {
                if (map.containsKey(info[1])) {
                    map.replace(info[1], info[2]);
                } else {
                    map.put(info[1], info[2]);
                }
            }

            if(info[0].equals("Change")){
                map.replace(info[1], info[2]);
            }
        }

        for(int i = 0; i < record.length; i++){
            String[] info = record[i].split(" ");

            if(info[0].equals("Enter")){
                list.add ( map.get(info[1]) + "님이 들어왔습니다.");
            }

            if(info[0].equals("Leave")){
                list.add( map.get(info[1]) + "님이 나갔습니다.");
            }
        }

        answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}
