import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        String s = br.readLine();
        StringBuilder b = new StringBuilder();

        for(int i = 0; i <s.length(); i++){
            char c = ' ';
            char n = ' ';


            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){

                c = s.charAt(i);
                n = (char)(c-32);

            } else if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
                c = s.charAt(i);
                n = (char)(c + 32);
            }

            b.append(n);
        }

        bw.write(b.toString() + "");
        bw.flush();



    }
}

