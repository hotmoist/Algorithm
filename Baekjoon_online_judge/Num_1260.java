import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;

        input = br.readLine();
        int x = Integer.parseInt(input);
        int n = 1;
        int m = 0;
        int up, down;
        while(true){
            if (x == 1){
                break;
            }
            int k = n*(n-1)/2;
            int l = n*(n+1)/2;
            if(k< x && x <= l){
                m = x-k;
                break;
            } else {
                n++;
            }
        }
        if (n % 2 == 0) { // 짝
            up = 1;
            down = n;
            for(int i = 1; i < m; i++){
                up++;
                down--;
            }

        } else{ // 홀
            up = n;
            down = 1;
            for(int i = 1; i < m; i++){
                up--;
                down++;
            }
        }

        bw.write(up+"" + "/" + down+"");
        bw.flush();
    }
}


