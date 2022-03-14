import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        Iterator it = set.iterator();
        answer = new int[set.size()];
        for(int i = 0; it.hasNext(); i++){
            answer[i] = (int)it.next();
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
