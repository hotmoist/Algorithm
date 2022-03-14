import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] ars) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue<Integer> queue = new LinkedList<>();

        String input = br.readLine();
        String[] info = input.split(" ");

        int N = Integer.parseInt(info[0]);
        int K = Integer.parseInt(info[1]);
        int count = 1;
        bw.write("<");

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            if (count % K == 0) {
                if (queue.size() == 1) {
                    bw.write(queue.remove() + "");
                } else {
                    bw.write(queue.remove() + "" + ", ");
                }
                count++;
            } else {
                queue.add(queue.remove());
                count++;
            }
        }

        bw.write(">");
        bw.flush();
    }
}
