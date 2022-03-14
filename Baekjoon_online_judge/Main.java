package baekjoon;

import java.io.*;

public class Main {
    BufferedReader br;
    BufferedWriter bw;

    {
        solve();
    }

    String readLine() {
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            return br.readLine();
        } catch (IOException e) {
            return null;
        }
    }


    void solve() {

    }


    public static void main(String args[]) throws IOException {
        new Main();
    }
}
