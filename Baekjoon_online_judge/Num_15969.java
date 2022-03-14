import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr;
        int students = Integer.parseInt(br.readLine());
        String info = br.readLine();
        String[] infoArr = info.split(" ");

        arr = new int[students];


        for(int i = 0; i < students; i++ ){
            arr[i] = Integer.parseInt(infoArr[i]);
        }

        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i < students; i++){
            if (arr[i] >= max)
                max = arr[i];
            else if (arr[i] < min)
                min = arr[i];
        }

        bw.write(max - min + "");
        bw.flush();
    }
}
