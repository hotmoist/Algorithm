import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;

        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++) {
            input = br.readLine();
            inputArr = input.split(" ");

            Long x = Long.parseLong(inputArr[0]);
            Long y = Long.parseLong(inputArr[1]);

            Long dist = y-x;
            Long k = (dist)/2 + 1;
            Long n = 0L;
            for(Long j = 0L; j <= dist; j++ ) {
                Long a = j/2;
                Long max = 0L;
                if(j % 2 == 0){ // even
                    max = a*(a+1);
                }
                else{
                    max = (a+1)*(a+2)/2 + a* (a+1) /2;
                }

                if( max >= dist){
                    n = j;
                    break;
                }
            }
            bw.write(n + ""+ "\n");
        }

        bw.flush();

    }
}


