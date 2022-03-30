import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[]) throws IOException {
        String[] input;
        int N = Integer.parseInt(br.readLine());
        int[] T = new int[N];
        int[] P = new int[N];

        for(int i = 0 ; i < N; i++){
            input = br.readLine().split(" ");
            T[i] = Integer.parseInt(input[0]);
            P[i] = Integer.parseInt(input[1]);
        }

        int[] dp = new int[N+1];

        for(int i = 0; i < N; i++){
            if(i + T[i] <= N){
                dp[i+ T[i]] = Math.max(dp[i + T[i]], dp[i] + P[i] );
            }

            dp[i+1] = Math.max(dp[i+1], dp[i]);
        }

        bw.write(dp[N] +"");
        bw.flush();
    }
}
