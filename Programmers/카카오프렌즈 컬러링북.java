/*
 * Programmers coding test practice
 * 2017 카카오코드 예선(level 2)
 * Problem name : 카카오프렌즈 컬러링북
 */
 
class Solution {
    static int area = 0;
    
    
    public int[] solution(int m, int n, int[][] picture) {
       boolean[][] visit = new boolean[m][n];

        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        area = 0;

        int[] answer = new int[2];


        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(!visit[i][j] && picture[i][j] > 0){
                    area = 0;
                    numberOfArea += 1;
                    search(i, j, picture, visit, picture[i][j] );

                    if (maxSizeOfOneArea < area){
                        maxSizeOfOneArea = area;
                    }
                }
            }
        }

        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;

        return answer;
    }

    static void search(int i, int j, int[][] picture, boolean[][] visit,  int num ){

       if( i >= picture.length || j >= picture[0].length || i < 0 || j < 0){
           return;
       }

        if(visit[i][j] || picture[i][j] != num){
            return;
        }

        visit[i][j] = true;

        area += 1;

        search(i +1, j, picture, visit, num );
        search(i, j+1, picture, visit, num);
        search(i-1, j, picture, visit,num);
        search(i, j-1, picture, visit,num);
    }
}
