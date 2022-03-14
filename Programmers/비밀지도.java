/*
 * Programmers coding test practice
 * 2018 KAKAO BLIND RECRUITMENT (level 1)
 * Problem name : 비밀지도
 */
 
 class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
       String bin1;
        String bin2;
        String[] answer = new String[n];

        for(int i = 0; i < arr1.length; i++){
            bin1 = binary(arr1[i],n, 1);
            bin2 = binary(arr2[i],n, 1);

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < bin1.length(); j++){

                int temp = Integer.parseInt(bin1.substring(j, j+1)) + Integer.parseInt(bin2.substring(j, j+1));

                if( temp >= 1){
                    sb.append("#");
                }

                if(temp == 0){
                    sb.append(" ");
                }
            }

            answer[i] = sb.toString();
        }

        return answer;
    }



    static String binary(int n, int max, int count){
        if (n <= 1 && count == max){
            return n + "";
        }

        return binary(n/2, max, count + 1) + (n%2) + "";
    }
}
