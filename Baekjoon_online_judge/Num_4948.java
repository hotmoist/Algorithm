import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int input = 0;
        int answer = 0;
        while((input = Integer.parseInt(br.readLine()))!= 0){
            answer  = findPri(input);
            bw.write(answer + "\n");
        }
        bw.flush();

    }

    static int findPri(int t) {
        int start = t;
        int end = t * 2;
        int count = 0;
        loop:
        for (int x = start+1; x <= end; x++) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    continue loop;
                }
            }
            if(x > 1) {
                count++;
            }
        }

        return count;
    }
}
