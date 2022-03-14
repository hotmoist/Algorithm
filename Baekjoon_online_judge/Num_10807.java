import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       int size = Integer.parseInt(br.readLine());
       int[] arr = new int[size];
       String[] input = br.readLine().split(" ");
       for(int i = 0; i < input.length; i++){
           arr[i] = Integer.parseInt(input[i]);
       }
       int target = Integer.parseInt(br.readLine());
       int count = 0;
       for(int i = 0; i < size; i++){
           if(arr[i] == target){
               count++;
           }
       }

        System.out.println(count);
    }
}
