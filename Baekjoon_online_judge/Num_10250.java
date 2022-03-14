import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;

        int testCase = Integer.parseInt(br.readLine());

        for(int c = 0; c <testCase; c++){
            input = br.readLine();
            inputArr = input.split(" ");

            int h = Integer.parseInt(inputArr[0]);
            int w = Integer.parseInt(inputArr[1]);
            int n = Integer.parseInt(inputArr[2]);

            int floor;
            int number;

            if(n % h == 0){
                floor = h;
            } else if ( h == 1){
                floor = 1;
            } else {
                floor = n % h;
            }

            if(h == 1){
                number = n;
            } else if( floor == h){
                number = n/ h;
            }
            else {
                number = n / h + 1;
            }
            if (number < 10) {
                bw.write(floor + "" + "0" + number + "" + "\n");
            } else {
                bw.write(floor + "" + number + "" + "\n");
            }

        }

        bw.flush();

    }
}
