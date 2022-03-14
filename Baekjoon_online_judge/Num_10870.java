import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));


    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        bw.write(fib(n) + "");
        bw.flush();
    }

    static int fib(int a){
        if(a == 0){
            return 0;
        }

        if(a == 1){
            return 1;
        }


        return fib(a-1) + fib(a-2);
    }
}
