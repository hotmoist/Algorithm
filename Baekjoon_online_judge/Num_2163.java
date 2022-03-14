import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       String[] input = br.readLine().split(" ");

       int n = Integer.parseInt(input[0]);
       int m = Integer.parseInt(input[1]);

       bw.write((n*m-1) + "");
       bw.flush();
    }
}
