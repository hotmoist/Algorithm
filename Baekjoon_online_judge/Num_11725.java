import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int n;
    static List<Integer>[] list;
    static boolean[] visit;
    static int[] parents;

    public static void main(String args[]) throws IOException {

        String input;
        String[] inputArr;

        n = Integer.parseInt(br.readLine());

        list = new ArrayList[n+1];
        parents = new int[n+1];
        visit = new boolean[n+1];

        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }


        for(int i = 1; i < n; i++){
            input = br.readLine();
            inputArr = input.split(" ");

            int a = Integer.parseInt(inputArr[0]);
            int b = Integer.parseInt(inputArr[1]);

            list[a].add(b);
            list[b].add(a);

        }

        dfs(1);
        for(int i = 2; i < parents.length; i++){
            bw.write(parents[i] + "" + "\n");

        }

        bw.flush();

    }

    static void dfs(int v){
       visit[v] = true;

       for(int i : list[v]){
           if(!visit[i]){
               parents[i] = v;
               dfs(i);
           }
       }
    }
}

