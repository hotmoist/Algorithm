import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        int num = 0;

        while(t-- > 0){
            int val = Integer.parseInt(br.readLine());
            if(val > num){
                for(int i = num+1; i <= val; i++){
                    stack.push(i);
                    sb.append("+\n");
                }
                num = val;
            }else if(val != stack.peek()){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append("-\n");
        }

        System.out.println(sb.toString());
    }
}
