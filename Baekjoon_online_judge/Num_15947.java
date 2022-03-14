import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
       int num = Integer.parseInt(br.readLine());

       int rep = num / 14;
       int res = num % 14;

       if( res == 1 ){
           bw.write("baby");
       } else if ( res == 2 || res == 0){
           bw.write("sukhwan");
       } else if ( res == 5){
           bw.write("very");
       } else if ( res == 6){
           bw.write("cute");
       } else if ( res == 9){
           bw.write("in");
       } else if ( res == 10){
           bw.write("bed");
       } else if ( res == 13){
           bw.write( "baby");
       } else if ( res == 3 || res == 7 || res == 11){
           if(rep+2 < 5) {
               bw.write("tururu");
               for (int i = 0; i < rep; i++) {
                   bw.write("ru");
               }
           } else {
               bw.write("tu+ru*" + (rep+2) + "");
           }
       } else {
           if(rep+1 < 5) {
               bw.write("turu");
               for (int i = 0; i < rep; i++) {
                   bw.write("ru");
               }
           }else {
               bw.write("tu+ru*" + (rep+1) + "");
           }
       }

       bw.flush();
    }
}
