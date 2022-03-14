import java.io.*;
import java.util.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       int t = Integer.parseInt(br.readLine());
       String[] arr = new String[t];

       for(int i = 0 ; i < t; i++){
           arr[i] = br.readLine();
       }

       Arrays.sort(arr, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
               if(o1.length() != o2.length()) {
                   if (o1.length() > o2.length()) {
                       return 1;
                   } else {
                       return -1;
                   }
               }else {
                    if (str_int(o1) > str_int(o2)){
                        return 1;
                    }else if(str_int(o1) < str_int(o2)) {
                        return -1;
                    } else {
                        return o1.compareTo(o2);
                    }
               }
           }
       });

       print(arr);
    }

    static int str_int(String s){
        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            if(isInteger(s.charAt(i))){
              sum += s.charAt(i) - '0';
            }
        }

        return sum;
    }

    static boolean isInteger(char c){
       return c>='0' && c <= '9';
    }

    static void print(String[] arr){
        for (String s : arr){
            System.out.println(s);
        }
    }
}
