import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int rep = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < rep ; i++) {
			String s = br.readLine();
			String[] ar = s.split(" ");
			
			int multi = Integer.parseInt(ar[0]);
			String word = ar[1];
			
			for(int j = 0; j < word.length(); j++) {
				for(int k = 0; k < multi; k++) {
					bw.write(word.charAt(j) + "");
				}
			}
			
			bw.write("\n");
		}
		
		bw.flush();
	}
}

