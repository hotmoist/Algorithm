import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       int t = Integer.parseInt(br.readLine());
       PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
       for(int i = 0; i <t; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0 ){
                if(priorityQueue.size() == 0) {
                    bw.write("0\n");
                }else {
                    bw.write(priorityQueue.poll() + "\n");
                }
            }else {
                priorityQueue.add(input);
            }
       }
       bw.flush();
    }
}
