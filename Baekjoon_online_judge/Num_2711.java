import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++) {
            String[] input = br.readLine().split(" ");

            int index = Integer.parseInt(input[0]);
            String a = input[1].substring(0, index-1);
            if(index < input[1].length()) {
                String b = input[1].substring(index);
                bw.write(a+b + "\n");
            } else {
                bw.write(a + "\n");
            }
        }
        bw.flush();
    }
}

