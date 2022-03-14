import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        int t = Integer.parseInt(br.readLine());

        String[] input = br.readLine().split(" ");


        for(int i = 0; i < t; i++){
            if(!set.contains(Integer.parseInt(input[i]))){
                set.add(Integer.parseInt(input[i]));
            } else {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}

