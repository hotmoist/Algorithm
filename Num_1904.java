import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        long[] dp = new long[n + 1];


        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = 1;
            } else if (i == 2) {
                dp[i] = 2;
            } else {
                dp[i] = (dp[i - 1] + dp[i - 2])%15746;
            }
        }

        bw.write((dp[n]) + "");
        bw.flush();
    }
}

