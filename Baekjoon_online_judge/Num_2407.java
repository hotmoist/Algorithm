import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;

        for(int i = 0; i < m; i++){
            n1 = n1.multiply(new BigInteger(String.valueOf(n - i)));
            n2 = n2.multiply(new BigInteger(String.valueOf(i + 1)));
        }

        BigInteger answer = n1.divide(n2);
        bw.write(answer + "");
        bw.flush();

    }
}
