import java.io.*;

public class Main{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));


    public static void main(String args[]) throws IOException {
        String info = br.readLine();
        String[] infoArr = info.split(" ");

        int numOfCards = Integer.parseInt(infoArr[0]);
        int maxNum = Integer.parseInt(infoArr[1]);
        int max = 0;
        int sum = 0;

        info = br.readLine();
        infoArr = info.split(" ");

        int[] card = new int[numOfCards];

        for(int i = 0; i < card.length; i++){
            card[i] = Integer.parseInt(infoArr[i]);
        }


        for(int i = 0; i < card.length - 2; i++){
            for(int j = i+1; j < card.length-1; j++){
                for(int k = j+1; k < card.length; k++){
                    sum = card[i] + card[j] + card[k];

                    if (sum <= maxNum && sum >= max ){
                        max = sum;
                    }

                }
            }
        }

        bw.write(max + "");
        bw.flush();


    }
}


