import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));

    public static void main(String args[]) throws IOException {
        HashSet<Character> set ;
        String input;
        String[] inputArr;

        char check;
        int count;
        int wordLen;
        boolean isGroup;
        int group = 0;

        count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            set = new HashSet<>();
            check = 0;
            wordLen = 0;
            isGroup = true;

            input = br.readLine();

            wordLen = input.length();

            for(int j = 1; j < wordLen; j++){
                check = input.charAt(j-1);
                set.add(check);
                char inspec = input.charAt(j);
                if(inspec != check && !set.contains(inspec)){
                    set.add(inspec);
                }else if (inspec != check && set.contains(inspec)){
                    isGroup = false;
                } else if (inspec == check && set.contains(inspec)){
                }

            }

            if(isGroup == true){
                group++;
            }
        }

        bw.write(group + " ");
        bw.flush();

    }
}


