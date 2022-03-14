import java.io.*;
import java.util.*;


public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] expression = br.readLine().split("-");
        long result = 0;

        for(int i = 0; i < expression.length; i++){
            String s = expression[i];

            if(checkPlus(s)){
                expression[i] = plus(s) +"";
            }

            if(i == 0){
                result += Integer.parseInt(expression[0]);
            }
        }

        for(int i = 1; i < expression.length; i++){
            result -= Integer.parseInt(expression[i]);
        }

        bw.write(result + "");
        bw.flush();
    }


    static int plus(String s){
       String[] temp = s.split("\\+");
       int resultOfPlus = 0;

       for(String t : temp){
           resultOfPlus += Integer.parseInt(t);
       }

       return resultOfPlus;
    }


    static boolean checkPlus(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '+'){
                return true;
            }
        }

        return false;
    }
}
