import java.io.*;

public class Main {
    String[][] box;

    public static void main(String args[]) throws IOException  {
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
        BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));
        Main m = new Main();

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            int input = Integer.parseInt(br.readLine());
            m.JBox(input);

            m.print();

            System.out.println();

        }
    }

     void JBox(int n){
        box = new String[n+1][n+1];

        for(int i = 1; i < n+1; i++){
            for(int j = 1; j < n+1; j++){
                if( i == 1 || j == 1 || i == n || j == n){
                    box[i][j] = "#";
                } else {
                    box[i][j] = "J";
                }
            }
        }
    }

    void print(){
        for(int i = 1; i < box.length; i++){
            for(int j = 1; j < box[0].length; j++){
                System.out.print(box[i][j]);
            }
            System.out.println();
        }
    }

}
