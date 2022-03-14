import java.io.*;

public class Main{

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int[][] d;
    static int[][] matrix;

    public static void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        d= new int[n][3];
        matrix = new int[n][3];

        for(int i = 0; i < n; i++){
            String[] inputArr = br.readLine().split(" ");

            for(int j = 0; j < 3; j++){
                matrix[i][j] = Integer.parseInt(inputArr[j]);
            }
        }

        d[0][0] = matrix[0][0];
        d[0][1] = matrix[0][1];
        d[0][2] = matrix[0][2];

        for(int i = 1; i < n; i++){
            d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + matrix[i][0];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2] ) + matrix[i][1];
            d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + matrix[i][2];
        }

        bw.write(Math.min(Math.min(d[n-1][0], d[n-1][1]) , d[n-1][2]) + "");
        bw.flush();

    }
}


