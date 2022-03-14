import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        int testCase = Integer.parseInt(br.readLine());
        String input;
        String[] inputArr;

        for(int i = 0; i < testCase; i++){
            input = br.readLine();
            inputArr = input.split(" ");

            int a = Integer.parseInt(inputArr[0]);
            int b = Integer.parseInt(inputArr[1]);

            int result = a;
            for(int j = 1; j < b; j++){
                    result = result * a % 10;
                    if( result == 0){
                        result = 10;
                    }
            }

            bw.write(result + "\n");
        }

        bw.flush();
    }
}

