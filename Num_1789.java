import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        long s = Long.parseLong(br.readLine());

        long count = 0;

        long sum = 0;

        for(long  i = 1; i <= s; i++){
            sum += i;

            if(sum <= s){
                count++;
            } else {
                break;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
