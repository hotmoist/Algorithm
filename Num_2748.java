import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static long[] d;

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        d = new long[n + 1];

        dp(0);

        bw.write(d[n] + "");
        bw.flush();
    }

    static void dp(int n) {



        if(n > d.length-1){
            return;
        } else if ( n >= 2) {
            d[n] = d[n - 1] + d[n - 2];
        }

        if (n == 0) {
            d[0] = 0;
        }

        if (n == 1) {
            d[1] = 1;
        }
        dp(n + 1);
    }
}


