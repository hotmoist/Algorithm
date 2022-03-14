import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        int c = Integer.parseInt(br.readLine());
        String input;
        String[] inputArr;

        for(int i = 0; i < c; i++){
            input = br.readLine();
            inputArr = input.split(",");

            bw.write(Integer.parseInt(inputArr[0]) + Integer.parseInt(inputArr[1] ) + "\n");
        }

        bw.flush();
    }
}
