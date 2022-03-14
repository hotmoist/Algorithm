import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int r = Integer.parseInt(br.readLine());
        System.out.println(String.format("%.6f",r*r*Math.PI));
        System.out.println(String.format("%.6f",(double)r*r*2));
    }
}
