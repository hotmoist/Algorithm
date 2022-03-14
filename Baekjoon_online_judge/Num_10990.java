import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        static String[][] matrix;
        static int num;

    public static void main(String args[]) throws IOException {
       num = Integer.parseInt(br.readLine());

       matrix = new String[num+1][2*num + 2];

       for(int i = 1; i <= num; i++){
           for(int j = 1; j <= num+ (i-1); j++){
               if( j == num - (i-1) || j == num + (i-1)){
                   matrix[i][j] = "*";
               } else {
                   matrix[i][j] = " ";
               }
           }
       }
       for(int i = 1; i <= num; i++){
           for(int j = 1; j <= num + (i-1); j++){
               bw.write(matrix[i][j]);
           }
           if(i < num)
            bw.write("\n");
       }

       bw.flush();



    }


}
