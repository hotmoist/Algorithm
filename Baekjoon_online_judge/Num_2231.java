import java.io.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));


    public static void main(String args[]) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int con;
        int test = 0;
        String[] num;
        for(int i = 1 ; i < N; i++){
            con = 0;
            test = i;
            String s = test + "";
            num = s.split("");
            con += test;
            for(int j = 0; j < num.length; j++){
                con += Integer.parseInt(num[j]);
            }

            if (con == N){
                break;
            } else if ( test+1 == N){
                test = 0;
                break;
            }

        }

        bw.write(test + "");
        bw.flush();


    }
}


