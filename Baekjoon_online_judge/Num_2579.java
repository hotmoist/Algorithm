import java.io.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[]) throws IOException {
        int stairs = Integer.parseInt(br.readLine());

        int[] d = new int[stairs + 1];
        int[] score = new int[stairs + 1];

        for (int i = 1; i <= stairs; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        // 점화식을 코드로 옮겨 작성한다.
        
        d[1] = score[1];

        if (stairs >= 2) {
            d[2] = score[2] + d[1];
        }

        for (int i = 3; i <= stairs; i++) {

            d[i] = Math.max(d[i-3] + score[i-1] + score[i], d[i-2] + score[i]);
        }

        bw.write(d[stairs] + "");
        bw.flush();
    }
}


