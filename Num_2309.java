import java.io.*;
import java.util.Arrays;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int[] list = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            list[i] = Integer.parseInt(br.readLine());
            sum += list[i];
        }

        for (int i = 0; i < 9; i++) {
            boolean isbreak = false;
            
            for (int j = i+1; j < 9; j++) {

                if( sum - list[i] - list[j] == 100){
                    list[i] = 0;
                    list[j] = 0;
                    isbreak = true;
                    break;
                }
            }
            
            if(isbreak){
                break;
            }
        }

        Arrays.sort(list);

        for(int i = 0; i < 9; i++){
            if(list[i] == 0){
                continue;
            }
            bw.write(list[i] + "\n");
        }

        bw.flush();
    }
}

