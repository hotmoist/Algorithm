import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       int n = Integer.parseInt(br.readLine());

       if(n == 0){
           bw.write("YONSEI");
       } else if (n == 1){
           bw.write("Leading the Way to the Future");
       }

       bw.flush();
    }
}
