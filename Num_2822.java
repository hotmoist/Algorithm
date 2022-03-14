import java.io.*;
import java.util.*;

class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for( int i = 1; i <= 8; i++ ){
            int a =Integer.parseInt(br.readLine());
            list1.add(a);
            list2.add(a);
        }

        Collections.sort(list2);

        
        int count = 0;

        for(int i = 3; i < 8; i++){
            count += list2.get(i);
        }

        bw.write(count + "\n");

        int[] temp = new int[5];

        for(int i = 3; i < 8; i++){
           temp[i-3] = list1.indexOf(list2.get(i))+1;
        }

        Arrays.sort(temp);

        for(int i : temp){
            bw.write(i + " ");
        }
        
        bw.flush();
    }
}

