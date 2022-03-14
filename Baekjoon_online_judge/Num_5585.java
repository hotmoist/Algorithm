import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        Queue<Integer> yan = new LinkedList<>(insertYan());
        int price = Integer.parseInt(br.readLine());
        int charge = 1000 - price;
        int count = 0;

        while (!yan.isEmpty()){
            count += charge/yan.peek();
            charge %= yan.remove();
        }

        bw.write(count + "");
        bw.flush();
    }

    static Queue<Integer> insertYan(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(500);
        q.offer(100);
        q.offer(50);
        q.offer(10);
        q.offer(5);
        q.offer(1);

        return q;
    }


}
