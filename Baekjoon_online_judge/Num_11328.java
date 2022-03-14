import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int test = Integer.parseInt(br.readLine());
        for(int k = 0; k < test; k++) {
            String[] input = br.readLine().split(" ");
            String a = input[0];
            String b = input[1];

            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);

                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c) {
                        b = b.substring(0, j) + b.substring(j + 1);
                        a = a.substring(0, i) + a.substring(i + 1);
                        i--;
                        break;
                    }
                }
            }

            if(a.length() > 0 || b.length() > 0){
                System.out.println("Impossible");
            }else {
                System.out.println("Possible");
            }
        }
    }

}
