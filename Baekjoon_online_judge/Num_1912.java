import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] a = new int[n+1];
        long[] dp = new long[n+1];

        String[] input = br.readLine().split(" ");

        for(int i = 1 ; i <= n; i++ ){
            a[i] = Integer.parseInt(input[i-1]);
        }

       if( n >= 1){
           dp[1] = a[1];
       }

       Long max = dp[1];

       if( n >= 2){
           for(int i = 2; i <= n; i++){
               dp[i] = Math.max(dp[i-1]+ a[i], a[i]);

               max = Math.max(dp[i], max);
           }
       }


       bw.write(max + "");
       bw.flush();
    }
}

