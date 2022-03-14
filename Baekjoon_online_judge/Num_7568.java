import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
              String input;
              String[] inputArr;
              int[][] matrix;

              int N = Integer.parseInt(br.readLine());

              matrix = new int[N+1][3];

              for(int i = 1; i <= N; i++){
                  input = br.readLine();
                  inputArr = input.split( " ");

                  matrix[i][0] = Integer.parseInt(inputArr[0]);
                  matrix[i][1] = Integer.parseInt(inputArr[1]);
              }

              for(int i = 1; i <= N; i++){
                  int place = 1;
                  for(int j = 1; j <= N; j++ ){
                      if(matrix[i][0] < matrix[j][0] && matrix[i][1] < matrix[j][1]){
                          place++;
                      }
                  }

                  matrix[i][2] = place;
              }

              for(int i = 1; i <= N; i++){
                  bw.write(matrix[i][2]+"" + " ");
              }

              bw.flush();


    }
}
