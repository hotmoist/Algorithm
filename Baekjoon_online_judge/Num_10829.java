import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {

       Long n = Long.parseLong(br.readLine());

        bw.write(binary(n));
        bw.flush();
    }

    static String binary(Long n ){
        Long N = n/2;
        Long one = n%2;

        if( n == 1){
            return n + "";
        }

        return binary(N) + one;
    }
}
