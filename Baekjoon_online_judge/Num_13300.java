import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int[][] info = new int[2][7];

        for(int i = 0; i < N; i++){
            input = br.readLine().split(" ");
            info[Integer.parseInt(input[0])][Integer.parseInt(input[1])]++;
        }

        int answer = 0;

        for(int i = 0; i < 2; i++){
            for(int j = 1; j <= 6; j++){
                int t1 = info[i][j]/K;
                int t2 = info[i][j] % K;
                if(t1 > 0 && t2 >0){
                    answer += (t1 + 1);
                }

                if(t1 > 0 && t2 == 0){
                    answer += t1;
                }

                if(t1 == 0 && info[i][j] > 0){
                    answer += 1;
                }
            }
        }
        System.out.println(answer);
    }

}
