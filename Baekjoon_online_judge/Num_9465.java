import java.io.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        for(int t = 0 ; t < testCase; t++){
            int n = Integer.parseInt(br.readLine());

            int[][] mat = new int[2][n+1];
            int[][] dp = new int[2][n+1];

            for(int i = 0; i < 2; i++){
                String[] input = br.readLine().split(" ");

                for(int j = 1; j <= input.length; j++){
                    mat[i][j] = Integer.parseInt(input[j-1]);
                }
            }

            dp[0][1] = mat[0][1];
            dp[1][1] = mat[1][1];

            for(int i = 2; i <= n; i++){
                dp[0][i] = Math.max(dp[1][i-1], Math.max(dp[0][i-2], dp[1][i-2])) + mat[0][i];
                dp[1][i] = Math.max(dp[0][i-1], Math.max(dp[0][i-2], dp[1][i-2])) + mat[1][i];
            }

            bw.write(Math.max(dp[0][n], dp[1][n]) + "\n");
        }

        bw.flush();
    }
}
