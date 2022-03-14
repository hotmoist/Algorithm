import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[]) throws IOException {
       int testCase = Integer.parseInt(br.readLine());
       String[] words = new String[testCase];
       StringBuilder sb = new StringBuilder();

       for(int i = 0; i < testCase; i++){
            words[i] = br.readLine();
       }

       int length = words[0].length();
       boolean flag = true;

       for(int i = 0; i < length; i++){

           char tmp = words[0].charAt(i);
           flag = true;

           for(int j = 1; j < testCase; j++){

               if(tmp != words[j].charAt(i)) {
                   flag = false;
               }
           }

           if(flag){
               sb.append(tmp);
           }else {
               sb.append("?");
           }
       }

       bw.write(sb.toString());
       bw.flush();
    }
}

