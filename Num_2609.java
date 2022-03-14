import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int gd = 1;
        long ld = 0;

        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gd = i;
            }
        }

        for (int i = 1; true; i++) {
            long temp = Math.max(a * i, b * i);
            if (temp % Math.min(a, b) == 0) {
                ld = temp;
                break;
            }
        }

        bw.write(gd + "\n" + ld);
        bw.flush();
    }
}
