/*
 * Programmers coding test practice
 * exercise question(sorting)(level 2)
 * Problem name : 가장 큰 수
 */
 
 import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            nums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        
        if(nums[0].startsWith("0")){
            answer += 0;
        } else {
            for(String s : nums){
                answer += s;
            }
        }
        
        return answer;
    }
}
