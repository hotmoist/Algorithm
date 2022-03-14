import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[][] matrix ;
    static boolean[] visit;
    static int connect = 0;
    public static void main(String args[]) throws IOException {
       String[] inputData = br.readLine().split(" ");
       int vertax = Integer.parseInt(inputData[0]);
       int edge = Integer.parseInt(inputData[1]);
       matrix = new int[vertax+1][vertax+1];
       visit = new boolean[vertax+1];
        int result = 0;

       for(int i = 0; i < edge; i++){
           inputData = br.readLine().split(" ");
           matrix[Integer.parseInt(inputData[0])][Integer.parseInt(inputData[1])]
                   = matrix[Integer.parseInt(inputData[1])][Integer.parseInt(inputData[0])] = 1;
       }

       for(int i = 1; i < visit.length; i++ ){
           if(!visit[i]){
               dfs(i);
               result++;
           }
       }

       bw.write(result+"");
       bw.flush();
    }

    static void dfs (int start){
        if(visit[start]){
            return;
        }else {
            visit[start] = true;
            for(int i = 1; i < matrix[start].length; i++){
                if(matrix[start][i] == 1){
                    dfs(i);
                }
            }
        }

    }
}
