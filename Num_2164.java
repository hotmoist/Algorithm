import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] ars) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
        BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter( System.out));
        Queue<Integer> queue = new LinkedList<>();

        int count = Integer.parseInt(br.readLine());
        int tmp = 0;
        int i = 0;

        for (int j = 1; j <= count; j++){
            queue.add(j);
        }

        while(queue.size() != 1) {
            if (i % 2 == 0) {
                queue.remove();
            } else {
                tmp = queue.remove();
                queue.add(tmp);
            }

            i++;
        }

        bw.write(queue.peek() + "");
        bw.flush();

        bw.close();
        br.close();



    }
}
