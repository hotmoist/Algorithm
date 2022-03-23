import java.io.*;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int e = Integer.parseInt(input[4]);

        long min_val;

        for (min_val = Math.min(a, Math.min(b, Math.min(c, Math.min(d, e)))); true; min_val++) {
            int count = 0;
            if(min_val %  a == 0){
                count++;
            }
            if(min_val %  b == 0){
                count++;
            }
            if(min_val %  c == 0){
                count++;
                if(count == 3){
                    break;
                }
            }
            if(min_val %  d == 0){
                count++;
                if(count == 3){
                    break;
                }
            }
            if(min_val %  e == 0){
                count++;
                if(count == 3){
                    break;
                }
            }
        }

        bw.write(min_val + "");
        bw.flush();
    }
}
