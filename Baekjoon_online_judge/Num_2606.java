import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
    static int[][] matrix;
    static boolean[] visit;
    static ArrayList<Integer> result = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        int computers = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        matrix = new int[computers+1][computers+1];
        visit = new boolean[computers+1];

        for(int i = 0; i < count; i++){
            String s = br.readLine();
            String[] info = s.split(" ");
            int row = Integer.parseInt(info[0]);
            int col = Integer.parseInt(info[1]);

            matrix[row][col] = matrix[col][row] = 1;
        }

        BFS(matrix, visit, 1);

        bw.write(result.size()-1 + "");
        bw.flush();


    }

    static void BFS(int[][] mat, boolean[] v, int start ){
        Queue<Integer> q = new LinkedList<>();

        q.offer(start);
        visit[start] = true;

        while(!q.isEmpty()){
            int tmp = q.poll();
            result.add(tmp);

            for(int i = 1; i < mat.length; i++){
                if( mat[tmp][i] == 1 && visit[i] == false){
                    visit[i] = true;
                    q.offer(i);
                }
            }
        }

    }
}


