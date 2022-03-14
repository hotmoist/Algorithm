import java.io.*;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String input = br.readLine();
        String[] inputArr = input.split(" ");
        boolean isValid = true;
        int pd = 1;
        int movement = 0;
        int x = 0, y = 0;
        int[] mov = {0, 1, 1, -1, -1};
        int[] lr = {1, -1};

        int max = Integer.parseInt(inputArr[0]);
        int count = Integer.parseInt(inputArr[1]);

        for (int i = 0; i < count; i++) {
            input = br.readLine();
            inputArr = input.split(" ");
            // Move 0 == left 90, Move 1 == Right 90
            if (inputArr[0].equals("TURN")) {
                if (inputArr[1].equals("0") && pd == 1) {
                    movement = lr[0];
                    pd = 2;
                } else if (inputArr[1].equals("0") && pd == 2) {
                    movement = lr[1];
                    pd = 3;
                } else if (inputArr[1].equals("0") && pd == 3) {
                    movement = lr[1];
                    pd = 4;
                } else if (inputArr[1].equals("0") && pd == 4) {
                    movement = lr[0];
                    pd = 1;
                }

                if (inputArr[1].equals("1") && pd == 1) {
                    movement = lr[1];
                    pd = 4;
                } else if (inputArr[1].equals("1") && pd == 2) {
                    movement = lr[0];
                    pd = 1;
                } else if (inputArr[1].equals("1") && pd == 3) {
                    movement = lr[0];
                    pd = 2;
                } else if (inputArr[1].equals("1") && pd == 4) {
                    movement = lr[1];
                    pd = 3;
                }
            } else if (inputArr[0].equals("MOVE")) {
                for (int j = 0; j < Integer.parseInt(inputArr[1]); j++) {
                    if (pd == 1) {
                        x += mov[pd];
                    }
                    if (pd == 2) {
                        y += mov[pd];
                    }
                    if (pd == 3) {
                        x += mov[pd];
                    }
                    if (pd == 4) {
                        y += mov[pd];
                    }
                }

            }

            if (x > max || y > max || x < 0 || y < 0) {

                isValid = false;

            }
        }
        if(isValid) {
            bw.write(x + "" + " " + y + "");
        }else {
            bw.write("-1");
        }
        bw.flush();
    }
}
