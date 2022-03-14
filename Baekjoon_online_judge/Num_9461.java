import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());

            long[] dp = new long[n+1];

            for(int j = 1; j <= n; j++ ){
                if( j <= 3){
                    dp[j] = 1;
                } else  if( j == 4 || j == 5){
                    dp[j] = 2;
                } else {
                    dp[j] = dp[j-1] + dp[j-5];
                }
            }

            bw.write(dp[n] + "\n");

        }

        bw.flush();
    }
}

