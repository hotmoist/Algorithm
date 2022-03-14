import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");
        int answer = 0;
        for(String s : input){
            answer += Integer.parseInt(s);
        }
        bw.write(answer+"");
        bw.flush();
    }
}
