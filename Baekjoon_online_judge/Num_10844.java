import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        long[][] dp = new long[n+1][10];

        for(int i = 1; i <= 9; i++){
            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = 0; j <= 9; j++){

                if(j == 0){
                    dp[i][j] = dp[i-1][j+1];
                }

                else if( j == 9){
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
                }

                dp[i][j] %= 1000000000;
            }
        }

        long sum = 0L;

        for(int i = 0; i < 10; i++){
            sum += dp[n][i];
        }
        

        sum %= 1000000000;

        bw.write(sum + "");
        bw.flush();
    }
}

