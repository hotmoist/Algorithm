import java.io.*;
import java.util.Arrays;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] arr = br.readLine().split(" ");
        int[] a = new int[3];

        for(int i = 0; i < 3; i++){
            a[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(a);

        for(int i : a){
            bw.write(i + " ");
        }
        bw.flush();

    }
}

