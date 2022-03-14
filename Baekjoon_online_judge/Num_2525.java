import java.io.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);

        int cook = Integer.parseInt(br.readLine());

        min += cook;

        if( min >= 60){
            hour += min / 60;
            min -= (min/60 * 60);
        }
        
         if( hour >= 24){
            hour %= 24;
        }


        bw.write(hour + " " + min);
        bw.flush();

    }
}

