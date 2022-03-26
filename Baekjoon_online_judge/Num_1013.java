import java.io.*;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String[] input;
    public static void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());
        String reg = "(100+1+|01)+";
        for(int i = 0 ; i < t; i++) {
            String input = br.readLine();
            if(input.matches(reg)){
                bw.write("YES\n");
            }else{
                bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
