import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        if(n == 0){
            bw.write("0");
        }else {
            for (int i = 1; i <= n; i++) {
                if (i % 5 == 0) {

                    if( i % 125 == 0){
                        count += 3;
                        continue;
                    }

                    if(i % 25 == 0 ){
                        count += 2;
                        continue;
                    }


                    count++;
                }
            }

            bw.write(count + "");
        }

        bw.flush();

    }
}

