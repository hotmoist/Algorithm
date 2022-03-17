import java.io.*;
import java.util.*;

public class Main {

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        int q_size = Integer.parseInt(input[0]);
        int nums = Integer.parseInt(input[1]);
        int answer = 0;
        LinkedList<Integer> deque = new LinkedList<>();

        for (int i = 1; i <= q_size; i++) {
            deque.add(i);
        }

        input = br.readLine().split(" ");

        for (String s : input) {
            int target_index = deque.indexOf(Integer.parseInt(s));
            int target = Integer.parseInt(s);
            int mid = 0;

            if (deque.size() % 2 == 0) {
                mid = deque.size() / 2 - 1 ;
            } else {
                mid = deque.size() / 2;
            }

            if (deque.peekFirst() == target) {
                deque.pollFirst();
            } else {
                while (deque.peekFirst() != target) {
                    if (mid >= target_index) {
                        deque.addLast(deque.pollFirst());
                        answer++;
                    } else {
                        deque.addFirst(deque.pollLast());
                        answer++;
                    }
                }
                deque.pollFirst();
            }
        }

        bw.write(answer + "");
        bw.flush();

    }
}

