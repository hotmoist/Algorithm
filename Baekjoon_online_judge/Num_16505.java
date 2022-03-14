import java.io.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int col = (int) Math.pow(2, n);
        String[][] matrix = new String[col + 1][col + 1];

        rec(matrix, 1, 1, n);



        for(int i = 1; i < col+1; i++){
            for(int j = 1; j < col+1; j++){
                if(matrix[i][j] == null)
                    matrix[i][j] = " ";
            }
        }

        for(int i = 1; i < col + 1; i++){
            for(int j = 1; j <= col + 1 - i; j++){
                bw.write(matrix[i][j]);

            }
            if( i == col ){
                continue;
            }
            bw.write("\n");
        }

        bw.flush();

    }

    static void rec(String[][] mat, int x, int y, int n) {
        int N = (int) Math.pow(2, n - 1);

        if (n == 0) {
            mat[y][x] = "*";
        }
        else if (n == 1) {
            for (int i = y + N ; i >= y; i--) {
                for (int j = x; j <= x + N; j++) {
                    if( i == y+N && j == x + N){
                        continue;
                    }
                    mat[i][j] = "*";
                }
            }
        } else {

            rec(mat, x, y, n - 1);
            rec(mat, x + N, y, n - 1);
            rec(mat, x, y + N, n - 1);

        }
    }
}

