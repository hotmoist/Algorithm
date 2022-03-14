import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int test = Integer.parseInt(br.readLine());
        for (int i = 0; i < test; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int t = Integer.parseInt(br.readLine());
            for (int k = 0; k < t; k++) {
                String[] input = br.readLine().split(" ");
                if (map.containsKey(input[1])) {
                    map.replace(input[1], map.get(input[1]) + 1);
                } else {
                    map.put(input[1], 1);
                }
            }

            Iterator<String> iter = map.keySet().iterator();
            int answer = 1;
            while(iter.hasNext()){
                answer *= (map.get(iter.next())+1);
            }
            answer -= 1;

           bw.write(answer+"\n");
        }

        bw.flush();
    }
}
