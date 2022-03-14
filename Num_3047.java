import java.io.*;
import java.util.Arrays;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");

        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        String in = br.readLine();

        for(int i = 0; i < in.length(); i++){
            if(in.charAt(i) == 'A'){
                bw.write(arr[0] + " ");
            }

            else if(in.charAt(i) == 'B'){
                bw.write(arr[1] + " ");
            }

            else {
                bw.write(arr[2] + " ");
            }
        }

        bw.flush();
    }
}
