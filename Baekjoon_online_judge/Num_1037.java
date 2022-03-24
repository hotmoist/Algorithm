import java.io.*;
import java.util.*;


public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int answer = 0;
        int min = -1;
        int max = 0;

        for(String s : input){
            if(min < 0){
                min = Integer.parseInt(s);
            }else{
                min = Math.min(Integer.parseInt(s), min);
            }
            max = Math.max(max, Integer.parseInt(s));
        }

        answer = max * min;
        bw.write(answer + "");
        bw.flush();

    }
}
