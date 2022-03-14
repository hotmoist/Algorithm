import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        String s;
        while (!(s = br.readLine()).equals("0")) {
            String[] arr = s.split("");
            boolean isPal = true;

            for (int i = 0; i < s.length() / 2; i++) {
                if (arr[i].equals(arr[s.length()-1 - i])) {
                    continue;
                } else {
                    isPal = false;
                    break;
                }
            }

            if(isPal){
                bw.write("yes\n" );
            }else {
                bw.write("no\n");
            }
        }

        bw.flush();
    }
}

