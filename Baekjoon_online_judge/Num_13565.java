import java.io.*;


public class Main {
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        static int isEnd = 0;
    public static void main(String args[]) throws IOException {
        String input = br.readLine();
        int[][] matrix;
        boolean[][] visit;
        String[] inputArr = input.split(" ");
        int M = Integer.parseInt(inputArr[0]);
        int N = Integer.parseInt(inputArr[1]);


        matrix = new int[M+1][N+1];
        visit = new boolean[M+1][N+1];

        for(int i = 1; i < matrix.length; i++){
            input = br.readLine();
            inputArr = input.split("");
            for(int j =1 ; j < matrix[0].length; j++){
                matrix[i][j] = Integer.parseInt(inputArr[j-1]);
            }
        }


        for(int i = 1; i < matrix[1].length; i++){
            if(matrix[1][i] == 0){
                search(1, i, visit, matrix);
            }
        }

        if(isEnd > 0){
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();


    }

    static void search(int M, int N, boolean[][] visit, int[][] matrix) throws IOException{
        int tmpM, tmpN;
        tmpM = M;
        tmpN = N;

        visit[tmpM][tmpN] = true;

        if( tmpM == matrix.length-1 && matrix[tmpM][tmpN] == 0) {
            isEnd ++;
            return;
        }


       if(M > 1  && visit[M - 1][N] == false && matrix[M-1][N] == 0){
            search(M-1, N, visit, matrix);
        }
       if(N > 1 && visit[M][N-1] == false && matrix[M][N-1]==0){
            search(M, N-1, visit, matrix);
        }
        if (M < matrix.length-1  && visit[M+1][N] ==false
                && matrix[M+1][N] == 0 ){
            search(M+1, N, visit, matrix);
        }
        if ( N < matrix[0].length-1 && visit[M][N+1] == false &&
                    matrix[M][N+1] == 0){
            search(M, N+1, visit, matrix);
        }
    }
}
