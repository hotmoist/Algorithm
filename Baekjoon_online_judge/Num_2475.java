import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");

        int sum = 0;

        for(int i = 0; i < 5; i++){
            sum += Math.pow(Double.parseDouble(input[i]), 2);
        }

        bw.write((sum % 10) + "");
        bw.flush();
    }
}
