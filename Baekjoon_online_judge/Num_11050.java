import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int[][] dp;

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        dp = new int[n + 2][n + 2];

        for (int i = 1; i <= n+1; i++) {
            for (int j = 1; j <= n+1; j++) {

                if (j == 1 || j == i) {
                    dp[i][j] = 1;
                    continue;
                }

                dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }


        bw.write(dp[n+1][m+1] + "");
        bw.flush();
    }
}
