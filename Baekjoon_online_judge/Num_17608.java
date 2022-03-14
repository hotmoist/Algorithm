import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[]) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();

        for(int i = 0; i < testCase; i++){
            s.push(Integer.parseInt(br.readLine()));
        }

        int max = 0;
        int count = 0;

        while(!s.empty()){
            int i = s.pop();

            if(i > max){
                max = i;
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
