import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       int t = Integer.parseInt(br.readLine());
       int count = 0;

       for(int i = 0 ; i < t; i++){
           String s = br.readLine();
           Stack<Character> stack = new Stack<>();

           for(int j = 0; j <s.length(); j++){
               char c = s.charAt(j);
               if(!stack.empty() && stack.peek() == c){
                   stack.pop();
               }else {
                   stack.push(c);
               }
           }

           if (stack.empty()){
               count++;
           }
       }
       bw.write(count + "");
       bw.flush();
    }
}
