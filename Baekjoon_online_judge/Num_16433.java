import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[][] mat;

        String[] inputArr = br.readLine().split(" ");

        int n = Integer.parseInt(inputArr[0]);
        mat = new String[n + 1][n + 1];

        int i = Integer.parseInt(inputArr[1]);
        int j = Integer.parseInt(inputArr[2]);

        if ((i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0)) {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
                        mat[a][b] = "v";
                    } else {
                        mat[a][b] = ".";
                    }
                }
            }
        } else {
            for (int a = 1; a <= n; a++) {
                for (int b = 1; b <= n; b++) {
                    if ((a % 2 == 0 && b % 2 == 0) || (a % 2 != 0 && b % 2 != 0)) {
                        mat[a][b] = ".";
                    } else {
                        mat[a][b] = "v";
                    }
                }
            }
        }

        for(int a = 1; a <= n; a++){
            for(int b =1; b <= n; b++){
                bw.write(mat[a][b]);
            }
            bw.write("\n");
        }
        bw.flush();
    }
}
