import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int kg = Integer.parseInt(br.readLine());
        int a = 0; // 5kg
        int b = 0; // 3kg

        for(int i = 0; i <= kg/5; i++ ){
            for(int j = 0; j <= kg/3; j++){
                if(kg == (5*i + 3*j) ){
                    a = i;
                    b = j;
                } else if (kg < (5*i + 3 * j)){
                    continue;
                } else {
                    continue;
                }
            }
        }

        if ( a == 0 && b == 0){
            bw.write(-1 + "");
        } else {
            bw.write(a + b + "");
        }
        bw.flush();



    }
}

