import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;

        int n = 0;
        long a = 1;
        long end;
        input = br.readLine();
        end = Long.parseLong(input);


        while(true){
            if(a < end){
                n++;
                a = a + 6*n;
            } else{
                break;
            }

        }

        bw.write(n+1 + "");
        bw.flush();

    }
}


