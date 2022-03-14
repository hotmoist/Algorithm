import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out));
		
		int count = 0;
		boolean noOv = false;
		String input = br.readLine();
		
		String[] arr = (input.split(" "));
		
		long A = Long.parseLong(arr[0]);
		long B = Long.parseLong(arr[1]);
		long C = Long.parseLong(arr[2]);
		
		while(true) {
			if (B > C || B == C) {
				bw.write(-1 + "");
				bw.flush();
				noOv = true;
				break;
			}
			
			if ((C * count) > A + (B*count) ) {
				break;
			} else   {
				count++;
			}
			
		}
		if(!noOv) {
			bw.write(count + "");
		}
		bw.flush();
	
 	}
}
