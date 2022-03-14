import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        Stack <String> left = new Stack<>();    // 왼쪽
        Stack<String> right = new Stack<>();    // 오른쪽
        String c;
        String[] str_input_arr = br.readLine().split("");

        for(String s : str_input_arr){
            left.push(s);
        }

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            c = st.nextToken();
            switch (c) {
                case "L" :
                    if(!left.isEmpty()){
                        right.push(left.pop());
                    }
                    break;
                case "D" :
                    if(!right.isEmpty()){
                        left.push(right.pop());
                    }
                    break;

                case "B":
                    if(!left.isEmpty()){
                        left.pop();
                    }
                    break;

                case "P":
                    left.push(st.nextToken());
                    break;
            }

        }
        while(!left.isEmpty()){
            right.push(left.pop());
        }

        while(!right.empty()){
           bw.write(right.pop() + "");
        }
        bw.flush();
    }
}
