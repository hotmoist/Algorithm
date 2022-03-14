import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        int c = Integer.parseInt(br.readLine());

        for(int i = 1; i <= c; i++){
            if(i % 2 != 0){
                for(int j = 0; j < c; j++ ){
                    bw.write("* ");
                }
                bw.write("\n");
            } else {
                for(int j = 0; j < c; j++){
                    bw.write(" *");
                }
                bw.write("\n");
            }
        }

        bw.flush();
    }
}

