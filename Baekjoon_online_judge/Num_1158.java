import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }
        int i = 1;
        while (!queue.isEmpty()) {
            if (i % K == 0) {
                list.add(queue.poll());
            } else {
                queue.add(queue.poll());
            }
            i++;
        }
        bw.write("<");
        for (int j = 0; j < list.size(); j++) {
            if (j == list.size() - 1) {
                bw.write(list.get(j) + ">");
            } else {
                bw.write(list.get(j) + ", ");
            }
        }
        bw.flush();
    }
}
