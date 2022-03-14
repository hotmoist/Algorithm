import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String[] command = br.readLine().split("");
            int len = Integer.parseInt(br.readLine());
            String input = br.readLine();
            input = input.substring(1, input.length() - 1);
            String[] arr = input.split(",");
            if(len != 0) {
                func1(command, arr);
            }else {
                // for test case : 1 R 0 [] 
                boolean flag = true;

                for(int j = 0; j < command.length; j++){
                    if(command[j].equals("D")){
                        bw.write("error\n");
                        flag = false;
                        break;
                    }
                }

                if(flag){
                    bw.write("[]\n");
                }
            }
            bw.flush();
        }
    }

    static void func1(String[] command, String[] arr) throws IOException {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        boolean straight = true;

        for (int i = 0; i < arr.length; i++) {
            try {
                deque.add(Integer.parseInt(arr[i]));
            } catch (Exception e) {
                bw.write("error\n");
                return;
            }
        }

        for (int i = 0; i < command.length; i++) {
            if (command[i].equals("R")) {
                straight = !straight;
            } else {
                if (deque.isEmpty()) {
                    bw.write("error\n");
                    return;
                }

                if (straight) {
                    deque.removeFirst();
                } else {
                    deque.removeLast();
                }
            }
        }
        bw.write("[");
        while (!deque.isEmpty()) {
            if (straight) {
                if (deque.size() == 1) {
                    bw.write(deque.pollFirst() + "");
                } else {
                    bw.write(deque.pollFirst() + ",");
                }
            } else {
                if (deque.size() == 1) {
                    bw.write(deque.pollLast() + "");
                } else {
                    bw.write(deque.pollLast() + ",");
                }
            }
        }
        bw.write("]\n");
    }
}
