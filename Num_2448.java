import java.io.*;
class Main{

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));
    static String[][] matrix;

    public static void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());

        matrix = new String[n+1][n*2];

        rec(1, n, n);

        for(int i = 1; i < n+1; i++){
            for(int j =1; j < n*2; j++){
                if(matrix[i][j] == null){
                    bw.write(" ");
                }else {
                    bw.write(matrix[i][j]);
                }
            }

            bw.write("\n");
        }

        bw.flush();


    }

    static void rec(int a, int b, int n){

        if(n == 3){
            for(int i =a ; i <= a+2; i++ ){
                for(int j = b-2; j <= b+2; j++){
                    if( i % 3 == 1 && j % 3 == 0){
                        matrix[i][j] = "*";
                    }

                    if( i % 3 == 2 && (j == b-1 || j == b+1) ){
                        matrix[i][j] = "*";
                    }

                    if(i % 3 == 0){
                        matrix[i][j] = "*";
                    }
                }
            }
        } else {
            rec(a, b, n/2);
            rec(a + n/2, b - n/2, n/2);
            rec(a + n/2, b + n/2, n/2 );
        }


    }
}

