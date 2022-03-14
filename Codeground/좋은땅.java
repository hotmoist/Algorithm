import java.util.Scanner;

public class Solution {
    static int Answer;

    public static void main(String argsp[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int row, col;
        String[] input;
        int[][] ground;

        int T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 0; test_case < T; test_case++) {

            Answer = 0;
            input = sc.nextLine().split(" ");


            row = Integer.parseInt(input[0]);
            col = Integer.parseInt(input[1]);

            ground = new int[row][col];

            for (int i = 0; i < row; i++) {
                input = sc.nextLine().split(" ");

                for (int j = 0; j < input.length; j++) {
                    ground[i][j] = Integer.parseInt(input[j]);
                }
            }

            int temp;

            for (int i = 0; i <= row - 5; i++) {
                for (int j = 0; j <= col - 5; j++) {
                    temp = 0;

                    for (int a = i; a < i + 5; a++) {
                        for (int b = j; b < j + 5; b++) {
                            temp += ground[a][b];
                        }
                    }
                    Answer = Math.max(temp, Answer);
                }
            }


            System.out.println("Case #" + (test_case + 1));
            System.out.println(Answer);
        }
    }
}
