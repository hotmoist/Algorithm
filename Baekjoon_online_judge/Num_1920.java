import java.io.*;
import java.util.HashSet;

public class Main {

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));

    public static void main(String args[]) throws IOException{
        int n = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

       String[] inputArr = br.readLine().split(" ");

       for(int i = 0; i < n; i++){
           set.add(Integer.parseInt(inputArr[i]));
       }

        n = Integer.parseInt(br.readLine());

       inputArr = br.readLine().split(" ");

        for(int i = 0; i < n; i++){
            if (set.contains(Integer.parseInt(inputArr[i]))) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        bw.flush();

    }
}
