import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
    static int[][] matrix;

    public static void main(String args[]) throws IOException {
        int row = Integer.parseInt(br.readLine());
        int col = row;
        matrix = new int[row + 1][col + 1];

        for (int i = 1; i <= row; i++) {
            String input = br.readLine();
            String[] inputArr = input.split("");
            for (int j = 1; j <= col; j++) {
                matrix[i][j] = Integer.parseInt(inputArr[j - 1]);
            }
        }

        int tmp = (int) (Math.log(row) / Math.log(2));

        quadTree(tmp, 1, 1);

        bw.flush();
    }

    static void quadTree(int n, int x, int y) throws IOException {
        int oneCount = 0;
        int zeroCount = 0;
        int elem = (int) (Math.pow(2, n) * Math.pow(2, n));

        if (n < 1) {
            elem = 1;
            for (int i = x; i <= x ; i++) {
                for (int j = y; j <= y ; j++) {
                    if (matrix[i][j] == 1) {
                        oneCount++;
                    } else if (matrix[i][j] == 0) {
                        zeroCount++;
                    }
                }
            }

            if (oneCount == elem) {
                bw.write("1");
            } else if (zeroCount == elem) {
                bw.write("0");
            }

        } else {
            for (int i = x; i <= x + Math.pow(2, n) - 1; i++) {
                for (int j = y; j <= y + Math.pow(2, n) - 1; j++) {
                    if (matrix[i][j] == 1) {
                        oneCount++;
                    } else if (matrix[i][j] == 0) {
                        zeroCount++;
                    }
                }
            }


            if (oneCount == elem) {
                bw.write(1+"");
            } else if (zeroCount == elem) {
                bw.write(0 + "");
            } else {
                 bw.write("(");
                quadTree(n - 1, x, y);
                quadTree(n - 1, x, y+(int) (Math.pow(2, n - 1)));
                quadTree(n - 1, x + (int) (Math.pow(2, n - 1)), y);
                quadTree(n - 1, x+(int) (Math.pow(2, n - 1)), y+(int) (Math.pow(2, n - 1)));

             bw.write(")");
            }

        }
    }

}


