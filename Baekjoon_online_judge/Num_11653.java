import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));

    public static void main(String args[]) throws  IOException {
        int target = Integer.parseInt(br.readLine());
        boolean halt = false;
        if (target != 1) {
            loop:
            while (!halt) {
                for (int i = 2; i <= target / 2; i++) {
                    if (target % i == 0) {
                        target = target / i;
                        System.out.println(i);
                        continue loop;
                    }
                }

                halt = true;
            }
            System.out.println(target);
        }
    }
}
