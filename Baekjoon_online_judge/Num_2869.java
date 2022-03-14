import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;

        input = br.readLine();
        inputArr = input.split(" ");

        Long a = Long.parseLong(inputArr[0]);      // day
        Long b = Long.parseLong(inputArr[1]);      // night
        long end = Long.parseLong(inputArr[2]);
        long n = (end-b)/(a-b);
        if((end-b) % (a-b) != 0){
            n++;
        }


        bw.write(n + "");
        bw.flush();


    }
}


