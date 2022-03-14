import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader (System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter ( System.out));
		
		String s = br.readLine();
		int time = 0;
		
		for(int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case 'A' : time += 3; break;
			case 'B' : time += 3; break;
			case 'C' : time += 3; break;
			
			case 'D' : time += 4; break; 
			case 'E' : time += 4; break; 
			case 'F' : time += 4; break; 
			
			case 'G' : time += 5; break;
			case 'H' : time += 5; break;
			case 'I' : time += 5; break;
			
			case 'J' : time += 6; break;
			case 'K' : time += 6; break;
			case 'L' : time += 6; break;
			
			case 'M' : time += 7; break;
			case 'N' : time += 7; break;
			case 'O' : time += 7; break;
			
			case 'P' : time += 8; break;
			case 'Q' : time += 8; break;
			case 'R' : time += 8; break;
			case 'S' : time += 8; break;
			
			case 'T' : time += 9; break;
			case 'U' : time += 9; break;
			case 'V' : time += 9; break;
			
			case 'W' : time += 10; break;
			case 'X' : time += 10; break;
			case 'Y' : time += 10; break;
			case 'Z' : time += 10; break;
			}
		}
		
		bw.write(time + "");
		bw.flush();
		
		
	}
	
}
