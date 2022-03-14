import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        String[] input = br.readLine().split(" ");

        int p = Integer.parseInt(input[0]) * Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        for(int i  = 0; i < input.length; i++){
            int sum = Integer.parseInt(input[i]) - p;
            bw.write(sum+ " ");
        }
        
        bw.flush();
    }
}

