import java.io.*;
class Main{

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));

    public static void main(String args[]) throws IOException {

        int n = Integer.parseInt( br.readLine());

        long[] d = new long[n+1];

        for(int i =1; i <= n; i++){
            if(i < 3 ){
                d[i] = 1;
            } else {
                d[i] = d[i-1] + d[i-2];
            }
        }

        bw.write(d[n] +"");
        bw.flush();
    }
}
