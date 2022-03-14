import java.io.*;
import java.util.*;


public class Main {
    static BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
    static BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));
    static int count = 0;
    static boolean[] visit;

    static void search(int start, int end) throws IOException{
        Queue<Integer> q = new LinkedList<>();
        if (start <= end) {
            visit = new boolean[end * 2 + 1];
        } else {
            visit = new boolean[start * 2 + 1];
        }
        int s = start;
        int e = end;
        int rep = 1;
        int tmp = 0;
        int input = 0;

        q.offer(s);


        while(!q.isEmpty()){
            int repTmp = 0;

            for(int i = 1; i <= rep; i++){
                tmp = q.poll();

                if(tmp == e){
                    break;
                }


                for(int j = 1; j <=3; j++){
                    if (j == 1){
                        input = tmp -1;
                        if (tmp > e && visit[input] == false ){
                            q.offer(input);
                            visit[input] = true;
                            repTmp++;
                            break;
                        } else if (input > 0 && visit[input] == false) {

                            q.offer(input);
                            visit[input] = true;
                            repTmp++;
                        }
                    } else if ( tmp < e && j == 2 && visit[tmp+1] == false ){
                        input = tmp +1;

                        q.offer(input);
                        visit[input] = true;
                        repTmp++;
                    } else if (tmp < e && j == 3 && visit[tmp*2] == false) {
                        input = tmp * 2;
                        q.offer(input);
                        visit[input] = true;
                        repTmp++;
                    }
                }
            }
            if (tmp == e){
                bw.write(count+ "");
                break;
            }
            rep = repTmp;
            count++;
        }

    }
    public static void main(String args[]) throws IOException{
        String input = br.readLine();
        String[] info = input.split(" ");
        int start = Integer.parseInt(info[0]);
        int end = Integer.parseInt(info[1]);

        search(start, end);
        bw.flush();


    }
}
