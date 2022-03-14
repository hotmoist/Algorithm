import java.io.*;
import java.util.*;


public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int totalTime = Integer.parseInt(br.readLine());
        int[] abc = new int[3];
        Queue<Integer> buttonTime = new LinkedList<>(insertTime());

        for(int i = 0; i < 3; i++){
            abc[i] = totalTime/buttonTime.peek();
            totalTime %= buttonTime.remove();
        }

        if(totalTime == 0){
            bw.write(abc[0] + " " + abc[1] + " " + abc[2]);
        } else {
            bw.write("-1");
        }

        bw.flush();
    }

    static Queue<Integer> insertTime() {
        Queue<Integer> buttonTime = new LinkedList<>();
        buttonTime.offer(300);
        buttonTime.offer(60);
        buttonTime.offer(10);

        return buttonTime;
    }
}
