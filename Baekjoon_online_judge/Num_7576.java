import java.io.*;
import java.util.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String args[]) throws IOException {
        String[] input = br.readLine().split(" ");
        int[][] matrix;
        boolean[][] visit;
        int last_day = 0;
        boolean isFin = true;
        Queue<Point> queue = new LinkedList<>();

        int N = Integer.parseInt(input[1]);
        int M = Integer.parseInt(input[0]);

        matrix = new int[N][M];
        visit = new boolean[N][M];

        for(int i = 0 ; i < N; i++){
            input = br.readLine().split(" ");
            for(int j = 0; j < M; j++){
                matrix[i][j] = Integer.parseInt(input[j]);
                if (matrix[i][j] == 1){
                    queue.add(new Point(i, j));
                }
            }
        }

        while(!queue.isEmpty()){
            Point p = queue.poll();
            int day = p.day;
            try {
                if (visit[p.x][p.y] || matrix[p.x][p.y] == -1)  {
                    continue;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                continue;
            }



            visit[p.x][p.y] = true;
            last_day = Math.max(last_day, day);

            if(matrix[p.x][p.y] == 0){
                matrix[p.x][p.y] = 1;
            }

            queue.add(new Point(p.x + 1, p.y, day+1 ));
            queue.add(new Point(p.x - 1, p.y, day+1 ));
            queue.add(new Point(p.x , p.y + 1, day+1 ));
            queue.add(new Point(p.x, p.y -1, day+1 ));
        }


        for(int i = 0; i < N; i++){
            for(int j = 0; j< M; j++){
                if(matrix[i][j] == 0){
                    isFin = false;
                    break;
                }
            }
        }

        if(isFin){
            bw.write(last_day + "");
        }else{
            bw.write("-1");
        }
        bw.flush();

    }

    static private class Point{
        int x, y;
        int day = 0;

        public Point(int _x, int _y){
            this.x = _x;
            this.y = _y;
        }

        public Point(int _x, int _y, int _day){
            this.x = _x;
            this.y = _y;
            this.day = _day;
        }
    }


}
