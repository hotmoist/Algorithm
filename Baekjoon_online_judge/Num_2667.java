import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static boolean[][] visit;
    static int[][] matrix;
    static int count = 0;

    public static void main(String args[]) throws IOException {
       int N = Integer.parseInt(br.readLine());
       matrix = new int[N][N];
       visit = new boolean[N][N];

       List<Integer> list = new ArrayList<>();

       // matrix input
       for(int i = 0; i < N ; i++){
           String[] input = br.readLine().split("");
           for(int e = 0; e < N; e++){
               matrix[i][e] = Integer.parseInt(input[e]);
           }
       }

       for(int i = 0; i < N; i++){
           for(int j = 0; j < N; j++){
               if(!visit[i][j] && matrix[i][j] == 1){
                   count = 0;
                   dfs(i, j);
                   list.add(count);
               }
           }
       }

       bw.write(list.size() + "\n");
       Collections.sort(list);
       for(int e : list){
           bw.write(e + "\n");
       }

       bw.flush();
    }

    public static void dfs(int i, int j){

        try {
            if (visit[i][j] || matrix[i][j] == 0) {
                return;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            return;
        }


        count+=1;
        visit[i][j] = true;

        dfs(i, j+1);
        dfs(i, j-1);
        dfs(i+1, j);
        dfs(i-1, j);
    }


}
