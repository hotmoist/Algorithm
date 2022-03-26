import java.io.*;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String engine = "(100+1+|01)+";
        String input = br.readLine();
        if (input.matches(engine)) {
            bw.write("SUBMARINE");
        } else {
            bw.write("NOISE");
        }
        bw.flush();
    }
}
