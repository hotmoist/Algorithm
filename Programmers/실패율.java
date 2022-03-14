/*
 * Programmers coding test practice
 * 2019 KAKAO BLIND RECRUITMENT(level 1)
 * Problem name : 실패율 
 */
 
 import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
         Stage_info[] si = new Stage_info[N];
        int[] answer = new int[N];

        for(int i = 1; i <= N; i++){
            float clear = 0;
            float unclear = 0;
            float failure_rate;

            for(int j = 0; j < stages.length; j++){
                if(i == stages[j]){
                    unclear += 1;
                }

                if ( i < stages[j]){
                    clear += 1;
                }
            }

            if(clear == 0 && unclear == 0){
                failure_rate = 0;
            } else {
                failure_rate = (unclear / (clear + unclear));
            }

            si[i-1] = new Stage_info(i, failure_rate);
        }

        Arrays.sort(si, new Comparator<Stage_info>() {
            @Override
            public int compare(Stage_info o1, Stage_info o2) {

                if(o1.stage_failure_rate == o2.stage_failure_rate){
                    if(o1.stage_num > o2.stage_num){
                        return 1;
                    } else {
                        return -1;
                    }
                }

                if(o1.stage_failure_rate > o2.stage_failure_rate){
                    return -1;
                } else {
                    return 1;
                }
            }
        });

        for(int i = 0; i < N; i++){
            answer[i] = si[i].stage_num;
        }

        return answer;

    }

    static class Stage_info{
        int stage_num;
        float stage_failure_rate;

        Stage_info(int sn, float sfr){
            this.stage_num = sn;
            this.stage_failure_rate = sfr;
        }

        void set_stage_failure_rate(float sfr){
            this.stage_failure_rate = sfr;
        }

    }
}
