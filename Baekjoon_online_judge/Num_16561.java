import java.io.*;
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n/3 +1];

        for(int i = 0; i < dp.length; i++){
            if( i < 3){
                dp[i] = 0;
            } else if(i == 3) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i - 1] + (i - 2);
            }
        }

        bw.write(dp[n/3] + "");
        bw.flush();
    }



}
