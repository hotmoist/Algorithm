import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int oneCount = 0;
    static int zeroCount = 0;

    public static void main(String args[]) throws IOException {

        int M = Integer.parseInt(br.readLine());
        int[][] m = new int[M + 1][M + 1];
        String input;
        String[] inputArr;

        for (int i = 1; i < M + 1; i++) {
            input = br.readLine();
            inputArr = input.split(" ");

            for (int j = 1; j < M + 1; j++) {
                m[i][j] = Integer.parseInt(inputArr[j - 1]);
            }
        }


        find(m, 1, 1, M);
        bw.write(zeroCount + "" + "\n" + oneCount + "");
        bw.flush();
    }

    public static void find(int[][] m, int x, int y, int max) {
        int isOne = 0;
        int isZero = 0;

        if ( max == 1){
            if (m[x][y] == 1){
                oneCount++;
                return;
            } else {
                zeroCount++;
                return;
            }
        }

        for (int i = x; i < x + max; i++) {
            for (int j = y; j < y + max; j++) {
                if (m[i][j] == 1) {
                    isOne++;
                } else {
                    isZero++;
                }
            }
        }

        if( isOne == max*max){
            oneCount++;
        } else if (isZero == max*max){
            zeroCount++;
        } else  {
            find(m, x, y, max/2);
            find(m, x + max/2, y, max/2 );
            find(m, x,  y + max/2, max/2);
            find(m, x + max/2,  y + max/2, max/2);

        }

    }
}
