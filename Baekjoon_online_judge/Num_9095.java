import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[] d;

    public static void main(String args[]) throws IOException{
        int  testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            int n = Integer.parseInt(br.readLine());

            d = new int[2];

            dp(n);

            bw.write(d[0] + d[1] + "\n");
        }

        bw.flush();
    }

    static void dp(int n ){
        if(n == 1){
            ++d[1];
        }

        if(n == 0){
            ++d[0];
        }

        if( n > 1){
            dp(n-1);
            dp(n-2);
            dp(n-3);
        }

    }
}


