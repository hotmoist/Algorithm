import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		String[] array = s.split(" ");
		char tmp;
		
		char[] arrayA = array[0].toCharArray();
		char[] arrayB = array[1].toCharArray();
		
		tmp = arrayA[0];
		arrayA[0] = arrayA[2];
		arrayA[2] = tmp;
		
		tmp = arrayB[0];
		arrayB[0] = arrayB[2];
		arrayB[2] = tmp;
		
		String strA = new String(arrayA);
		String strB = new String(arrayB);
		
		int A = Integer.parseInt(strA);
		int B = Integer.parseInt(strB);
		
		if( A > B ){
			bw.write(A + "");
		} else {
			bw.write(B + "");
		}
		
		bw.flush();
			
		
	
	}
	
}


