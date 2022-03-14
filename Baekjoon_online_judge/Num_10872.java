import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main{
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		
		int n = Integer.parseInt(s);
		
		bw.write(fact(n) + "");
		bw.flush();
	
		
	}
	
	public static int fact(int num) {
		if (num == 1) {
			return 1;
		} 
		if (num == 0) {
			return 1;
		}
		else {
			return num * fact(num - 1);
		}
	}
}
