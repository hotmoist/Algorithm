import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String args[]) throws IOException {
        String input = br.readLine();
        char[] word = input.toCharArray();
        int size = word.length;
        int alph = word.length;

        for(int i = 0; i < size-1; i++){
            if(word[i] == 'c' && (word[i+1] == '=' || word[i+1] == '-')){
                alph--;
                i += 1;
            } else if( word[i] == 'd'  && word[i+1] == '-'){
                alph--;
                i += 1;
            } else if (word[i] == 'd' && i < size -2 && word[i+1] == 'z' && word[i+2] == '='){
                alph -= 2;
                i+= 2;
            } else if ( word[i] == 'l' && word[i+1] == 'j'){
                alph--;
                i += 1;
            } else if ( word[i] == 'n' && word[i+1] == 'j'){
                alph--;
                i += 1;
            } else if ( word[i] == 's' && word [i+1] == '='){
                alph--;
                i += 1;
            } else if ( word[i] == 'z' && ((i > 1 && word[i-1] != 'd')||( i == 0 )) && word[i+1] == '='){
                alph--;
                i += 1;
            }
        }

        bw.write(alph + "");
        bw.flush();
    }
}

