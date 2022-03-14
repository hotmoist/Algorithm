import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));
    static boolean[][] matrix;
    static int min = 999999999;

    public static void main(String args[]) throws  IOException {
        String[] input = br.readLine().split(" ");
        int row = Integer.parseInt(input[0]);
        int col = Integer.parseInt(input[1]);
        matrix = new boolean[row][col];

        for(int i = 0; i < row; i++){
            input = br.readLine().split("");
            for(int j = 0; j < col; j++){
                if(input[j].equals("W")){
                    matrix[i][j] = true;
                }else {
                    matrix[i][j] = false;
                }
            }
        }

        int end_x = row - 8;
        int end_y = col - 8;


        for(int x = 0; x <= end_x; x++){
            for(int y = 0; y <= end_y; y++){
                check(x,y);
            }
        }

        bw.write(min+"");
        bw.flush();
    }

    static void check(int x, int y){
        int end_x = x + 8;
        int end_y = y + 8;
        int count = 0;
        boolean tp = matrix[x][y];

        for(int i = x; i < end_x; i++){
            for(int j = y; j < end_y; j++){
                if(tp != matrix[i][j]){
                    count++;
                }

                tp = !tp;
            }
            tp = !tp;
        }

        count = Math.min(count, 64 - count);

        min = Math.min(count, min);
    }
}
