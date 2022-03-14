import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        String input;
        String[] inputArr;
        int[] cx, cy;
        double[] r;
        int startX, startY, endX, endY;
        int testCase= 0;
        int circles = 0;
        double startDist = 0;
        double endDist = 0;
        int count = 0;

        testCase = Integer.parseInt(br.readLine());
        for(int c = 0; c < testCase; c++) {
            input = br.readLine();
            inputArr = input.split(" ");

            startX = Integer.parseInt(inputArr[0]);
            startY = Integer.parseInt(inputArr[1]);
            endX = Integer.parseInt(inputArr[2]);
            endY = Integer.parseInt(inputArr[3]);

            circles = Integer.parseInt(br.readLine());
            cx = new int[circles];
            cy = new int[circles];
            r = new double[circles];

            for(int i = 0; i < circles; i++){
                input = br.readLine();
                inputArr= input.split(" ");

                cx[i] = Integer.parseInt(inputArr[0]);
                cy[i] = Integer.parseInt(inputArr[1]);
                r[i] = Integer.parseInt(inputArr[2]);
            }

            for (int i = 0; i < circles; i++) {
                startDist = dist(startX, startY, cx[i], cy[i]);
                endDist = dist(endX, endY, cx[i], cy[i]);

                if ((startDist < r[i] || endDist < r[i]) && !(startDist<r[i] && endDist<r[i])) {
                    count++;
                }
            }

            bw.write(count + "" + "\n");
            count = 0;
        }

        bw.flush();



    }

    static double dist(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2 - x1,2) + (int)Math.pow(y2 - y1,2) );

    }
}
