import java.io.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        MyQueue queue = new MyQueue();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            String input = br.readLine();
            String[] arr = input.split(" ");

            if(arr[0].equals("push")){
                queue.push(Integer.parseInt(arr[1]));
            }
            if ( arr[0].equals("front")){
                bw.write(queue.front() + "" + "\n");
            }
            if( arr[0].equals("back")){
                bw.write(queue.back() + ""+ "\n");
            }
            if ( arr[0].equals("size")){
                bw.write(queue.size() + ""+ "\n");
            }
            if ( arr[0].equals("empty")){
                bw.write( queue.empty() + ""+ "\n");
            }
            if ( arr[0].equals("pop")){
                bw.write(queue.pop() + ""+ "\n");
            }
        }

        bw.flush();

        bw.close();
        br.close();
    }
}

class MyQueue {
    private LinkedList<Integer> list = new LinkedList<>();

    void push(int x) {
        list.add(x);
    }

    int pop() {
        if (list.isEmpty()) {
            return -1;
        } else {
            int first = list.getFirst();
            list.removeFirst();
            return first;
        }
    }

    int size() {
        return list.size();
    }

    int empty() {
        if (list.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    int front() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.getFirst();
        }
    }

    int back() {
        if (list.isEmpty()) {
            return -1;
        } else {
            return list.getLast();
        }
    }

}
