import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));

    public static void main(String args[]) throws IOException{
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= 2*n-1; i++){
            for(int j =1 ; j <= n; j++){
               if( i<=n && j<= i){
                   bw.write("*");
               }
               else if (i > n && j <= 2*n-i){
                   bw.write("*");
               } 
            }
            if(i < 2*n-1) {
                bw.write("\n");
            }
        }

        bw.flush();
    }
}
