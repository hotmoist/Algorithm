import java.io.*;


class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");

        int hour = Integer.parseInt(input[0]);
        int min = Integer.parseInt(input[1]);
        int second = Integer.parseInt(input[2]);

        int time = Integer.parseInt(br.readLine());

        second += time;

        if(second >= 60){
            min += second/60;
            second -= (second/60 * 60);
        }

        if( min >= 60){
            hour += min / 60;
            min -= (min/60 * 60);
        }

        if( hour >= 24){
            hour %= 24;
        }

        bw.write(hour + " " + min + " " + second);
        bw.flush();

    }
}
