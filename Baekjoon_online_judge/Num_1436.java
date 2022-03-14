import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));

    public static void main(String args[]) throws  IOException {
       int count = Integer.parseInt(br.readLine());
       int t = 666;

       while(count != 1){
          t += 1;
          String temp = t+"";
          if(temp.contains("666")){
              count--;
          }
       }
        
       bw.write(t+"");
       bw.flush();
    }

}
