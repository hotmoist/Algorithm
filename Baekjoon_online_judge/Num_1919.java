import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String a = br.readLine();
        String b = br.readLine();

        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);

            for(int j = 0; j < b.length(); j++){
                if(b.charAt(j) == c){
                    b = b.substring(0, j) + b.substring(j+1);
                    a = a.substring(0, i) + a.substring(i+1);
                    i--;
                    break;
                }
            }
        }

        int answer = a.length() + b.length();
        System.out.println(answer);
    }

}
