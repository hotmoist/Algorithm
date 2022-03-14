import java.io.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] d;

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        d = new int[n+1];

        bw.write(dp(n) + "");
        bw.flush();
    }
    // top down 방식
    static int dp(int n){
        if(n ==1){
            return 0;
        }

        if(d[n] > 0){
            return d[n];
        }

        d[n] = dp(n-1)+1; // n-1일때 최소의 경우 +1회

        if( n % 2 == 0){
            int tmp = dp(n/2) + 1; // n/2일때 최소의 경우 + 1
            if(d[n] > tmp){         // tmp 보다 큰 경우 다시 최소의 경우로 변경
                d[n] = tmp;
            }
        }
        if( n % 3 == 0){
            int tmp = dp(n/3) + 1;
            if(d[n] > tmp){
                d[n] = tmp;
            }
        }

        return d[n];
    }
}
