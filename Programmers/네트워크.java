/*
 * Programmers coding test practice
 * exercise question(dfs / bfs) (level 3)
 * Problem name : 네트워크
 */
 
import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        boolean[] visit = new boolean[n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i] && !visit[j]) {
                    q.add(j);
                    while (!q.isEmpty()) {
                        int t = q.remove();
                        visit[t] = true;

                        for (int k = 0; k < n; k++) {
                            if (computers[t][k] == 1 && !visit[k]) {
                                q.add(k);
                            }
                        }

                    }

                    answer++;
                }

            }
        }


        return answer;
    }
}
