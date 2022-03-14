import java.math.BigInteger;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int rep = Integer.parseInt(br.readLine());
        String input;
        String[] inputArr;


        for (int i = 0; i < rep; i++) {

            input = br.readLine();
            inputArr = input.split(" ");

            int a = Integer.parseInt(inputArr[0]);
            int b = Integer.parseInt(inputArr[1]);

            BigInteger top = BigInteger.valueOf(1);
            BigInteger buttom = BigInteger.valueOf(1);

            for (int j = a; j >= 1; j--) {
                buttom = buttom.multiply(BigInteger.valueOf(j));
                top = top.multiply(BigInteger.valueOf(b));
                --b;


            }
               top =  top.divide(buttom);
                bw.write( top + "" + "\n");
        }
        bw.flush();
    }
}
