import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int N;
    static int M;
    static int[][] matrix;
    static boolean[][] visit;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    private static class Dot {
        int x, y;
        int num;

        Dot(int x, int y, int sum) {
            this.x = x;
            this.y = y;
            this.num = sum;
        }

    }

    public static void main(String args[]) throws IOException {
        String[] inputArr = br.readLine().split(" ");

        N = Integer.parseInt(inputArr[0]);
        M = Integer.parseInt(inputArr[1]);

        matrix = new int[N + 1][M + 1];
        visit = new boolean[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            inputArr = br.readLine().split("");

            for (int j = 1; j <= M; j++) {
                matrix[i][j] = Integer.parseInt(inputArr[j-1]);
            }
        }

        bfs(matrix, visit);

        bw.write(matrix[N][M] + "");
        bw.flush();
    }

    static void bfs(int[][] mat, boolean[][] vis) {
        Queue<Dot> q = new LinkedList<>();

        q.offer(new Dot(1, 1, mat[1][1]));
        vis[1][1] = true;

        while (!q.isEmpty()) {
            Dot dot = q.poll();

            for (int i = 0; i < 4; i++) {
                int x = dot.x + dx[i];
                int y = dot.y + dy[i];

                if (x < 1 || x > N || y < 1 || y > M){
                    continue;
                }

                if(!vis[x][y] && mat[x][y] > 0){
                    vis[x][y] = true;
                    mat[x][y] += dot.num;

                    q.offer(new Dot(x, y, mat[x][y]));
                }

            }
        }

    }


}



