import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int teams = Integer.parseInt(br.readLine());
        int[] score = new int[teams];
        int s = 0;
        boolean is = true;
        String input = br.readLine();
        String[] info = input.split(" ");

        for(int i = 0; i < teams; i++){
            score[i] = Integer.parseInt(info[i]);
        }
        Arrays.sort(score);

        for(int i = 0; i < teams; i++){
            s += score[i];
            if( s < (i+1)*i/2)
                is = false;

        }

        if (is == false){
            bw.write(-1+"");
        } else if (s == (teams-1)*teams/2) {
            bw.write(1 + "");
        } else {
            bw.write(-1+"");
        }
        bw.flush();

    }
}
