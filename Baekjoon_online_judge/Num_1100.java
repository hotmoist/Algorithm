import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {

        int count = 0;


        for(int i = 0; i < 8; i ++){
            String[] inputArr = br.readLine().split("");
            for(int j = 0; j < 8; j++){
                if(i % 2 == 0){ // 짝수 행인경우
                    if(j % 2 == 0 && inputArr[j].equals("F") ){
                        count++;
                    }
                } else {
                    if(j % 2 == 1 && inputArr[j].equals("F")){
                        count++;
                    }
                }

            }
        }

        bw.write(count + "");
        bw.flush();

    }
}

