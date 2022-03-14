import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        for(int i = 0; i < 3; i++){
            String[] input = br.readLine().split(" ");

            int count = 0;

            for(int j = 0; j < 4; j++){
                if(input[j].equals("1")){
                    count++;
                }
            }

            switch (count){
                case 0 :
                    bw.write("D\n");
                    break;
                case 1 :
                    bw.write("C\n");
                    break;
                case 2 :
                    bw.write("B\n");
                    break;

                case 3 :
                    bw.write("A\n");
                    break;

                case 4 :
                    bw.write("E\n");
                    break;
            }

        }

        bw.flush();
    }
}

