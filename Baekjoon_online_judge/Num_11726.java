import java.io.*;

public class Main {
    int[] d;

    {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {

            int n = Integer.parseInt(br.readLine());

            bw.write(solve(n) + "");
            bw.flush();

        } catch (IOException e) {
        }
    }

    int solve(int n) {
        d = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i < 2) {
                d[i] = 1;
            } else {
                d[i] = (d[i-1] + d[i-2]) % 10007;
            }
        }


        return d[n];
    }

    public static void main(String args[]) throws IOException {
        new Main();
    }
}

