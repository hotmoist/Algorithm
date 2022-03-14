import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        String input;
        String[] inputArr;

        while (true){
            input = br.readLine();
            inputArr = input.split(" ");

            int a = Integer.parseInt(inputArr[0]);
            int b = Integer.parseInt(inputArr[1]);

            if ( a == 0 && b == 0){
                break;
            }

            int fact = b % a;
            int multi = a % b;



            if (a < b && fact == 0) {
                bw.write("factor\n");
            } else if (a > b && multi == 0) {
                bw.write("multiple\n");
            } else {
                bw.write("neither\n");
            }

        }

        bw.flush();


    }
}
