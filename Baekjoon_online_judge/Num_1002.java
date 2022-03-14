import java.io.*;
import java.util.Arrays;

public class Main {
    static double dist(int x1, int y1, int x2, int y2){
       return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2- y1, 2));
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));
        int x1, x2, y1 , y2 ;
        int r1, r2;
        double r3 = 0;
        double[] distArr = new double[3];

        x1 = x2 = y1 = y2 = 0;
        r1 = r2 = 0;
        int tesstCase = Integer.parseInt(br.readLine());

        for(int test = 0; test < tesstCase; test++){
            String input = br.readLine();
            String[] inputArr = input.split(" ");
            int[] info = new int[inputArr.length];

            for(int i = 0; i < inputArr.length; i++){
                info[i] = Integer.parseInt(inputArr[i]);
            }

            x1 = info[0]; y1 = info[1]; r1 = info[2]; x2 = info[3]; y2 = info[4]; r2 = info[5];
            r3 = dist(x1, y1, x2, y2);

            distArr[0] = r1; distArr[1] = r2; distArr[2] = r3;

            Arrays.sort(distArr);

            if(r3 == 0 && r1 == r2){
                bw.write(-1 + "" + "\n");
            }
            else if(distArr[2] < (distArr[1] + distArr[0])){
                bw.write(2+"" + "\n");
            } else if (distArr[2] == (distArr[1] + distArr[0])){
                bw.write(1 + "" + "\n");
            } else if (distArr[2] > (distArr[1] + distArr[0])){
                bw.write(0 + ""+ "\n");
            }
        }
        bw.flush();
    }
}
