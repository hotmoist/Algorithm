import java.io.*;
import java.util.Arrays;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        String[] input = br.readLine().split(" ");

        for(int i = 0; i < input.length; i++){
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++){
            bw.write(arr[i] + " ");
        }
        bw.flush();
    }


}
