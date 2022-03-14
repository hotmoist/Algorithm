import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[]) throws IOException {
       int testCase = Integer.parseInt(br.readLine());

       int[] time = new int[testCase];

       String input = br.readLine();
       String[] inputArr = input.split(" ");

       for(int i = 0; i < testCase; i++){
           time[i] = Integer.parseInt(inputArr[i]);
       }

       int sum = 0;
       int tmp = 0;

       Arrays.sort(time);

       for(int i = 0; i <testCase; i++){
           tmp += time[i];
           sum += tmp;
       }

       bw.write(sum + "");
       bw.flush();

    }
}

