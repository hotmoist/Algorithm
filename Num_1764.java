import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        HashSet<String> set = new HashSet<>();

        for(int i = 0; i < n; i++ ){
            set.add(br.readLine());
        }

        List<String> list = new LinkedList<>();

        for(int i = 0; i < m; i++) {
            String s = br.readLine();

            if (set.contains(s)) {
                list.add(s);
            }
        }

        Collections.sort(list);

        bw.write(list.size()+"\n");
        for(String i : list){
            bw.write(i + "\n");
        }
        bw.flush();
    }
}

