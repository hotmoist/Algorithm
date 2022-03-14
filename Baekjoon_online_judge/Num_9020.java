import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        ArrayList<Integer> primeNum;

        for (int t = 0; t < testCase; t++) {
            int input = Integer.parseInt(br.readLine());
            primeNum = new ArrayList<>(findPri(input));
            goldPart(primeNum, input);
        }

    }

    static void goldPart(ArrayList<Integer> p, int input) {
        int min = Integer.MAX_VALUE;
        int min_a = 0, min_b = 0;
        for (int i = 0; i < p.size(); i++) {
            if (p.contains(input - p.get(i))) {
                int a = p.get(i);
                int b = input - p.get(i);
                if (Math.abs(b - a) < min) {
                    min = b - a;
                    min_a = a;
                    min_b = b;
                }
            }
        }
        System.out.println(min_a + " " + min_b);
    }

    static ArrayList<Integer> findPri(int t) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] pri;
        loop:
        for (int x = 2; x <= t; x++) {
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    continue loop;
                }
            }
            list.add(x);
        }


        return list;
    }
}
