import java.io.*;
class Main{

    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));

    public static void main(String args[]) throws IOException {

        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++){

            String input = br.readLine();
            String[] arr = input.split("");

            if(Integer.parseInt(arr[arr.length-1])%2 == 0){
                bw.write("even" + "\n");
            } else {
                bw.write("odd" + "\n");
            }

        }

        bw.flush();
    }
}
