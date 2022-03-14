import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int t = Integer.parseInt(br.readLine());
        ArrayDeque<Pair> deque = new ArrayDeque<>();
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < input.length; i++){
            deque.add(new Pair(i+1,Integer.parseInt(input[i])));
        }

        find(deque);
    }
    static void find(ArrayDeque<Pair> deque){
        int answer = deque.peekFirst().key;
        int val = deque.remove().value;

        while(!deque.isEmpty()){
            System.out.print(answer+ " ");

            if(val > 0){
                for(int i = 0; i < val-1; i++){
                    deque.addLast(deque.removeFirst());
                }
            } else {
                for(int i = 0; i > val; i--){
                    deque.addFirst(deque.removeLast());
                }
            }

            answer = deque.peekFirst().key;
            val = deque.remove().value;
        }

        System.out.print(answer);
    }

    static class Pair{
        int key, value;
        Pair(int key_, int value_){
            this.key = key_;
            this.value = value_;
        }
    }
    static void print(ArrayDeque<Pair> deque){
        Iterator<Pair> iter = deque.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next().value + " ");
        }
    }
}
