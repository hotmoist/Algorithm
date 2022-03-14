import java.io.*;

public class Main {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};
    int[][] matrix;
    boolean[][] visit;
    int N;
    int M;

    {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            int testCase = Integer.parseInt(br.readLine());

            for(int t = 0; t < testCase; t++) {
                String input = br.readLine();
                String[] inputArr = input.split(" ");

                M = Integer.parseInt(inputArr[0]); // 가로
                N = Integer.parseInt(inputArr[1]); // 세로
                int k = Integer.parseInt(inputArr[2]);
                int count = 0;

                matrix = new int[N][M];
                visit = new boolean[N][M];

                for (int i = 0; i < k; i++) {
                    input = br.readLine();
                    inputArr = input.split(" ");

                    matrix[Integer.parseInt(inputArr[1])][Integer.parseInt(inputArr[0])] = 1;
                }

                for(int i = 0; i < N; i++){
                    for(int j = 0; j < M; j++){
                        if(matrix[i][j] == 1 && !visit[i][j]){
                            dfs(j, i);
                            count++;
                        }
                    }
                }

                bw.write(count + "\n");
            }

            bw.flush();
        } catch (IOException e){}
    }

    public static void main(String args[]) throws IOException {
        new Main();
    }

    void dfs (int X, int Y){
        for(int i = 0; i < 4; i++){
            int inputX = X + dx[i];
            int inputY = Y + dy[i];

            if(inputX < 0 || inputX >= M || inputY <0 || inputY >= N ){
                continue;
            }

            if(visit[inputY][inputX]){
                continue;
            }

            if(matrix[inputY][inputX] == 1){
                visit[inputY][inputX] = true;
                dfs(inputX, inputY);
            }


        }
    }

}
