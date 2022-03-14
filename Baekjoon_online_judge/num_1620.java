import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String args[]) throws IOException {
        HashMap<String, String> map = new HashMap<>();
        String[] input = br.readLine().split(" ");

        for(int i = 1; i <= Integer.parseInt(input[0]); i++ ){
            String s = br.readLine();
            map.put(i + "", s);
            map.put(s, i+"");
        }

        for(int i = 0; i < Integer.parseInt(input[1]); i++){
            String s = br.readLine();
            bw.write(map.get(s) + "\n");
        }
        bw.flush();
    }
}
