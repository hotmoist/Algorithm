import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
        BufferedWriter bw = new BufferedWriter ( new OutputStreamWriter( System.out));

        String info = br.readLine();
        String[] infoArr = info.split(" ");
        int coinNum = 0;

        int coinType = Integer.parseInt(infoArr[0]);
        int price = Integer.parseInt(infoArr[1]);

        int[] coinValue = new int[coinType];
        for(int i = 0; i < coinType ; i++){
            coinValue[i] = Integer.parseInt(br.readLine());
        }

        for(int i = coinType-1; price != 0; i--  ){
            int tmp = price / coinValue[i];
            if (tmp == 0){
                continue;
            }

            coinNum += tmp;
            price -= coinValue[i] * tmp;
        }

        bw.write(coinNum + "");
        bw.flush();
    }
}
