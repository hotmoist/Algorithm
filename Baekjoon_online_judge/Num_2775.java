import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
       
        int[][] matrix = new int[15][15];

        for (int i = 0; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                if (i == 0) {
                    matrix[i][j] = j;
                } else if (j == 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
                }
            }
        }

       


        int testCase = Integer.parseInt(br.readLine());

        for (int t = 0; t < testCase; t++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(matrix[k][n] + "" + "\n");
        }

        bw.flush();
    }
}
