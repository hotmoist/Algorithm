import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static long one;
    static long zero;

    public static void main(String args[]) throws IOException {
        int loops = Integer.parseInt(br.readLine());

        for (int i = 0; i < loops; i++) {
            int N = Integer.parseInt(br.readLine());
            zero = 0;
            one = 0;

            long n1zero = 0;
            long n2zero = 0;
            long n1one = 0;
            long n2one = 0;

            for(int j = 0; j <= N; j++) {
                if (j == 0) {
                    n2zero = 1;
                    n2one = 0;
                    
                    
                    zero = 1;
                    one = 0;
                } else if (j == 1) {
                    n1zero = 0;
                    n1one = 1;
                    
                      zero = 0;
                    one = 1;
                } else {
                    zero = n1zero + n2zero;
                    one = n1zero + n1one;

                    n2one = n1one;
                    n2zero = n1zero;
                    n1one = one;
                    n1zero = zero;
                }
            }
            bw.write(zero + " " + one + "\n");
        }
        bw.flush();
    }
}
