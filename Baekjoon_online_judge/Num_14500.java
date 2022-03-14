import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    static int max = 0;
    static int[][] matrix;
    static int n = 0;
    static int m = 0;

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;

        input = br.readLine();
        inputArr = input.split(" ");

        n = Integer.parseInt(inputArr[0]);
        m = Integer.parseInt(inputArr[1]);

        matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            input = br.readLine();
            inputArr = input.split(" ");

            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(inputArr[j]);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                search(i, j, 1, 0, false, false);
            }
        }

        bw.write(max + "");
        bw.flush();
    }


    static void search(int x, int y, int count, int sum, boolean front, boolean back) {
        int temp = sum;


        if (y >= m || x < 0 || x >= n) {
            return;
        }

        temp += matrix[x][y];

        if (count == 2 && y < m - 1) {
            int flag1 = 0;
            int flag2 = 0;
            int flag3 = 0;

            if (x == 0) {
                flag1 = temp + matrix[x + 1][y] + matrix[x][y + 1];
            }
            if (x > 0 && x < n - 1) {
                if (front && !back) {
                    flag1 = temp + matrix[x + 1][y] + matrix[x][y + 1];
                }
                if (!front && back) {
                    flag1 = temp + matrix[x - 1][y] + matrix[x][y + 1];
                }

                if (!front && !back) {
                    flag1 = temp + matrix[x + 1][y] + matrix[x - 1][y];
                    flag2 = temp + matrix[x + 1][y] + matrix[x][y + 1];
                    flag3 = temp + matrix[x - 1][y] + matrix[x][y + 1];
                }
            }
            if (x == n - 1) {
                flag1 = temp + matrix[x - 1][y] + matrix[x][y + 1];
            }


            if (flag1 > max) {
                max = flag1;
            }
            if (flag2 > max) {
                max = flag2;
            }
            if (flag3 > max) {
                max = flag3;
            }

        }

        if (count == 4) {
            if (temp > max) {
                max = temp;
            }
            return;
        }

        search(x + 1, y, count + 1, temp, true, false);
        search(x - 1, y, count + 1, temp, false, true);
        search(x, y + 1, count + 1, temp, false, false);
    }
}
