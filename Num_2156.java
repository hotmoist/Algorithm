import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n+1];
        long[] dp = new long[n+1];

        for(int i = 1; i <= n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        if( n >= 1){
            dp[1] = a[1];
        }

        if( n >= 2){
            dp[2] = a[1] + a[2];
        }

        if( n >= 3){
            dp[3] = Math.max(dp[2], Math.max(dp[1] + a[3], a[2] + a[3]));
        }

        if( n >= 4){
            for(int i = 4; i <= n; i++){
                dp[i] = Math.max(dp[i-1], Math.max(dp[i-2] + a[i], dp[i-3] + a[i-1] +a[i]));
            }
        }

        bw.write(dp[n] + "");
        bw.flush();
    }
}

