import java.util.*;
import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String input;
        String[] inputArr;
        int[] a = new int[N];
        int[] b = new int[N];
        int sum = 0;

        input = br.readLine();
        inputArr = input.split(" ");
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(inputArr[i]);
        }

        input = br.readLine();
        inputArr = input.split(" ");
        for (int i = 0; i < N; i++) {
            b[i] = Integer.parseInt(inputArr[i]);
        }

        Arrays.sort(a);
        ArrayList<Integer> list = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            list.add(b[i]);
        }
        Collections.sort(list, Comparator.reverseOrder());
        for(int i = 0; i < N; i++){
            sum += (a[i] * (list.get(i)));
        }

        bw.write(sum + "");
        bw.flush();
    }
}
